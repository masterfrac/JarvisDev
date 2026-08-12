package com.jarvisdev.installer;

public class JdkInstaller implements ToolInstaller {

    @Override
    public boolean isInstalled() {

        try {

            Process process =
                    Runtime.getRuntime()
                            .exec("java -version");

            return process != null;

        } catch (Exception e) {

            return false;
        }
    }

    @Override
    public String getToolName() {

        return "JDK";
    }
}