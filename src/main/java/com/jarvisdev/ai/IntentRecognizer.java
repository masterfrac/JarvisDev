package com.jarvisdev.ai;

public class IntentRecognizer {

    public Command recognize(String input) {

        String text = input.toLowerCase();

        Command command = new Command();

        command.setRawInput(input);

        // Detect Intent
        if (text.contains("create")) {

            command.setIntent(
                    IntentType.PROJECT_GENERATION
            );

            // Detect Project Type
            if (text.contains("spring")) {
                command.setProjectType("spring");
            }
            else if (text.contains("web")) {
                command.setProjectType("web");
            }
            else {
                command.setProjectType("console");
            }

            // Detect Project Name
            String[] words =
                    text.split(" ");

            if (words.length > 0) {

                command.setProjectName(
                        words[words.length - 1]
                );
            }

            return command;
        }

        if (text.contains("check tools")) {

            command.setIntent(
                    IntentType.TOOL_CHECK
            );

            return command;
        }

        command.setIntent(
                IntentType.UNKNOWN
        );

        return command;
    }
}