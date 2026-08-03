
package com.jarvisdev.scanner.hardware;

import com.jarvisdev.models.HardwareInfo;
import com.sun.management.OperatingSystemMXBean;

import java.io.File;
import java.lang.management.ManagementFactory;

public class HardwareScanner {

    public HardwareInfo scanHardware() {

        // Get Operating System information
        OperatingSystemMXBean osBean =
                (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        // Create HardwareInfo object
        HardwareInfo info = new HardwareInfo();

        // CPU Information
        info.setCpuCores(osBean.getAvailableProcessors());

        // Physical Memory (RAM)
        info.setTotalMemory(osBean.getTotalMemorySize() / (1024L * 1024));
        info.setFreeMemory(osBean.getFreeMemorySize() / (1024L * 1024));

        // For now, keep Max Memory equal to Total Physical Memory
        info.setMaxMemory(osBean.getTotalMemorySize() / (1024L * 1024));

        // Disk Information
        File[] roots = File.listRoots();

        if (roots.length > 0) {
            File disk = roots[0];

            info.setTotalDisk(disk.getTotalSpace() / (1024L * 1024 * 1024));

            info.setFreeDisk(disk.getFreeSpace() / (1024L * 1024 * 1024));
        }

        return info;
    }
}