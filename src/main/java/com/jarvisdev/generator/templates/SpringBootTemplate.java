package com.jarvisdev.generator.templates;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SpringBootTemplate {

    public void create(File projectFolder) {

        File basePackage =
                new File(projectFolder,
                        "src/main/java/com/example");

        File controllerFolder =
                new File(basePackage,
                        "controller");

        controllerFolder.mkdirs();

        new File(basePackage,
                "service").mkdirs();

        new File(basePackage,
                "repository").mkdirs();

        new File(basePackage,
                "model").mkdirs();

        new File(basePackage,
                "config").mkdirs();

        new File(projectFolder,
                "src/main/resources").mkdirs();

        new File(projectFolder,
                "src/test/java").mkdirs();

        createApplicationClass(basePackage);

        createHomeController(controllerFolder);

        System.out.println(
                "Spring Boot project created."
        );
    }

    private void createHomeController(
            File controllerFolder) {

        try {

            File controllerFile =
                    new File(
                            controllerFolder,
                            "HomeController.java"
                    );

            FileWriter writer =
                    new FileWriter(controllerFile);

            writer.write(
                    "package com.example.controller;\n\n" +
                            "import org.springframework.web.bind.annotation.GetMapping;\n" +
                            "import org.springframework.web.bind.annotation.RequestMapping;\n" +
                            "import org.springframework.web.bind.annotation.RestController;\n\n" +
                            "@RestController\n" +
                            "@RequestMapping(\"/api\")\n" +
                            "public class HomeController {\n\n" +
                            "    @GetMapping(\"/hello\")\n" +
                            "    public String hello() {\n" +
                            "        return \"Hello from JarvisDev\";\n" +
                            "    }\n" +
                            "}\n"
            );

            writer.close();

            System.out.println(
                    "HomeController created."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error creating HomeController"
            );
        }
    }

    private void createApplicationClass(
            File basePackage) {

        try {

            File appFile =
                    new File(
                            basePackage,
                            "Application.java"
                    );

            FileWriter writer =
                    new FileWriter(appFile);

            writer.write(
                    "package com.example;\n\n" +
                            "import org.springframework.boot.SpringApplication;\n" +
                            "import org.springframework.boot.autoconfigure.SpringBootApplication;\n\n" +
                            "@SpringBootApplication\n" +
                            "public class Application {\n\n" +
                            "    public static void main(String[] args) {\n" +
                            "        SpringApplication.run(Application.class, args);\n" +
                            "    }\n" +
                            "}\n"
            );

            writer.close();

            System.out.println(
                    "Application.java created."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error creating Application.java"
            );
        }
    }
}