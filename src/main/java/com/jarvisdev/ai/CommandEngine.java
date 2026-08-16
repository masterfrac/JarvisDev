package com.jarvisdev.ai;

import com.jarvisdev.generator.ProjectGenerator;
import com.jarvisdev.generator.ProjectTemplate;
import com.jarvisdev.generator.ProjectWizard;
import com.jarvisdev.installer.InstallerManager;
import com.jarvisdev.scanner.SystemScanner;

public class CommandEngine {

    private final IntentRecognizer recognizer =
            new IntentRecognizer();

    public void execute(Command command) {

        IntentType intent =
                recognizer.recognize(
                        command.getInput()
                );

        switch (intent) {

            case SYSTEM_SCAN:

                new SystemScanner()
                        .scanSystem();
                break;

            case TOOL_CHECK:

                new InstallerManager()
                        .checkTools();
                break;

            case PROJECT_GENERATION:

                ProjectWizard wizard =
                        new ProjectWizard();

                ProjectTemplate template =
                        wizard.start();

                new ProjectGenerator()
                        .generate(template);

                break;

            case HELP:

                System.out.println("""
                        
                        Examples:
                        
                        Scan my laptop
                        Check if Maven is installed
                        Create a Spring Boot project
                        Generate a web application
                        Exit
                        
                        """);
                break;

            case EXIT:

                System.out.println(
                        "Goodbye from JarvisDev AI"
                );

                System.exit(0);

            default:

                System.out.println(
                        "Sorry, I didn't understand that."
                );
        }
    }
}