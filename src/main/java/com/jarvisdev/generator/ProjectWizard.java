package com.jarvisdev.generator;

import java.util.Scanner;

public class ProjectWizard {

    public ProjectTemplate start() {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("===== PROJECT WIZARD =====");
        System.out.println();

        System.out.print("Project Name: ");
        String projectName = scanner.nextLine();

        System.out.print("Project Type: ");
        String projectType = scanner.nextLine();

        return new ProjectTemplate(
                projectName,
                projectType
        );
    }
}