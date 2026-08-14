package com.jarvisdev.ai;

import com.jarvisdev.generator.ProjectGenerator;
import com.jarvisdev.generator.ProjectTemplate;
import com.jarvisdev.generator.ProjectWizard;
import com.jarvisdev.installer.InstallerManager;

public class CommandEngine {

    public void execute(Command command) {

        String input =
                command.getInput().toLowerCase();

        if (input.contains("tools")) {

            InstallerManager manager =
                    new InstallerManager();

            manager.checkTools();

        } else if (input.contains("project")) {

            ProjectWizard wizard =
                    new ProjectWizard();

            ProjectTemplate template =
                    wizard.start();

            ProjectGenerator generator =
                    new ProjectGenerator();

            generator.generate(template);

        } else {

            System.out.println(
                    "Unknown Command"
            );
        }
    }
}