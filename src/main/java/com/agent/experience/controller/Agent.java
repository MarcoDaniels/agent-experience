package com.agent.experience.controller;

import com.agent.experience.model.Experience;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;

@Component
@Path("/agent/experience")
@Produces(MediaType.APPLICATION_JSON)
public class Agent {

    @GET
    public List<Experience> listExperience() {

        Experience ex1 = new Experience();
        ex1.company_name = "guloggratis";
        Experience ex2 = new Experience();
        ex2.company_name = "softexpert";

        List<Experience> list = new LinkedList<>();
        list.add(ex1);
        list.add(ex2);

        return list;
    }
}
