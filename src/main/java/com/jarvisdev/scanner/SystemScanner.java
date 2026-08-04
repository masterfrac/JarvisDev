package com.jarvisdev.scanner;
import com.jarvisdev.scanner.software.SoftwareScanner;
import com.jarvisdev.models.HardwareInfo;
import com.jarvisdev.scanner.hardware.HardwareScanner;
import com.jarvisdev.scanner.application.ApplicationScanner;
public class SystemScanner {

    public void scanSystem() {

        HardwareScanner hardwareScanner = new HardwareScanner();

        HardwareInfo info = hardwareScanner.scanHardware();

        System.out.println();
        System.out.println("========== Hardware ==========");

        System.out.println("CPU Cores      : " + info.getCpuCores());

        System.out.println("Total Memory   : " + info.getTotalMemory() + " MB");

        System.out.println("Free Memory    : " + info.getFreeMemory() + " MB");

        System.out.println("Max Memory     : " + info.getMaxMemory() + " MB");

        System.out.println("Disk Size      : " + info.getTotalDisk() + " GB");

        System.out.println("Free Disk      : " + info.getFreeDisk() + " GB");


        SoftwareScanner softwareScanner = new SoftwareScanner();

        softwareScanner.scanSoftware();
        ApplicationScanner applicationScanner = new ApplicationScanner();

        applicationScanner.scanApplications();
    }
}