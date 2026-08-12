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
        System.out.println("===== TOOL CHECKER =====");

        for (ToolInstaller tool : tools) {

            String status =
                    tool.isInstalled()
                            ? "Installed"
                            : "Missing";

            System.out.printf(
                    "%-10s : %s%n",
                    tool.getToolName(),
                    status
            );
        }
    }
}