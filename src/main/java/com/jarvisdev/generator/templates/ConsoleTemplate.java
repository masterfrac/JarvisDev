package com.jarvisdev.generator.templates;

import java.io.File;

public class ConsoleTemplate {

    public void create(File projectFolder) {

        new File(projectFolder, "src").mkdir();

        System.out.println("Console project created.");
    }
}