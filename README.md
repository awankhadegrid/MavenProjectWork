# 🚀 Maven Practice Project – Code Quality & Bug Detection

## 📌 Project Overview
This is a **Java Maven practice project** focused on **code quality, static analysis, and bug detection**.  
It integrates **Checkstyle, PMD, SpotBugs, JUnit**, and other Maven plugins to demonstrate a real-world Maven workflow.

The project helps in:
- Enforcing clean coding standards
- Detecting bugs and performance issues
- Generating static analysis reports
- Running and packaging Java applications using Maven

---

## 🛠️ Technologies Used
- **Java**: JDK 17
- **Build Tool**: Apache Maven
- **Testing**: JUnit 4
- **Static Code Analysis**:
    - Checkstyle
    - PMD
    - SpotBugs
- **Utilities**:
    - Lombok
    - Maven Exec Plugin
    - Maven JAR Plugin

    
---

## 🧪 Build & Run Commands

### 🔹 Compile Project
mvn compile


### 🔹 Run Unit Tests
mvn test


### 🔹 Run Application Using Maven
mvn exec:java


### 🔹 Package Application
mvn package


Run the generated JAR:
java -jar target/maven-practice-1.0-SNAPSHOT.jar


---

## ✅ Code Quality & Static Analysis

### 📏 Checkstyle
Checks code formatting and coding standards.

Run manually:
mvn checkstyle:check


Runs automatically during:
mvn verify


---

### 🧹 PMD
Detects bad coding practices, unused code, and complexity issues.

Run PMD check:
mvn pmd:check


Generate PMD report:
mvn pmd:pmd


📄 Report location:
target/site/pmd.html


---

## 🐞 SpotBugs – Bug Report

SpotBugs analyzes compiled bytecode to detect:
- Performance issues
- Null pointer risks
- Code quality problems
- Potential bugs

### 🔍 Generate SpotBugs Report
mvn compile spotbugs:spotbugs


### 📄 Report Location
target/spotbugs.html


Open the file in a browser to view detected bugs.


---
