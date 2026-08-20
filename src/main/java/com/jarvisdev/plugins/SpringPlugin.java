package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

public class SpringPlugin
        implements Plugin {

    @Override
    public String getName() {

        return "Spring Plugin";
    }

    @Override
    public boolean canHandle(
            Command command) {

        return "spring".equalsIgnoreCase(
                command.getProjectType()
        );
    }

    @Override
    public void execute(
            Command command) {

        System.out.println(
                "Generating Spring Boot Project: "
                        + command.getProjectName()
        );
    }
}