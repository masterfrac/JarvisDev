package com.jarvisdev.generator;

public class ProjectTemplate {

    private String projectName;
    private String projectType;

    public ProjectTemplate(String projectName, String projectType) {
        this.projectName = projectName;
        this.projectType = projectType;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectType() {
        return projectType;
    }
}