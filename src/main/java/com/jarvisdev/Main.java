package com.jarvisdev;

import com.jarvisdev.generator.ProjectGenerator;
import com.jarvisdev.generator.ProjectTemplate;
import com.jarvisdev.generator.ProjectWizard;

public class Main {

    public static void main(String[] args) {

        ProjectWizard wizard =
                new ProjectWizard();

        ProjectTemplate template =
                wizard.start();

        ProjectGenerator generator =
                new ProjectGenerator();

        generator.generate(template);
    }
}