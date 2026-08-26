package com.jarvisdev.ai.entity;

import com.jarvisdev.ai.Command;

public class EntityExtractor {

    public void extract(Command command) {

        String input = command.getRawInput();

        if (input == null || input.isBlank()) {
            return;
        }

        String lower = input.toLowerCase();

        String[] words = lower.split("\\s+");

        for (String word : words) {

            if (word.equals("create")
                    || word.equals("spring")
                    || word.equals("boot")
                    || word.equals("backend")
                    || word.equals("frontend")
                    || word.equals("project")
                    || word.equals("with")
                    || word.equals("mysql")
                    || word.equals("docker")
                    || word.equals("react")
                    || word.equals("maven")) {
                continue;
            }

            command.setProjectName(word);
            break;
        }

        if (lower.contains("spring")) {
            command.setFramework("Spring Boot");
        }

        if (lower.contains("mysql")) {
            command.setDatabase("MySQL");
        }

        if (lower.contains("docker")) {
            command.setContainer("Docker");
        }

        if (lower.contains("react")) {
            command.setFrontend("React");
        }

        if (lower.contains("maven")) {
            command.setBuildTool("Maven");
        }
    }
}