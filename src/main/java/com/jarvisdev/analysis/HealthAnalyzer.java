package com.jarvisdev.analysis;

import com.jarvisdev.models.HardwareInfo;
import com.jarvisdev.models.SystemInfo;

public class HealthAnalyzer {

    public HealthReport analyze(HardwareInfo hardware,
                                SystemInfo system) {

        HealthReport report = new HealthReport();

        int score = 100;

        // RAM

        long usedMemory =
                hardware.getTotalMemory() - hardware.getFreeMemory();

        double memoryPercent =
                (usedMemory * 100.0) / hardware.getTotalMemory();

        if (memoryPercent > 90) {

            score -= 20;

            report.addRecommendation(
                    "High RAM usage. Close unnecessary applications."
            );

        } else if (memoryPercent > 75) {

            score -= 10;

            report.addRecommendation(
                    "RAM usage is moderate."
            );
        }

        // Disk

        long usedDisk =
                hardware.getTotalDisk() - hardware.getFreeDisk();

        double diskPercent =
                (usedDisk * 100.0) / hardware.getTotalDisk();

        if (diskPercent > 90) {

            score -= 20;

            report.addRecommendation(
                    "Disk is almost full. Free some storage."
            );

        } else if (diskPercent > 75) {

            score -= 10;

            report.addRecommendation(
                    "Disk usage is getting high."
            );
        }

        // Java

        if (system.getJavaVersion() == null ||
                system.getJavaVersion().isEmpty()) {

            score -= 20;

            report.addRecommendation(
                    "Java installation not detected."
            );
        }

        report.setScore(score);

        if (score >= 90) {

            report.setStatus("Excellent");

        } else if (score >= 75) {

            report.setStatus("Good");

        } else if (score >= 50) {

            report.setStatus("Average");

        } else {

            report.setStatus("Poor");
        }

        return report;
    }
}