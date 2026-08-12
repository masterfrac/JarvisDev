package com.jarvisdev.installer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GitInstaller implements ToolInstaller {

    @Override
    public boolean isInstalled() {

        try {

            Process process =
                    Runtime.getRuntime()
                            .exec("git --version");

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    process.getInputStream()
                            )
                    );

            return reader.readLine() != null;

        } catch (Exception e) {

            return false;
        }
    }

    @Override
    public String getToolName() {

        return "Git";
    }
}