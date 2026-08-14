package com.jarvisdev.plugins;

public class SpringPlugin implements Plugin {

    @Override
    public String getName() {
        return "Spring Plugin";
    }

    @Override
    public void execute() {

        System.out.println(
                "Spring Plugin Executed"
        );
    }
}