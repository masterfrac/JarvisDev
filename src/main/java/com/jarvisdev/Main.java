package com.jarvisdev;

import com.jarvisdev.scanner.SystemScanner;
import com.jarvisdev.utils.ConsoleUI;

public class Main {

    public static void main(String[] args) {

        ConsoleUI.printHeader();

        SystemScanner scanner = new SystemScanner();
        scanner.scanSystem();

        ConsoleUI.printFooter();
    }
}