package com.jarvisdev.analysis;

import java.util.ArrayList;
import java.util.List;

public class ProjectAnalyzer {

    public AnalysisResult analyze(String input) {

        AnalysisResult result = new AnalysisResult();

        if (input == null || input.trim().isEmpty()) {
            return result;
        }

        String text = input.toLowerCase();

        // -----------------------------
        // Detect project type
        // -----------------------------

        if (text.contains("spring")
                || text.contains("spring boot")
                || text.contains("backend")
                || text.contains("api")) {

            result.setProjectType("spring");
        }

        else if (text.contains("react")
                || text.contains("frontend")) {

            result.setProjectType("react");
        }

        else if (text.contains("website")
                || text.contains("web app")
                || text.contains("html")) {

            result.setProjectType("web");
        }

        else if (text.contains("console")) {

            result.setProjectType("console");
        }

        // -----------------------------
        // Detect database
        // -----------------------------

        if (text.contains("mysql")) {

            result.setDatabase("mysql");
            result.addPlugin("DatabasePlugin");
        }

        else if (text.contains("postgres")
                || text.contains("postgresql")) {

            result.setDatabase("postgresql");
            result.addPlugin("DatabasePlugin");
        }

        else if (text.contains("mongodb")
                || text.contains("mongo")) {

            result.setDatabase("mongodb");
            result.addPlugin("DatabasePlugin");
        }

        // -----------------------------
        // Detect Docker
        // -----------------------------

        if (text.contains("docker")
                || text.contains("container")) {

            result.addPlugin("DockerPlugin");
        }

        // -----------------------------
        // Detect Git
        // -----------------------------

        if (text.contains("git")
                || text.contains("github")) {

            result.addPlugin("GitPlugin");
        }

        // -----------------------------
        // Spring plugins
        // -----------------------------

        if ("spring".equalsIgnoreCase(
                result.getProjectType())) {

            result.addPlugin("SpringPlugin");
            result.addPlugin("MavenPlugin");
        }

        // -----------------------------
        // React plugins
        // -----------------------------

        if ("react".equalsIgnoreCase(
                result.getProjectType())) {

            result.addPlugin("ReactPlugin");
            result.addPlugin("GitPlugin");
        }

        return result;
    }
}