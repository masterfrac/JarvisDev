package com.jarvisdev.generator.templates;

import java.io.File;

public class SpringBootTemplate {

    public void create(File projectFolder) {

        new File(projectFolder,
                "src/main/java").mkdirs();

        new File(projectFolder,
                "src/main/resources").mkdirs();

        new File(projectFolder,
                "src/test/java").mkdirs();

        System.out.println(
                "Spring Boot project created."
        );
    }
}