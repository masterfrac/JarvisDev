package com.jarvisdev.utils;

public class ConsoleUI {

    private static final String LINE =
            "════════════════════════════════════════════════════════════════════";

    private static final String SECTION =
            "────────────────────────────────────────────────────────────────────";

    public static void printHeader() {

        System.out.println();
        System.out.println("╔" + LINE + "╗");
        System.out.printf("║%-68s║%n", "                 JARVISDEV AI v0.5");
        System.out.println("╚" + LINE + "╝");
    }

    public static void printSection(String title) {

        System.out.println();
        System.out.println(title.toUpperCase());
        System.out.println(SECTION);
    }

    public static void printKeyValue(String key, String value) {

        System.out.printf("%-22s : %s%n", key, value);
    }

    public static void printInstalled(String name, boolean installed) {

        String status = installed ? "✔ Installed" : "✖ Not Installed";

        System.out.printf("%-22s : %s%n", name, status);
    }

    public static void printFooter() {

        System.out.println();
        System.out.println(LINE);
        System.out.println("Scan Completed Successfully");
        System.out.println(LINE);
    }
}