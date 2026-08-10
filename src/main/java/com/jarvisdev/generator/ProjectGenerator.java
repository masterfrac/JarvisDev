package com.jarvisdev.generator;

public class ProjectGenerator {

    public void generate(ProjectTemplate template) {

        System.out.println();
        System.out.println("==================================");
        System.out.println("Generating Project...");
        System.out.println("Project Name : " + template.getProjectName());
        System.out.println("Project Type : " + template.getProjectType());
        System.out.println("==================================");
    }
}