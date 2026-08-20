package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

public interface Plugin {

    String getName();

    boolean canHandle(Command command);

    void execute(Command command);
}