package com.jarvisdev.generator.templates;

import java.io.File;

public class WebTemplate {

    public void create(File projectFolder) {

        new File(projectFolder, "src").mkdir();
        new File(projectFolder, "css").mkdir();
        new File(projectFolder, "js").mkdir();

        System.out.println("Web project created.");
    }
}