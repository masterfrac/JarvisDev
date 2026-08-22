package com.jarvisdev.plugins;

import java.util.HashMap;
import java.util.Map;

public class PluginManager {

    private final Map<String, Plugin> plugins =
            new HashMap<>();

    public PluginManager() {

        register(new SpringPlugin());
        register(new ReactPlugin());
        register(new MavenPlugin());
        register(new GitPlugin());
        register(new DockerPlugin());
    }

    private void register(Plugin plugin) {

        plugins.put(
                plugin.getName().toLowerCase(),
                plugin
        );
    }

    public Plugin getPlugin(String name) {

        return plugins.get(
                name.toLowerCase()
        );
    }
}