package com.jarvisdev.installer;

public interface ToolInstaller {

    boolean isInstalled();

    void install();

    String getToolName();
}