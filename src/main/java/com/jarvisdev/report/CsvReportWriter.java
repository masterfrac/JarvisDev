package com.jarvisdev.report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvReportWriter {

    public void generateReport(ReportData reportData) {

        try {

            File folder = new File("reports");

            if (!folder.exists()) {
                folder.mkdir();
            }

            FileWriter writer =
                    new FileWriter("reports/system-report.csv");

            writer.write("Property,Value\n");

            writer.write("Computer Name,"
                    + reportData.getSystemInfo().getComputerName() + "\n");

            writer.write("Operating System,"
                    + reportData.getSystemInfo().getOsName() + "\n");

            writer.write("OS Version,"
                    + reportData.getSystemInfo().getOsVersion() + "\n");

            writer.write("CPU Cores,"
                    + reportData.getHardwareInfo().getCpuCores() + "\n");

            writer.write("Total Memory (MB),"
                    + reportData.getHardwareInfo().getTotalMemory() + "\n");

            writer.write("Free Memory (MB),"
                    + reportData.getHardwareInfo().getFreeMemory() + "\n");

            writer.write("Disk Size (GB),"
                    + reportData.getHardwareInfo().getTotalDisk() + "\n");

            writer.write("Free Disk (GB),"
                    + reportData.getHardwareInfo().getFreeDisk() + "\n");

            writer.write("Health Score,"
                    + reportData.getHealthReport().getScore() + "\n");

            writer.write("Health Status,"
                    + reportData.getHealthReport().getStatus() + "\n");

            writer.close();

            System.out.println(
                    "CSV Report Generated: reports/system-report.csv"
            );

        } catch (IOException e) {

            System.out.println(
                    "Failed to generate CSV report"
            );

            e.printStackTrace();
        }
    }
}