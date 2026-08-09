package com.jarvisdev.models;

public class SoftwareResult {

    private final String name;
    private final boolean installed;
    private final String version;

    public SoftwareResult(String name, boolean installed, String version) {
        this.name = name;
        this.installed = installed;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public boolean isInstalled() {
        return installed;
    }

    public String getVersion() {
        return version;
    }
}
