package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

public class MavenPlugin implements Plugin {

    @Override
    public String getName() {
        return "MavenPlugin";
    }

    @Override
    public void execute(Command command) {

        System.out.println(
                "[MAVEN] Generating pom.xml..."
        );
    }
}