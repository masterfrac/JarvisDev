package com.jarvisdev.report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonReportWriter {

    public void generateReport(ReportData reportData) {

        try {

            File folder = new File("reports");

            if (!folder.exists()) {
                folder.mkdir();
            }

            FileWriter writer =
                    new FileWriter("reports/system-report.json");

            writer.write("{\n");

            writer.write("  \"system\": {\n");
            writer.write("    \"computerName\": \"" +
                    reportData.getSystemInfo().getComputerName() + "\",\n");

            writer.write("    \"osName\": \"" +
                    reportData.getSystemInfo().getOsName() + "\",\n");

            writer.write("    \"osVersion\": \"" +
                    reportData.getSystemInfo().getOsVersion() + "\"\n");

            writer.write("  },\n");

            writer.write("  \"hardware\": {\n");

            writer.write("    \"cpuCores\": " +
                    reportData.getHardwareInfo().getCpuCores() + ",\n");

            writer.write("    \"totalMemory\": " +
                    reportData.getHardwareInfo().getTotalMemory() + ",\n");

            writer.write("    \"freeMemory\": " +
                    reportData.getHardwareInfo().getFreeMemory() + ",\n");

            writer.write("    \"totalDisk\": " +
                    reportData.getHardwareInfo().getTotalDisk() + ",\n");

            writer.write("    \"freeDisk\": " +
                    reportData.getHardwareInfo().getFreeDisk() + "\n");

            writer.write("  },\n");

            writer.write("  \"health\": {\n");

            writer.write("    \"score\": " +
                    reportData.getHealthReport().getScore() + ",\n");

            writer.write("    \"status\": \"" +
                    reportData.getHealthReport().getStatus() + "\"\n");

            writer.write("  }\n");

            writer.write("}");

            writer.close();

            System.out.println(
                    "JSON Report Generated: reports/system-report.json"
            );

        } catch (IOException e) {

            System.out.println(
                    "Failed to generate JSON report"
            );

            e.printStackTrace();
        }
    }
}