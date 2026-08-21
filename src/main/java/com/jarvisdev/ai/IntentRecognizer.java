package com.jarvisdev.ai;

public class IntentRecognizer {

    public Command recognize(String input) {

        System.out.println(
                "[DEBUG] IntentRecognizer received: "
                        + input
        );

        Command command = new Command();

        command.setRawInput(input);

        if (input == null || input.trim().isEmpty()) {

            command.setIntent(IntentType.UNKNOWN);

            return command;
        }

        String text = input.trim().toLowerCase();

        // ==============================
        // PROJECT GENERATION
        // ==============================

        if (text.contains("create")
                || text.contains("build")
                || text.contains("generate")
                || text.contains("make")) {

            command.setIntent(
                    IntentType.PROJECT_GENERATION
            );

            System.out.println(
                    "[DEBUG] Intent detected: "
                            + command.getIntent()
            );

            // Spring Boot
            if (text.contains("spring")
                    || text.contains("spring boot")
                    || text.contains("backend")
                    || text.contains("api")) {

                command.setProjectType("spring");
            }

            // React
            else if (text.contains("react")) {

                command.setProjectType("react");
            }

            // Web
            else if (text.contains("website")
                    || text.contains("web app")
                    || text.contains("html")) {

                command.setProjectType("web");
            }

            // Console
            else if (text.contains("console")) {

                command.setProjectType("console");
            }

            return command;
        }

        // ==============================
        // TOOL CHECK
        // ==============================

        if (text.contains("check tools")
                || text.contains("check tool")
                || text.equals("tools")) {

            command.setIntent(
                    IntentType.TOOL_CHECK
            );

            return command;
        }

        // ==============================
        // SYSTEM SCAN
        // ==============================

        if (text.contains("system scan")
                || text.contains("scan system")) {

            command.setIntent(
                    IntentType.SYSTEM_SCAN
            );

            return command;
        }

        // ==============================
        // HELP
        // ==============================

        if (text.equals("help")
                || text.contains("what can you do")
                || text.contains("commands")) {

            command.setIntent(
                    IntentType.HELP
            );

            return command;
        }

        // ==============================
        // EXIT
        // ==============================

        if (text.equals("exit")
                || text.equals("quit")
                || text.equals("bye")) {

            command.setIntent(
                    IntentType.EXIT
            );

            return command;
        }

        // ==============================
        // UNKNOWN
        // ==============================

        command.setIntent(
                IntentType.UNKNOWN
        );

        return command;
    }
}