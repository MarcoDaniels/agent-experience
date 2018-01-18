package com.agent.experience;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class Configuration extends ResourceConfig {

    public Configuration() {
        packages("com.agent.experience");
    }
}
