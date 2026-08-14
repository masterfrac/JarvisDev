package com.jarvisdev;

import com.jarvisdev.ai.Command;
import com.jarvisdev.ai.CommandEngine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =
                new Scanner(System.in);

        System.out.println(
                "===== JARVISDEV AI ====="
        );

        System.out.print(
                "Command: "
        );

        String input =
                scanner.nextLine();

        Command command =
                new Command(input);

        CommandEngine engine =
                new CommandEngine();

        engine.execute(command);
    }
}