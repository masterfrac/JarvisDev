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
    public void install() {

        System.out.println("Installing JDK...");
        System.out.println("⚠ Manual installation required.");
    }

    @Override
    public String getToolName() {

        return "JDK";
    }

    @Override
    public String getDownloadLink() {

        return DownloadLinks.JDK;
    }
}