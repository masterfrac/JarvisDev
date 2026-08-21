package com.jarvisdev.ai;

public class CommandEngine {

    public void execute(Command command) {

        if (command == null) {

            System.out.println(
                    "Command cannot be null."
            );

            return;
        }

        if (command.getIntent() == null) {

            System.out.println(
                    "Unable to determine command intent."
            );

            return;
        }

        switch (command.getIntent()) {

            case PROJECT_GENERATION:

                System.out.println(
                        "Creating project: "
                                + command.getProjectName()
                );

                System.out.println(
                        "Project type: "
                                + command.getProjectType()
                );

                break;

            case TOOL_CHECK:

                System.out.println(
                        "Checking tools..."
                );

                break;

            case SYSTEM_SCAN:

                System.out.println(
                        "Scanning system..."
                );

                break;

            case HELP:

                System.out.println(
                        "Showing available commands..."
                );

                break;

            case EXIT:

                System.out.println(
                        "Exiting JarvisDev..."
                );

                break;

            case UNKNOWN:

            default:

                System.out.println(
                        "I don't understand that command."
                );
        }
    }
}