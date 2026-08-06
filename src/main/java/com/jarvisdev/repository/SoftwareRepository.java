package com.jarvisdev.repository;

import com.jarvisdev.models.SoftwareInfo;

import java.util.List;

public class SoftwareRepository {

    public static List<SoftwareInfo> getSoftwareList() {

        return List.of(

                new SoftwareInfo("Java", "java -version"),

                new SoftwareInfo("Git", "git --version"),

                new SoftwareInfo("Python", "python --version"),

                new SoftwareInfo("Maven", "mvn -version"),

                new SoftwareInfo("Node.js", "node --version"),

                new SoftwareInfo("Docker", "docker --version")
        );
    }
}
