package com.agent.experience.controller;

import com.agent.experience.model.Repository;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/agent/wakeup")
@Produces(MediaType.APPLICATION_JSON)
public class Wakeup {

    @GET
    public WakeupStatus awake() {
        return new WakeupStatus() {
            {
                awake = true;
                options = new Options() {
                    {
                        type = "info";
                        field = "company_name";
                    }
                };
                countExperiences = new Repository().listExperience().size();
            }
        };
    }

    private class Options {
        public String type;
        public String field;
    }

    private class WakeupStatus {
        public boolean awake;
        public Options options;
        public int countExperiences;
    }
}
