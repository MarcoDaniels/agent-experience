package com.agent.experience.controller;

import com.agent.experience.model.Experience;
import com.agent.experience.model.Repository;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/agent/experience")
@Produces(MediaType.APPLICATION_JSON)
public class Agent {

    @GET
    public List<Experience> listExperience() {
        return new Repository().listExperience();
    }

    @GET
    @Path("/{name}")
    public Experience getExperience(@PathParam("name") String name) {
        return new Repository().getExperience(name);
    }
}
