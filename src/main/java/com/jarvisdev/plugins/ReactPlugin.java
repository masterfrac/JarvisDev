package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

public class ReactPlugin implements Plugin {

    @Override
    public String getName() {
        return "ReactPlugin";
    }

    @Override
    public void execute(Command command) {

        System.out.println(
                "[REACT] Generating React application..."
        );
    }
}