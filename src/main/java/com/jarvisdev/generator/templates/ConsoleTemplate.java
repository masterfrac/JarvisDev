package com.jarvisdev.generator.templates;

import java.io.File;

public class ConsoleTemplate {

    public void create(File projectDir) {

        File srcFolder = new File(projectDir, "src");

        if (!srcFolder.exists()) {
            srcFolder.mkdirs();
        }

        System.out.println("Console project created.");
    }
}