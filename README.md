# Maven Practice Project – SpotBugs Bug Report

## 📌 Project Overview
This project demonstrates a **Java application built using Maven** with **SpotBugs integration** for static code analysis.  
The purpose of this project is to identify potential bugs and code quality issues.
SpotBugs analyzes the compiled bytecode and generates a detailed **bug report**.

---

## 🛠️ Technologies Used
- Java (JDK 17)
- Apache Maven
- SpotBugs Maven Plugin
- Command Line (CLI)

---

## ⚙️ How the Project Works
1. Java source code is written in `src/main/java`
2. Maven compiles the source code into `.class` files
3. SpotBugs scans the compiled bytecode
4. Bugs and performance issues are detected
5. A SpotBugs HTML report is generated

---

## 🐞 SpotBugs Bug Report

### 📍 Bug Report Location
After running SpotBugs, the report is generated at : 
### target/spotbugs.html


Open it in a browser to view detected bugs and warnings.

---

### 🧪 Bugs Identified
SpotBugs detected **performance/code quality issues**:

Generate SpotBugs Report
### mvn compile spotbugs:spotbugs

Open Bug Report
### open target/spotbugs.html
