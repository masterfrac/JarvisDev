package com.jarvisdev.ai.context;

public class ContextManager {

    private String currentProject;
    private String currentProjectType;
    private String lastCommand;

    public ContextManager() {
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }

    public String getCurrentProjectType() {
        return currentProjectType;
    }

    public void setCurrentProjectType(String currentProjectType) {
        this.currentProjectType = currentProjectType;
    }

    public String getLastCommand() {
        return lastCommand;
    }

    public void setLastCommand(String lastCommand) {
        this.lastCommand = lastCommand;
    }

    public void clearContext() {

        currentProject = null;
        currentProjectType = null;
        lastCommand = null;
    }

    public void printContext() {

        System.out.println("\n===== JARVIS CONTEXT =====");

        System.out.println(
                "Current Project : "
                        + currentProject
        );

        System.out.println(
                "Project Type    : "
                        + currentProjectType
        );

        System.out.println(
                "Last Command    : "
                        + lastCommand
        );
    }
}