package com.jarvisdev.ai.planning;

import com.jarvisdev.ai.Command;
import com.jarvisdev.ai.IntentType;

import java.util.ArrayList;
import java.util.List;

public class TaskPlanner {

    public List<String> createPlan(Command command) {

        List<String> tasks = new ArrayList<>();

        if (command.getIntent() ==
                IntentType.PROJECT_GENERATION) {

            tasks.add("Create Project");

            if ("spring".equals(
                    command.getProjectType())) {

                tasks.add("Generate Controller");
                tasks.add("Generate Service");
                tasks.add("Generate Repository");
                tasks.add("Generate README");
            }
        }

        return tasks;
    }
}