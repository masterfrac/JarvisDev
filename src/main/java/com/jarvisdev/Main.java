package com.jarvisdev;

import com.jarvisdev.installer.InstallerManager;

public class Main {

    public static void main(String[] args) {

        InstallerManager manager =
                new InstallerManager();

        manager.checkTools();
    }
}