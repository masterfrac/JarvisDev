package com.jarvisdev.ai.orchestrator;

import com.jarvisdev.ai.Command;
import com.jarvisdev.ai.CommandEngine;
import com.jarvisdev.ai.IntentRecognizer;
import com.jarvisdev.ai.Planning.TaskPlanner;
import com.jarvisdev.ai.entity.EntityExtractor;
import com.jarvisdev.ai.execution.ExecutionEngine;
import com.jarvisdev.analysis.ProjectAnalyzer;

import java.util.List;

public class AIOrchestrator {

    private final IntentRecognizer recognizer;
    private final EntityExtractor entityExtractor;
    private final ProjectAnalyzer analyzer;
    private final TaskPlanner planner;
    private final ExecutionEngine executionEngine;
    private final CommandEngine commandEngine;

    public AIOrchestrator() {

        recognizer = new IntentRecognizer();
        entityExtractor = new EntityExtractor();
        analyzer = new ProjectAnalyzer();
        planner = new TaskPlanner();
        executionEngine = new ExecutionEngine();
        commandEngine = new CommandEngine();
    }

    public void process(String input) {

        System.out.println();
        System.out.println("================================");
        System.out.println("       JARVIS AI PROCESSING");
        System.out.println("================================");

        // --------------------------------
        // 1. Recognize Intent
        // --------------------------------

        Command command =
                recognizer.recognize(input);

        if (command == null) {

            System.out.println(
                    "Unable to understand command."
            );

            return;
        }

        // --------------------------------
        // 2. Store Raw Input
        // --------------------------------

        command.setRawInput(input);

        // --------------------------------
        // 3. Extract Entities
        // --------------------------------

        entityExtractor.extract(
                input,
                command
        );

        // --------------------------------
        // 4. Display Understanding
        // --------------------------------

        System.out.println();
        System.out.println("===== UNDERSTANDING =====");

        System.out.println(
                "Input       : "
                        + input
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

        // --------------------------------
        // 5. Analyze Project
        // --------------------------------

        analyzer.analyze(input);

        // --------------------------------
        // 6. Generate Plan
        // --------------------------------

        List<String> plan =
                planner.createPlan(command);

        System.out.println();
        System.out.println("===== AI PLAN =====");

        if (plan.isEmpty()) {

            System.out.println(
                    "No execution plan generated."
            );

            return;
        }

        int step = 1;

        for (String task : plan) {

            System.out.println(
                    step + ". " + task
            );

            step++;
        }

        // --------------------------------
        // 7. Execute Plan
        // --------------------------------

        executionEngine.executePlan(
                plan
        );

        // --------------------------------
        // 8. Command Engine
        // --------------------------------

        System.out.println();
        System.out.println("===== COMMAND ENGINE =====");

        commandEngine.execute(
                command
        );

        System.out.println();
        System.out.println("================================");
        System.out.println("       JARVIS TASK COMPLETE");
        System.out.println("================================");
    }
}