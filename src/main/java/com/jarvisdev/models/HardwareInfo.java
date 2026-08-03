package com.jarvisdev.models;

public class HardwareInfo {

    private int cpuCores;
    private long totalMemory;
    private long freeMemory;
    private long maxMemory;
    private long totalDisk;
    private long freeDisk;

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(long totalMemory) {
        this.totalMemory = totalMemory;
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(long freeMemory) {
        this.freeMemory = freeMemory;
    }

    public long getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(long maxMemory) {
        this.maxMemory = maxMemory;
    }

    public long getTotalDisk() {
        return totalDisk;
    }

    public void setTotalDisk(long totalDisk) {
        this.totalDisk = totalDisk;
    }

    public long getFreeDisk() {
        return freeDisk;
    }

    public void setFreeDisk(long freeDisk) {
        this.freeDisk = freeDisk;
    }
}