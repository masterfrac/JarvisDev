package com.jarvisdev.ai.execution;

import java.util.List;

public class ExecutionEngine {

    public void executePlan(List<String> tasks) {

        System.out.println("\n===== EXECUTION =====");

        for (String task : tasks) {

            System.out.println("[RUNNING] " + task);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("[DONE] " + task);
        }

        System.out.println("\nExecution Finished");
    }
}