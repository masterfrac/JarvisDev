package com.jarvisdev.scanner.application;

import com.jarvisdev.models.ApplicationInfo;

import java.io.File;
import java.util.List;

public class ApplicationScanner {

    public void scanApplications() {

        System.out.println("\n========== Applications ==========\n");

        String user = System.getProperty("user.name");

        List<ApplicationInfo> applications = List.of(

                new ApplicationInfo(
                        "IntelliJ IDEA",
                        new String[]{
                                "C:\\Program Files\\JetBrains",
                                "C:\\Program Files (x86)\\JetBrains",
                                "C:\\Users\\" + user + "\\AppData\\Local\\Programs\\JetBrains",
                                "C:\\Users\\" + user + "\\AppData\\Local\\JetBrains",
                                "C:\\Users\\" + user + "\\AppData\\Local\\JetBrains\\Toolbox"
                        }
                ),

                new ApplicationInfo(
                        "VS Code",
                        new String[]{
                                "C:\\Program Files\\Microsoft VS Code",
                                "C:\\Program Files (x86)\\Microsoft VS Code",
                                "C:\\Users\\" + user + "\\AppData\\Local\\Programs\\Microsoft VS Code"
                        }
                ),

                new ApplicationInfo(
                        "Google Chrome",
                        new String[]{
                                "C:\\Program Files\\Google\\Chrome",
                                "C:\\Program Files (x86)\\Google\\Chrome",
                                "C:\\Users\\" + user + "\\AppData\\Local\\Google\\Chrome"
                        }
                ),

                new ApplicationInfo(
                        "Mozilla Firefox",
                        new String[]{
                                "C:\\Program Files\\Mozilla Firefox",
                                "C:\\Program Files (x86)\\Mozilla Firefox",
                                "C:\\Users\\" + user + "\\AppData\\Local\\Mozilla Firefox"
                        }
                ),

                new ApplicationInfo(
                        "Android Studio",
                        new String[]{
                                "C:\\Program Files\\Android\\Android Studio",
                                "C:\\Users\\" + user + "\\AppData\\Local\\Android\\Android Studio"
                        }
                ),

                new ApplicationInfo(
                        "Eclipse IDE",
                        new String[]{
                                "C:\\Program Files\\Eclipse Adoptium",
                                "C:\\Program Files\\eclipse",
                                "C:\\eclipse"
                        }
                ),

                new ApplicationInfo(
                        "Microsoft Edge",
                        new String[]{
                                "C:\\Program Files (x86)\\Microsoft\\Edge",
                                "C:\\Program Files\\Microsoft\\Edge"
                        }
                ),

                new ApplicationInfo(
                        "Notepad++",
                        new String[]{
                                "C:\\Program Files\\Notepad++",
                                "C:\\Program Files (x86)\\Notepad++"
                        }
                ),

                new ApplicationInfo(
                        "GitHub Desktop",
                        new String[]{
                                "C:\\Users\\" + user + "\\AppData\\Local\\GitHubDesktop",
                                "C:\\Program Files\\GitHub Desktop"
                        }
                )
        );

        for (ApplicationInfo app : applications) {
            checkApplication(app.getName(), app.getPaths());
        }
    }

    private void checkApplication(String name, String[] paths) {

        for (String path : paths) {

            File file = new File(path);

            if (file.exists()) {
                System.out.printf("%-20s : Installed%n", name);
                return;
            }
        }

        System.out.printf("%-20s : Not Installed%n", name);
    }
}