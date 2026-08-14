package com.jarvisdev.plugins;

public class MavenPlugin implements Plugin {

    @Override
    public String getName() {
        return "Maven Plugin";
    }

    @Override
    public void execute() {

        System.out.println(
                "Maven Plugin Executed"
        );
    }
}