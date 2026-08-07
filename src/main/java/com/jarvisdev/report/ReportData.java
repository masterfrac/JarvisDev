package com.jarvisdev.report;

import com.jarvisdev.analysis.HealthReport;
import com.jarvisdev.models.HardwareInfo;
import com.jarvisdev.models.SystemInfo;

public class ReportData {

    private HardwareInfo hardwareInfo;
    private SystemInfo systemInfo;
    private HealthReport healthReport;

    public HardwareInfo getHardwareInfo() {
        return hardwareInfo;
    }

    public void setHardwareInfo(HardwareInfo hardwareInfo) {
        this.hardwareInfo = hardwareInfo;
    }

    public SystemInfo getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(SystemInfo systemInfo) {
        this.systemInfo = systemInfo;
    }

    public HealthReport getHealthReport() {
        return healthReport;
    }

    public void setHealthReport(HealthReport healthReport) {
        this.healthReport = healthReport;
    }
}