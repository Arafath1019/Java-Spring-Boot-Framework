# Spring Boot Tutorial - Amigoscode

### Spring Boot Overview
Spring Boot is an open-source Java framework used for programming standalone, production-grade Spring-based applications with minimal effort. Spring Boot is a convention-over-configuration extension for the Spring Java platform intended to help minimize configuration concerns while creating Spring-based applications.

* Security
* Logging
* Metrics
* Connecting to DB
* Easy to learn
* Production ready
* Microservices
* Dependency Injection
* Configuration
* Great Community
* and more...

### Project Overview
<img src="images/1.png" height="auto" width="auto" />

### Spring Initializer
* https://start.spring.io/
* Project - Maven vs Gradle
Maven and Gradle are both popular build automation tools in the Java ecosystem that use parallel project building and dependency resolution. In build approach, Maven uses a fixed, linear model of phases, Gradle uses a graph of task dependencies, with tasks performing the work. In project structure, Maven follows strict conventions and project structures, Gradle uses a configuration approach that gives developers more control over the built process. In customization, Gradle is more flexible and customizable than Maven, making it better suited for large and more complex projects. In performance, Gradle is generally faster than Maven due to its mechanisms for work avoidance and incrementality.

* Project packaging - Jar vs War
In general, JAR files are preferable for deploying Spring Boot applications because they are lightweight and can be run as standalone applications without requiring an application server. However, if you want multiple applications running under the same application server, you should choose WAR.

### Project setup from Spring Initializer
* Project - Maven
* Language - Java
* Spring boot - 3.3.3
* Project Metadata as default
* Packaging - Jar
* Java - 22
* Dependencies - Spring Web, Spring Data JPA, PostgreSQL Driver

### Development Tools Setup
* Download and install JetBrains Tool Box app: https://www.jetbrains.com/toolbox-app/
* Install IntelliJ IDEA Ultimate as IDEA

### Starting the Server
* Right click on pom.xml -> maven -> reaload project
* From src -> main -> java -> com.example.demo -> DemoApplication, Run the main function to start the server
