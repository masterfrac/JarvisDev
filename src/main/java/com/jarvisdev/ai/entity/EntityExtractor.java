package com.jarvisdev.ai.entity;

import com.jarvisdev.ai.Command;

public class EntityExtractor {

    public void extract(
            String input,
            Command command) {

        input = input.toLowerCase();

        if (input.contains("spring")) {
            command.setProjectType("spring");
        }

        else if (input.contains("web")) {
            command.setProjectType("web");
        }

        else if (input.contains("console")) {
            command.setProjectType("console");
        }

        String[] words =
                input.split(" ");

        if (words.length > 0) {

            command.setProjectName(
                    words[words.length - 1]
            );
        }
    }
}