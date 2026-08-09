package com.jarvisdev.utils;

public class ConsoleUI {

    private static final String BORDER =
            "════════════════════════════════════════════════════════════════════";

    private static final String SEPARATOR =
            "────────────────────────────────────────────────────────────────────";

    public static void printHeader() {

        System.out.println();

        System.out.println("╔" + BORDER + "╗");
        System.out.printf("║%68s║%n", "");
        System.out.printf("║%30sJARVISDEV AI v0.5%21s║%n", "", "");
        System.out.printf("║%68s║%n", "");
        System.out.println("╚" + BORDER + "╝");
    }

    public static void printSection(String title) {

        System.out.println();
        System.out.println(title.toUpperCase());
        System.out.println(SEPARATOR);
    }

    public static void printKeyValue(String key, String value) {

        System.out.printf("%-22s : %s%n", key, value);
    }

    public static void printSuccess(String text) {

        System.out.println("✔ " + text);
    }

    public static void printWarning(String text) {

        System.out.println("⚠ " + text);
    }

    public static void printError(String text) {

        System.out.println("✖ " + text);
    }

    public static void printFooter() {

        System.out.println();
        System.out.println(SEPARATOR);
        System.out.println("JarvisDev Scan Completed Successfully");
        System.out.println(SEPARATOR);
    }
}