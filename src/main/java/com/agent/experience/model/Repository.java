package com.agent.experience.model;

import java.util.LinkedList;
import java.util.List;

public class Repository implements IRepository {

    private List<Experience> experiences = new LinkedList<>();

    public Repository() {
        // create some static data
        Experience first = new Experience() {
            {
                id = "1";
                position = "Web Developer";
                company_name = "GulogGratis.dk";
                start_date = "September 2013";
                end_date = "today";
                location = "Odense, Denmark";
                description = "Web Developer @ GulogGratis.dk A/S";
            }
        };
        Experience second = new Experience() {
            {
                id = "2";
                position = "Software Developer";
                company_name = "SoftExpert";
                start_date = "October 2011";
                end_date = "October 2012";
                location = "Joinvile, Brazil";
                description = "Software Developer @ SoftExpert";
            }
        };

        experiences.add(first);
        experiences.add(second);
    }

    @Override
    public List<Experience> listExperience() {
        return experiences;
    }

    @Override
    public Experience getExperience(String name) {
        // filter by name and get the correct one
        return experiences.get(0);
        //return ex;
    }
}
