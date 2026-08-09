package com.jarvisdev.scanner;

import com.jarvisdev.analysis.HealthAnalyzer;
import com.jarvisdev.analysis.HealthReport;
import com.jarvisdev.models.HardwareInfo;
import com.jarvisdev.models.SystemInfo;
import com.jarvisdev.report.ReportData;
import com.jarvisdev.scanner.application.ApplicationScanner;
import com.jarvisdev.scanner.hardware.HardwareScanner;
import com.jarvisdev.scanner.software.SoftwareScanner;
import com.jarvisdev.scanner.system.SystemInfoScanner;
import com.jarvisdev.utils.DashboardPrinter;

public class SystemScanner {

    public void scanSystem() {

        // Hardware
        HardwareScanner hardwareScanner = new HardwareScanner();
        HardwareInfo hardwareInfo = hardwareScanner.scanHardware();

        DashboardPrinter.printHardware(hardwareInfo);

        // System
        SystemInfoScanner systemInfoScanner = new SystemInfoScanner();
        SystemInfo systemInfo = systemInfoScanner.scanSystemInfo();

        DashboardPrinter.printSystem(systemInfo);

        // Health Analysis
        HealthAnalyzer analyzer = new HealthAnalyzer();

        HealthReport report =
                analyzer.analyze(hardwareInfo, systemInfo);

        DashboardPrinter.printHealth(report);

        // Software
        new SoftwareScanner().scanSoftware();

        // Applications
        new ApplicationScanner().scanApplications();



    }
}