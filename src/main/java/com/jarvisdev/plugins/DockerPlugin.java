package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

public class DockerPlugin implements Plugin {

    @Override
    public String getName() {
        return "DockerPlugin";
    }

    @Override
    public void execute(Command command) {

        System.out.println(
                "[DOCKER] Generating Docker configuration..."
        );
    }
}