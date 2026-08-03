package com.jarvisdev.scanner;

public class SystemScanner {

    public void scanSystem() {

        System.out.println("================================");
        System.out.println("Scanning Your Computer...");
        System.out.println("================================");

        System.out.println("Operating System : " + System.getProperty("os.name"));
        System.out.println("OS Version       : " + System.getProperty("os.version"));
        System.out.println("Java Version     : " + System.getProperty("java.version"));
        System.out.println("Java Vendor      : " + System.getProperty("java.vendor"));
        System.out.println("User             : " + System.getProperty("user.name"));
        System.out.println("Home Directory   : " + System.getProperty("user.home"));

    }
}