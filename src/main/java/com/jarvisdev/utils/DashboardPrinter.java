package com.jarvisdev.utils;

import com.jarvisdev.analysis.HealthReport;
import com.jarvisdev.models.HardwareInfo;
import com.jarvisdev.models.SystemInfo;

public class DashboardPrinter {

    public static void printHardware(HardwareInfo info) {

        ConsoleUI.printSection("Hardware");

        ConsoleUI.printKeyValue(
                "CPU Cores",
                String.valueOf(info.getCpuCores())
        );

        ConsoleUI.printKeyValue(
                "Total Memory",
                info.getTotalMemory() + " MB"
        );

        ConsoleUI.printKeyValue(
                "Free Memory",
                info.getFreeMemory() + " MB"
        );

        ConsoleUI.printKeyValue(
                "Max Memory",
                info.getMaxMemory() + " MB"
        );

        long usedMemory = info.getTotalMemory() - info.getFreeMemory();

        ConsoleUI.printKeyValue(
                "RAM Usage",
                ProgressBar.create(
                        usedMemory,
                        info.getTotalMemory()
                )
        );

        ConsoleUI.printKeyValue(
                "Disk Size",
                info.getTotalDisk() + " GB"
        );

        ConsoleUI.printKeyValue(
                "Free Disk",
                info.getFreeDisk() + " GB"
        );

        long usedDisk = info.getTotalDisk() - info.getFreeDisk();

        ConsoleUI.printKeyValue(
                "Disk Usage",
                ProgressBar.create(
                        usedDisk,
                        info.getTotalDisk()
                )
        );
    }

    public static void printSystem(SystemInfo info) {

        ConsoleUI.printSection("System");

        ConsoleUI.printKeyValue(
                "Computer Name",
                info.getComputerName()
        );

        ConsoleUI.printKeyValue(
                "Operating System",
                info.getOsName()
        );

        ConsoleUI.printKeyValue(
                "OS Version",
                info.getOsVersion()
        );

        ConsoleUI.printKeyValue(
                "Architecture",
                info.getArchitecture()
        );

        ConsoleUI.printKeyValue(
                "Java Version",
                info.getJavaVersion()
        );

        ConsoleUI.printKeyValue(
                "Java Vendor",
                info.getJavaVendor()
        );

        ConsoleUI.printKeyValue(
                "Current User",
                info.getUserName()
        );

        ConsoleUI.printKeyValue(
                "User Home",
                info.getUserHome()
        );

        ConsoleUI.printKeyValue(
                "Java Home",
                info.getJavaHome()
        );
    }

    public static void printHealth(HealthReport report) {

        ConsoleUI.printSection("System Health");

        ConsoleUI.printKeyValue(
                "Health Score",
                report.getScore() + " / 100"
        );

        ConsoleUI.printKeyValue(
                "Status",
                report.getStatus()
        );

        System.out.println();

        System.out.println("Recommendations");
        System.out.println("--------------------------------");

        if (report.getRecommendations().isEmpty()) {

            System.out.println("✔ No recommendations.");

        } else {

            for (String recommendation : report.getRecommendations()) {

                System.out.println("• " + recommendation);
            }
        }
    }
}