# 🤖 JarvisDev AI

An AI-powered Developer Assistant built with Java.

---

## 📌 About

JarvisDev AI is an autonomous AI agent that can:

- Scan your computer
- Detect installed software
- Install missing tools
- Generate Java projects
- Debug errors
- Build applications automatically

---

## 🚀 Current Version

**v0.1 - System Scanner**

### Features

- ✅ Detect Operating System
- ✅ Detect OS Version
- ✅ Detect Java Version
- ✅ Detect Java Vendor
- ✅ Detect Current User
- ✅ Detect Home Directory

---

## 🛠️ Technology Stack

- Java 25 LTS
- Maven
- Git
- IntelliJ IDEA

---

## 📂 Project Structure

```text
## 📂 Project Structure

```text
jarvisDev
│
├── src
│   └── main
│       └── java
│           └── com.jarvisdev
│
│               ├── Main.java
│
│               ├── analysis
│               │   ├── HealthAnalyzer.java
│               │   └── HealthReport.java
│
│               ├── models
│               │   ├── HardwareInfo.java
│               │   ├── SystemInfo.java
│               │   ├── SoftwareInfo.java
│               │   ├── SoftwareResult.java
│               │   └── ApplicationInfo.java
│
│               ├── repository
│               │   ├── SoftwareRepository.java
│               │   └── ApplicationRepository.java
│
│               ├── scanner
│               │   ├── SystemScanner.java
│               │   │
│               │   ├── hardware
│               │   │   └── HardwareScanner.java
│               │   │
│               │   ├── system
│               │   │   └── SystemInfoScanner.java
│               │   │
│               │   ├── software
│               │   │   └── SoftwareScanner.java
│               │   │
│               │   └── application
│               │       └── ApplicationScanner.java
│
│               ├── report
│               │   ├── ReportData.java
│               │   ├── ReportGenerator.java
│               │   ├── TxtReportWriter.java
│               │   ├── JsonReportWriter.java
│               │   └── CsvReportWriter.java
│
│               └── utils
│                   ├── ConsoleUI.java
│                   ├── DashboardPrinter.java
│                   └── ProgressBar.java
│
├── screenshots
│   ├── dashboard-v1.png
│   ├── health-analysis-v1.png
│   └── reports-generated-v1.png
│
├── README.md
├── pom.xml
└── .gitignore
```
```
## Dashboard

![Dashboard](screenshots/dashboard-v1.png)

## Health Analysis

![Health Analysis](screenshots/health-analysis-v1.png)

## Generated Reports

![Reports](screenshots/reports-generated-v1.png)

---
## 🗺️ Roadmap

### v0.1
- ✅ System Scanner

### v0.2
- ✅ Hardware Scanner

### v0.3
- ✅ Software Scanner

### v0.4
- ⏳ Auto Installer

### v0.5
- ⏳ Project Generator

### v1.0
- 🤖 AI Developer Agent


---

## 👨‍💻 Author

**Vikash Saroj**

---