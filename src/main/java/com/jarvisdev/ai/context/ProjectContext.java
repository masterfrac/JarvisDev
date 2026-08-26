package com.jarvisdev.ai.context;

import com.jarvisdev.ai.Command;
import java.util.ArrayList;
import java.util.List;

public class ProjectContext {

    private Command command;

    private final List<String> requirements =
            new ArrayList<>();

    private final List<String> selectedPlugins =
            new ArrayList<>();

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public List<String> getRequirements() {
        return requirements;
    }

    public List<String> getSelectedPlugins() {
        return selectedPlugins;
    }
}