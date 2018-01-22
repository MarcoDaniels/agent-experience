package com.agent.experience.model;

import java.util.List;

public interface IRepository {

    public List<Experience> listExperience();
    public Experience getExperience(String name);
}
