package com.jarvisdev;

import com.jarvisdev.generator.ProjectGenerator;
import com.jarvisdev.generator.ProjectTemplate;
import com.jarvisdev.generator.ProjectWizard;
import com.jarvisdev.installer.InstallerManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== JARVISDEV AI =====");
        System.out.println("1. Tool Checker");
        System.out.println("2. Project Generator");
        System.out.print("Choice: ");

        int choice = scanner.nextInt();

        if (choice == 1) {

            InstallerManager manager =
                    new InstallerManager();

            manager.checkTools();

        } else if (choice == 2) {

            ProjectWizard wizard =
                    new ProjectWizard();

            ProjectTemplate template =
                    wizard.start();

            ProjectGenerator generator =
                    new ProjectGenerator();

            generator.generate(template);
        }
    }
}