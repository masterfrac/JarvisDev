package com.jarvisdev.ai.execution;

import java.util.List;

public class ExecutionEngine {

    public void executePlan(List<String> tasks) {

        if (tasks == null || tasks.isEmpty()) {

            System.out.println(
                    "No tasks available for execution."
            );

            return;
        }

        System.out.println();
        System.out.println("===== EXECUTION ENGINE =====");

        for (String task : tasks) {

            System.out.println(
                    "[RUNNING] " + task
            );

            executeTask(task);

            System.out.println(
                    "[DONE] " + task
            );

            System.out.println();
        }

        System.out.println(
                "===== EXECUTION COMPLETE ====="
        );
    }

    private void executeTask(String task) {

        try {

            Thread.sleep(200);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            System.out.println(
                    "Execution interrupted."
            );
        }
    }
}