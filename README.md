# Maven Practice Project

## Overview
This project demonstrates **practical implementation of Apache Maven** for building and managing a Java application.  
It was developed as part of an **internship curriculum** to understand Maven project structure, dependency management, build lifecycle, and testing.

---

## Technologies Used
- Java 17
- Apache Maven
- JUnit 4
- Lombok
- Git & GitHub


---

## Maven Configuration
The project is configured using `pom.xml` with the following features:
- Standard Maven directory structure
- Java compiler configuration (Java 17)
- Dependency management using Maven Central
- Plugin configuration for build, test, execution, and packaging

### Dependencies Used
- **JUnit** – for unit testing
- **Lombok** – to reduce boilerplate code

---

## Maven Plugins Used
- Maven Compiler Plugin
- Maven Surefire Plugin
- Maven Jar Plugin
- Exec Maven Plugin

These plugins help in compiling code, running tests, executing the application, and generating an executable JAR file.

---

## How to Build and Run the Project

1. Compile the Project
```bash
mvn compile
2. Run Unit Tests
mvn test
3. Run the Application Using Maven
mvn exec:java
4. Package the Application
mvn package
5. Run the Executable JAR
java -jar target/maven-practice-1.0-SNAPSHOT.jar
