package com.jarvisdev;

import com.jarvisdev.ai.Command;
import com.jarvisdev.ai.CommandEngine;
import com.jarvisdev.ai.IntentRecognizer;
import com.jarvisdev.ai.IntentType;
import com.jarvisdev.ai.execution.PluginSelector;
import com.jarvisdev.plugins.Plugin;
import com.jarvisdev.plugins.PluginManager;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IntentRecognizer recognizer =
                new IntentRecognizer();

        CommandEngine commandEngine =
                new CommandEngine();

        PluginSelector pluginSelector =
                new PluginSelector();

        PluginManager pluginManager =
                new PluginManager();

        System.out.println("===== JARVISDEV AI =====");

        while (true) {

            System.out.print("Command: ");

            String input =
                    scanner.nextLine();

            Command command =
                    recognizer.recognize(input);

            System.out.println();
            System.out.println("===== UNDERSTANDING =====");

            System.out.println(
                    "Intent: "
                            + command.getIntent()
            );

            System.out.println(
                    "Project Type: "
                            + command.getProjectType()
            );

            // Execute normal command
            commandEngine.execute(command);

            // Plugin Selection
            List<String> plugins =
                    pluginSelector.selectPlugins(command);

            if (!plugins.isEmpty()) {

                System.out.println();
                System.out.println(
                        "===== SELECTED PLUGINS ====="
                );

                for (String pluginName : plugins) {

                    System.out.println(
                            "- " + pluginName
                    );
                }

                System.out.println();
                System.out.println(
                        "===== EXECUTING PLUGINS ====="
                );

                for (String pluginName : plugins) {

                    Plugin plugin =
                            pluginManager.getPlugin(pluginName);

                    if (plugin != null) {

                        plugin.execute(command);

                    } else {

                        System.out.println(
                                "Plugin not found: "
                                        + pluginName
                        );
                    }
                }
            }

            if (command.getIntent()
                    == IntentType.EXIT) {

                break;
            }

            System.out.println();
        }

        scanner.close();

        System.out.println();
        System.out.println(
                "JarvisDev stopped."
        );
    }
}