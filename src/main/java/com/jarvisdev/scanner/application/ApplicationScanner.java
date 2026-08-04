package com.jarvisdev.scanner.application;

import java.io.File;

public class ApplicationScanner {

    public void scanApplications() {

        System.out.println("\n========== Applications ==========\n");

        String user = System.getProperty("user.name");

        checkApplication(
                "IntelliJ IDEA",
                new String[] {
                        "C:\\Program Files\\JetBrains",
                        "C:\\Program Files (x86)\\JetBrains",
                        "C:\\Users\\" + user + "\\AppData\\Local\\Programs\\JetBrains",
                        "C:\\Users\\" + user + "\\AppData\\Local\\JetBrains",
                        "C:\\Users\\" + user + "\\AppData\\Local\\JetBrains\\Toolbox"
                }
        );
    }

    private void checkApplication(String name, String[] paths) {

        for (String path : paths) {

            File file = new File(path);

            if (file.exists()) {

                System.out.printf("%-18s : Installed%n", name);
                return;
            }
        }

        System.out.printf("%-18s : Not Installed%n", name);
    }
}