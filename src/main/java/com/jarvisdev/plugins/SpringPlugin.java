package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

public class SpringPlugin implements Plugin {

    @Override
    public String getName() {
        return "SpringPlugin";
    }

    @Override
    public void execute(Command command) {

        System.out.println(
                "[SPRING] Generating Spring Boot application..."
        );
    }
}