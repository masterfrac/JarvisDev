package com.jarvisdev.installer;

import java.util.List;

public class InstallerManager {

    public void checkTools() {

        List<ToolInstaller> tools = List.of(
                new GitInstaller(),
                new MavenInstaller(),
                new JdkInstaller()
        );

        System.out.println();
        System.out.println(
                "===== TOOL CHECKER ====="
        );
        System.out.println();

        for (ToolInstaller tool : tools) {

            if (tool.isInstalled()) {

                System.out.println(
                        "✅ " + tool.getToolName()
                                + " Installed"
                );

            } else {

                System.out.println(
                        "❌ " + tool.getToolName()
                                + " Missing"
                );

                tool.install();
            }
        }
    }
}