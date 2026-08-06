package com.jarvisdev.models;

public class SoftwareInfo {

    private final String name;
    private final String command;

    public SoftwareInfo(String name, String command) {
        this.name = name;
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public String getCommand() {
        return command;
    }
}