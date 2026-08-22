package com.jarvisdev.ai.entity;

import com.jarvisdev.ai.Command;

public class EntityExtractor {

    public void extract(Command command) {

        String input = command.getRawInput();

        if (input == null || input.isBlank()) {
            return;
        }

        String[] words = input.split("\\s+");

        for (String word : words) {

            String w = word.toLowerCase();

            if (w.equals("create")
                    || w.equals("spring")
                    || w.equals("boot")
                    || w.equals("project")
                    || w.equals("backend")
                    || w.equals("frontend")
                    || w.equals("with")
                    || w.equals("mysql")
                    || w.equals("docker")) {
                continue;
            }

            command.setProjectName(word);
            break;
        }

        System.out.println(
                "[ENTITY] Project Name = "
                        + command.getProjectName()
        );
    }
}