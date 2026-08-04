package com.jarvisdev.scanner.software;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SoftwareScanner {

    public void scanSoftware() {

        System.out.println("\n========== Software ==========\n");

        checkJava();
    }

    private void checkJava() {

        try {

            Process process = Runtime.getRuntime().exec("java -version");

            BufferedReader error =
                    new BufferedReader(new InputStreamReader(process.getErrorStream()));

            String version = error.readLine();

            if (version != null) {
                System.out.println("Java : " + version);
            } else {
                System.out.println("Java : Not Installed");
            }

        } catch (Exception e) {
            System.out.println("Java : Not Installed");
        }
    }
}