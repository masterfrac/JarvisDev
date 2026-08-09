package com.jarvisdev.report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtReportWriter {

    public void generateReport(ReportData reportData) {

        try {

            File folder = new File("reports");

            if (!folder.exists()) {
                folder.mkdir();
            }

            FileWriter writer =
                    new FileWriter("reports/system-report.txt");

            writer.write("=====================================\n");
            writer.write("         JARVISDEV AI REPORT\n");
            writer.write("=====================================\n\n");

            writer.write("SYSTEM INFORMATION\n");
            writer.write("------------------------------\n");

            writer.write("Computer Name : "
                    + reportData.getSystemInfo().getComputerName() + "\n");

            writer.write("Operating System : "
                    + reportData.getSystemInfo().getOsName() + "\n");

            writer.write("OS Version : "
                    + reportData.getSystemInfo().getOsVersion() + "\n");

            writer.write("Architecture : "
                    + reportData.getSystemInfo().getArchitecture() + "\n");

            writer.write("Java Version : "
                    + reportData.getSystemInfo().getJavaVersion() + "\n");

            writer.write("\n");

            writer.write("HARDWARE\n");
            writer.write("------------------------------\n");

            writer.write("CPU Cores : "
                    + reportData.getHardwareInfo().getCpuCores() + "\n");

            writer.write("Total Memory : "
                    + reportData.getHardwareInfo().getTotalMemory()
                    + " MB\n");

            writer.write("Free Memory : "
                    + reportData.getHardwareInfo().getFreeMemory()
                    + " MB\n");

            writer.write("Disk Size : "
                    + reportData.getHardwareInfo().getTotalDisk()
                    + " GB\n");

            writer.write("Free Disk : "
                    + reportData.getHardwareInfo().getFreeDisk()
                    + " GB\n");

            writer.write("\n");

            writer.write("SYSTEM HEALTH\n");
            writer.write("------------------------------\n");

            writer.write("Score : "
                    + reportData.getHealthReport().getScore()
                    + "/100\n");

            writer.write("Status : "
                    + reportData.getHealthReport().getStatus()
                    + "\n\n");

            writer.write("Recommendations\n");
            writer.write("------------------------------\n");

            if (reportData.getHealthReport()
                    .getRecommendations().isEmpty()) {

                writer.write("No recommendations.\n");

            } else {

                for (String recommendation :
                        reportData.getHealthReport().getRecommendations()) {

                    writer.write("- " + recommendation + "\n");
                }
            }

            writer.close();

            System.out.println();
            System.out.println("✔ Report generated successfully.");
            System.out.println("Location : reports/system-report.txt");

        } catch (IOException e) {

            System.out.println("Failed to generate report.");
            e.printStackTrace();
        }
    }
}
