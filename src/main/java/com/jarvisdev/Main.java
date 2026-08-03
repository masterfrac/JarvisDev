package com.jarvisdev;

import com.jarvisdev.scanner.SystemScanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("        JARVISDEV AI");
        System.out.println("================================");

        SystemScanner scanner = new SystemScanner();

        scanner.scanSystem();
    }
}