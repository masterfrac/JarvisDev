package com.jarvisdev.scanner.system;

import com.jarvisdev.models.SystemInfo;

public class SystemInfoScanner {

    public SystemInfo scanSystemInfo() {

        SystemInfo info = new SystemInfo();

        info.setOsName(System.getProperty("os.name"));

        info.setOsVersion(System.getProperty("os.version"));

        info.setArchitecture(System.getProperty("os.arch"));

        info.setJavaVersion(System.getProperty("java.version"));

        info.setUserName(System.getProperty("user.name"));

        info.setJavaVendor(System.getProperty("java.vendor"));

        info.setJavaHome(System.getProperty("java.home"));

        info.setUserHome(System.getProperty("user.home"));

        info.setComputerName(System.getenv("COMPUTERNAME"));

        return info;
    }
}