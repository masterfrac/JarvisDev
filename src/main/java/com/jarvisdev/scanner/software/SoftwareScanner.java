package com.jarvisdev.scanner.software;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SoftwareScanner {

    public void scanSoftware() {

        System.out.println("\n========== Software ==========\n");
        checkSoftware("Maven", "mvn -version");
        checkSoftware("Python", "python --version");
        checkSoftware("Java", "java -version");
        checkSoftware("Git", "git --version");
    }

    private void checkSoftware(String name, String command) {

        try {

            Process process = Runtime.getRuntime().exec(command);

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getErrorStream()));

            String output = reader.readLine();

            if (output == null) {

                reader = new BufferedReader(
                        new InputStreamReader(process.getInputStream()));

                output = reader.readLine();
            }

            if (output != null) {
                System.out.printf("%-12s : %s%n", name, output);
            } else {
                System.out.printf("%-12s : Installed%n", name);
            }

        } catch (Exception e) {

            System.out.printf("%-12s : Not Installed%n", name);
        }
    }
}