package com.jarvisdev.generator.templates;

import java.io.File;

public class WebTemplate {

    public void create(File projectDir) {

        File srcFolder = new File(projectDir, "src");
        File publicFolder = new File(projectDir, "public");

        srcFolder.mkdirs();
        publicFolder.mkdirs();

        System.out.println("Web project created.");
    }
}