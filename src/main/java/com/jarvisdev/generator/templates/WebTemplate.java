package com.jarvisdev.generator.templates;

import java.io.File;

public class WebTemplate implements ProjectTemplate {

    @Override
    public void generate(File projectDir) {

        new File(projectDir, "src").mkdirs();
        new File(projectDir, "public").mkdirs();

        System.out.println("Web project created.");
    }
}