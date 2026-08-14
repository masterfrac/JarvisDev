package com.jarvisdev.plugins;

import java.util.ArrayList;
import java.util.List;

public class PluginManager {

    private final List<Plugin> plugins =
            new ArrayList<>();

    public void loadPlugins() {

        plugins.add(new GitPlugin());
        plugins.add(new MavenPlugin());
        plugins.add(new SpringPlugin());
    }

    public void runPlugins() {

        for (Plugin plugin : plugins) {

            System.out.println(
                    "Loading: "
                            + plugin.getName()
            );

            plugin.execute();

            System.out.println();
        }
    }
}