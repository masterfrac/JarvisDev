package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

public class MavenPlugin implements Plugin {

    @Override
    public String getName() {
        return "Maven Plugin";
    }

    @Override
    public boolean canHandle(Command command) {
        return true;
    }

    @Override
    public void execute(Command command) {
        System.out.println("Executing Maven operations...");
    }
}