package com.jarvisdev.plugins;

public class GitPlugin implements Plugin {

    @Override
    public String getName() {
        return "Git Plugin";
    }

    @Override
    public void execute() {

        System.out.println(
                "Git Plugin Executed"
        );
    }
}