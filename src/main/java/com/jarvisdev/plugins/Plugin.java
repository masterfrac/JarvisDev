package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

public interface Plugin {

    String getName();

    void execute(Command command);
}