package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

public class GitPlugin implements Plugin {

    @Override
    public String getName() {
        return "Git Plugin";
    }

    @Override
    public boolean canHandle(Command command) {
        return true;
    }

    @Override
    public void execute(Command command) {
        System.out.println("Executing Git operations...");
    }
}