package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

public class GitPlugin implements Plugin {

    @Override
    public String getName() {
        return "GitPlugin";
    }

    @Override
    public void execute(Command command) {

        System.out.println(
                "[GIT] Initializing Git repository..."
        );
    }
}