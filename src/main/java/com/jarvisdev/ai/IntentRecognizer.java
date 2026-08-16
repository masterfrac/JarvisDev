package com.jarvisdev.ai;

public class IntentRecognizer {

    public IntentType recognize(String input) {

        input = input.toLowerCase();

        if (input.contains("scan")
                || input.contains("system")
                || input.contains("computer")
                || input.contains("laptop")
                || input.contains("machine")) {

            return IntentType.SYSTEM_SCAN;
        }

        if (input.contains("maven")
                || input.contains("git")
                || input.contains("jdk")
                || input.contains("java")
                || input.contains("tool")) {

            return IntentType.TOOL_CHECK;
        }

        if (input.contains("project")
                || input.contains("application")
                || input.contains("app")
                || input.contains("generate")
                || input.contains("create")) {

            return IntentType.PROJECT_GENERATION;
        }

        if (input.contains("help")) {
            return IntentType.HELP;
        }

        if (input.contains("exit")
                || input.contains("quit")
                || input.contains("bye")) {

            return IntentType.EXIT;
        }

        return IntentType.UNKNOWN;
    }
}
