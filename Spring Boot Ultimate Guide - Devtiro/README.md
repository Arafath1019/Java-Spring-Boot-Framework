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

### Maven Project Structure
* Link: https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html
<img height="auto" width="auto" alt="Maven Project Directory" src="../images/1.png" />

### Maven Workflow
* ./mvnw compile
* ./mvnw clean test
* ./mvnw clean package
* cd target
* java -jar jar_file_name
* ./mvnw clean verify

### Maven Spring Boot Plugin
* Run spring boot project from terminal
```
$ ./mvnw spring-boot:run
```

### Spring Framework vs Spring Boot
* Spring boot is a popular framework for building java applications
* A framework is a chunk of code written on top of a language's core library to solve common problems.
* Language's Core Lib -> Spring Framework -> Spring Boot -> Your App
* Spring framework is highly configurable but it takes much efforts

### Spring Boot Architecture
The Spring Boot is built on top of the core Spring framework. It is a simplified and automated version of the spring framework. The spring boot follows a layered architecture in which each layer communicates to other layers.

Spring Boot layers:
The spring boot consists of the following four layers.
1. Presentation layer - Authentication & Json Translation
2. Business Layer - Business Logic, Validation & Authorization
3. Persistance Layer - Storage Logic
4. Database Layer - Actual Database

#### Presentation Layer
The presentation layer is the top layer of the spring boot architecture. It consists of Views. i.e., the front-end part of the application. It handles the HTTP requests and performs authentication. It is responsible for converting the JSON field's parameter to Java Objects and vice-versa. Once it performs the authentication of the request it passes it to the next layer. i.e., the business layer.


#### Business Layer
The business layer contains all the business logic. It consists of services classes. It is responsible for validation and authorization.

#### Persistance layer
The persistance layer contains all the database storage logic. It is responsible for converting business objects to the database row and vice-versa.
* Spring Data JPA -> Java Object
* Spring JDBC -> SQL
* Database Driver e.g PostgreSQL

### Modularity
Modularity in a Spring Boot application refers to the practice of breaking the application into smaller, self-contained and reusable modules. Each module typically encapsulates a specific business functionality, service or feature. By organizing code in a modular structure, the application becomes more maintainable, scalable and easier to test. It also promotes reusability and separation of concerns.

### Dependency Injection
DI means that objects do not initiate their dependencies directly. Instead they receive them from an external source. When class A uses some functionality of class B, then its said that class A has a dependency of class B. 
DI is a fundamental concept in Spring Framework that makes it possible to develop loosely couples and easily testable code.

There are three main types of dependency injection:
1. Constructor Injection
2. Setter Injection
3. Field Injection

#### Constructor Injection
This is the most recommended way to achieve DI in spring. In ensures that the dependency is not null and makes the class immutable.

```
@Service 
public class TestService
{
    private final TestRepository repository;

    @Autowired
    public TestService(TestRepository repository){
        this.repository = repository;
    }

    public void performService() {
        repository.doSomething();
    }
}
```


#### Setter Injection
Setter injection allows the dependency to be injected through a setter method. 

```
@Service
public class TestService {
    private TestRepository repository;

    @Autowired
    public void setTestRepository(TestRepository repository){
        this.repository = repository;
    }

    public void performService(){
        repository.doSomething();
    }
}
```

#### Field Injection
Field injection is the least preferred method because it makes the class less testable and harder to maintain.

```
@Service
public class TestService {
    @Autowired
    private TestRepository repository;

    public void performService(){
        repository.doSomething();
    }
}
```