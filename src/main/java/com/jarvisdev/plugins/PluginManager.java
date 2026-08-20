package com.jarvisdev.plugins;

import com.jarvisdev.ai.Command;

import java.util.ArrayList;
import java.util.List;

public class PluginManager {

    private final List<Plugin> plugins;

    public PluginManager() {

        plugins = new ArrayList<>();
    }

    public void registerPlugin(
            Plugin plugin) {

        plugins.add(plugin);
    }

    public void executePlugin(
            Command command) {

        for (Plugin plugin : plugins) {

            if (plugin.canHandle(command)) {

                System.out.println(
                        "Using Plugin: "
                                + plugin.getName()
                );

                plugin.execute(command);

                return;
            }
        }

        System.out.println(
                "No suitable plugin found."
        );
    }
}