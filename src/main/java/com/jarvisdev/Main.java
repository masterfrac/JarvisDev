package com.jarvisdev;

import com.jarvisdev.plugins.PluginManager;

public class Main {

    public static void main(String[] args) {

        PluginManager manager =
                new PluginManager();

        manager.loadPlugins();

        manager.runPlugins();
    }
}