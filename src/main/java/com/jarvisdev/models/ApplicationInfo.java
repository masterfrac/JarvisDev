package com.jarvisdev.models;

public class ApplicationInfo {

    private String name;

    private String[] paths;

    public ApplicationInfo(String name, String[] paths) {
        this.name = name;
        this.paths = paths;
    }

    public String getName() {
        return name;
    }

    public String[] getPaths() {
        return paths;
    }
}