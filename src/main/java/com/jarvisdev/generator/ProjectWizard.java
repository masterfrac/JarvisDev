package com.jarvisdev.generator;

import java.util.Scanner;

public class ProjectWizard {

    public ProjectTemplate start() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== PROJECT WIZARD =====");
        System.out.print("Project Name: ");

        String projectName = scanner.nextLine();

        System.out.println();
        System.out.println("1. Console App");
        System.out.println("2. Spring Boot");
        System.out.println("3. Web App");

        System.out.print("Choice: ");

        int choice = scanner.nextInt();

        String type = "console";

        switch (choice) {

            case 2:
                type = "spring";
                break;

            case 3:
                type = "web";
                break;
        }

        return new ProjectTemplate(
                projectName,
                type
        );
    }
}