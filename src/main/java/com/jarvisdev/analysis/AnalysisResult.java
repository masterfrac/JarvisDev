package com.jarvisdev.analysis;

import java.util.ArrayList;
import java.util.List;

public class AnalysisResult {

    private String projectType;
    private String database;

    private final List<String> plugins =
            new ArrayList<>();

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public List<String> getPlugins() {
        return plugins;
    }

    public void addPlugin(String plugin) {

        if (!plugins.contains(plugin)) {
            plugins.add(plugin);
        }
    }

    @Override
    public String toString() {

        return "AnalysisResult{" +
                "projectType='" + projectType + '\'' +
                ", database='" + database + '\'' +
                ", plugins=" + plugins +
                '}';
    }
}