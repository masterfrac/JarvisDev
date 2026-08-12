package com.jarvisdev;

import com.jarvisdev.installer.GitInstaller;
import com.jarvisdev.installer.JdkInstaller;
import com.jarvisdev.installer.MavenInstaller;
import com.jarvisdev.installer.ToolInstaller;

public class Main {

    public static void main(String[] args) {

        ToolInstaller git = new GitInstaller();
        ToolInstaller maven = new MavenInstaller();
        ToolInstaller jdk = new JdkInstaller();

        System.out.println("===== TOOL CHECKER =====");
        System.out.println();

        System.out.println("Git   : " + git.isInstalled());
        System.out.println("Maven : " + maven.isInstalled());
        System.out.println("JDK   : " + jdk.isInstalled());
    }
}