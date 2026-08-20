package com.jarvisdev.ai.orchestrator;

import com.jarvisdev.ai.Command;
import com.jarvisdev.ai.IntentRecognizer;
import com.jarvisdev.ai.entity.EntityExtractor;
import com.jarvisdev.analysis.ProjectAnalyzer;
import com.jarvisdev.ai.Planning.TaskPlanner;

public class AIOrchestrator {

    private final IntentRecognizer recognizer;
    private final EntityExtractor extractor;
    private final ProjectAnalyzer analyzer;
    private final TaskPlanner planner;

    public AIOrchestrator() {

        recognizer = new IntentRecognizer();
        extractor = new EntityExtractor();
        analyzer = new ProjectAnalyzer();
        planner = new TaskPlanner();
    }

    public void process(String input) {

        Command command =
                recognizer.recognize(input);

        extractor.extract(
                input,
                command
        );

        System.out.println(
                "\n===== COMMAND ====="
        );

        System.out.println(
                "Intent      : "
                        + command.getIntent()
        );

        System.out.println(
                "Project Type: "
                        + command.getProjectType()
        );

        System.out.println(
                "Project Name: "
                        + command.getProjectName()
        );

        System.out.println(
                "\n===== PLAN ====="
        );

        planner.createPlan(command)
                .forEach(System.out::println);
    }
}