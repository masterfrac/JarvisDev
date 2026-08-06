package com.jarvisdev.scanner;

import com.jarvisdev.models.HardwareInfo;
import com.jarvisdev.models.SystemInfo;
import com.jarvisdev.scanner.application.ApplicationScanner;
import com.jarvisdev.scanner.hardware.HardwareScanner;
import com.jarvisdev.scanner.software.SoftwareScanner;
import com.jarvisdev.scanner.system.SystemInfoScanner;

public class SystemScanner {

    public void scanSystem() {

        // ================= Hardware =================

        HardwareScanner hardwareScanner = new HardwareScanner();

        HardwareInfo hardwareInfo = hardwareScanner.scanHardware();

        System.out.println();
        System.out.println("========== Hardware ==========");

        System.out.println("CPU Cores        : " + hardwareInfo.getCpuCores());

        System.out.println("Total Memory     : " + hardwareInfo.getTotalMemory() + " MB");

        System.out.println("Free Memory      : " + hardwareInfo.getFreeMemory() + " MB");

        System.out.println("Max Memory       : " + hardwareInfo.getMaxMemory() + " MB");

        System.out.println("Disk Size        : " + hardwareInfo.getTotalDisk() + " GB");

        System.out.println("Free Disk        : " + hardwareInfo.getFreeDisk() + " GB");


        // ================= System =================

        SystemInfoScanner systemInfoScanner = new SystemInfoScanner();

        SystemInfo systemInfo = systemInfoScanner.scanSystemInfo();

        System.out.println();
        System.out.println("========== System ==========");

        System.out.println("Computer Name    : " + systemInfo.getComputerName());

        System.out.println("Operating System : " + systemInfo.getOsName());

        System.out.println("OS Version       : " + systemInfo.getOsVersion());

        System.out.println("Architecture     : " + systemInfo.getArchitecture());

        System.out.println("Java Version     : " + systemInfo.getJavaVersion());

        System.out.println("Java Vendor      : " + systemInfo.getJavaVendor());

        System.out.println("Current User     : " + systemInfo.getUserName());

        System.out.println("User Home        : " + systemInfo.getUserHome());

        System.out.println("Java Home        : " + systemInfo.getJavaHome());


        // ================= Software =================

        SoftwareScanner softwareScanner = new SoftwareScanner();

        softwareScanner.scanSoftware();


        // ================= Applications =================

        ApplicationScanner applicationScanner = new ApplicationScanner();

        applicationScanner.scanApplications();
    }
}