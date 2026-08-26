package com.jarvisdev.ai.Planning;

import com.jarvisdev.ai.Command;

import java.util.ArrayList;
import java.util.List;

public class TaskPlanner {

    public List<String> createPlan(Command command) {

        List<String> tasks = new ArrayList<>();

        if (command == null) {
            return tasks;
        }

        tasks.add("Analyze Project Requirements");

        if (command.getProjectName() != null) {
            tasks.add(
                    "Create Project Structure: "
                            + command.getProjectName()
            );
        }

        if (command.getFramework() != null) {
            tasks.add(
                    "Configure "
                            + command.getFramework()
            );
        }

        if (command.getDatabase() != null) {
            tasks.add(
                    "Setup Database: "
                            + command.getDatabase()
            );
        }

        if (command.getContainer() != null) {
            tasks.add(
                    "Generate Container Config: "
                            + command.getContainer()
            );
        }

        if (command.getFrontend() != null) {
            tasks.add(
                    "Create Frontend: "
                            + command.getFrontend()
            );
        }

        if (command.getBuildTool() != null) {
            tasks.add(
                    "Configure Build Tool: "
                            + command.getBuildTool()
            );
        }

        tasks.add("Select Plugins");
        tasks.add("Execute Generation Pipeline");

        return tasks;
    }
}