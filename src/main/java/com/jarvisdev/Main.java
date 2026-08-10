package com.jarvisdev;

import com.jarvisdev.generator.ProjectGenerator;
import com.jarvisdev.generator.ProjectTemplate;

public class Main {

    public static void main(String[] args) {

        ProjectTemplate template =
                new ProjectTemplate(
                        "DemoProject",
                        "Java"
                );

        ProjectGenerator generator =
                new ProjectGenerator();

        generator.generate(template);
    }
}