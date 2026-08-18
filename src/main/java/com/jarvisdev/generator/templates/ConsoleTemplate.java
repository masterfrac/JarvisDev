package com.jarvisdev.generator.templates;

import java.io.File;

public class ConsoleTemplate implements ProjectTemplate {

    @Override
    public void generate(File projectDir) {

        File srcFolder = new File(projectDir, "src");
        srcFolder.mkdirs();

        System.out.println("Console project created.");
    }
}