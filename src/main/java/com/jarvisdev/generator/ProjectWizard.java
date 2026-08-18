package com.jarvisdev.generator;

import java.util.Scanner;

public class ProjectWizard {

    public ProjectTemplate start() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== PROJECT WIZARD =====");

        System.out.print("Project Name: ");
        String projectName = scanner.nextLine();

        System.out.println();
        System.out.println("Available Types:");
        System.out.println("- console");
        System.out.println("- spring boot");
        System.out.println("- web app");

        System.out.print("Project Type: ");

        String input =
                scanner.nextLine().toLowerCase();

        String type = "console";

        if (input.contains("spring")) {

            type = "spring";

        } else if (input.contains("web")) {

            type = "web";
        }

        return new ProjectTemplate(
                projectName,
                type
        );
    }
}