package com.jarvisdev.ai;

public class CommandEngine {

    public void execute(Command command) {

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
                        "Showing help..."
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
                        "Unknown command"
                );
        }
    }
}