package com.jarvisdev.ai.execution;

import com.jarvisdev.ai.Command;

import java.util.ArrayList;
import java.util.List;

public class PluginSelector {

    public List<String> selectPlugins(
            Command command) {

        List<String> plugins =
                new ArrayList<>();

        if(command == null) {
            return plugins;
        }

        String type =
                command.getProjectType();

        if(type == null) {
            return plugins;
        }

        if(type.equalsIgnoreCase("spring")) {

            plugins.add("SpringPlugin");
            plugins.add("MavenPlugin");
            plugins.add("GitPlugin");
        }

        else if(type.equalsIgnoreCase("react")) {

            plugins.add("ReactPlugin");
            plugins.add("GitPlugin");
        }

        else if(type.equalsIgnoreCase("docker")) {

            plugins.add("DockerPlugin");
        }

        return plugins;
    }
}