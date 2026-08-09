package com.jarvisdev.scanner.software;

import com.jarvisdev.models.SoftwareInfo;
import com.jarvisdev.repository.SoftwareRepository;
import com.jarvisdev.utils.ConsoleUI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class SoftwareScanner {

    public void scanSoftware() {

        ConsoleUI.printSection("Software");

        List<SoftwareInfo> softwareList = SoftwareRepository.getSoftwareList();

        for (SoftwareInfo software : softwareList) {
            checkSoftware(
                    software.getName(),
                    software.getCommand()
            );
        }
    }

    private void checkSoftware(String name, String command) {

        try {

            Process process = Runtime.getRuntime().exec(command);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getErrorStream()));

            String output = reader.readLine();

            if (output == null) {
                reader = new BufferedReader(
                        new InputStreamReader(process.getInputStream()));

                output = reader.readLine();
            }

            if (output != null) {
                System.out.printf("%-15s : %s%n", name, output);
            } else {
                System.out.printf("%-15s : Installed%n", name);
            }

        } catch (Exception e) {
            System.out.printf("%-15s : Not Installed%n", name);
        }
    }
}