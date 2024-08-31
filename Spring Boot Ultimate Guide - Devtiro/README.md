# Spring Boot Ultimate Guide - Devtiro

### What is Apache Maven?
Maven is a popular, open-source build tool that automates the process of building and developing Java-based applications. 
It's used to build, publish and deploy multiple projects at once to improve project management.
Maven automates many tasks, including: Compiling source code, Managing dependencies, Assembling binary codes into packages, Executing test scripts and Building and documenting the lifecycle framework.
Maven is based ont he Project Object Model (POM), which is a file that contains information about the project, such as its description, versioning, configuration management and dependencies.
For example maven command: `./mvnw clean compile`

### Maven Concepts
* `mvnw [options] [<goal(s)] [<phase(s)>]`
* mvnw
    * clean - Removed temporary directories and files
    * default - Where the most useful goals live
    * site - Where documentation is generated.
* mvnw clean 
    * pre-clean - Hook for before cleaning
    * clean - Does the actual cleaning
    * post-clean - Hook for after cleaning

```
$ ./mvnw clean
```
* mvnw [default]
    * compile - Compiles your code into bytecode
    * test - Runs unit tests
    * package - Creates a jar or war file
    * verify - Runs checks & integration tests

```
$ ./mvnw compile
$ ./mvnw test
$ ./mvnw package
$ ./mvnw verify
```