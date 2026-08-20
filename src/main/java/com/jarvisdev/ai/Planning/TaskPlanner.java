package com.jarvisdev.ai.Planning;

import com.jarvisdev.ai.Command;

import java.util.ArrayList;
import java.util.List;

public class TaskPlanner {

    public List<String> createPlan(Command command) {

        List<String> tasks = new ArrayList<>();

        tasks.add("Analyze Command");
        tasks.add("Create Execution Plan");

        return tasks;
    }
}