# Java Spring Framework 6 with Spring Boot 3

### Source Code Links

- Java Source Code: https://github.com/navinreddy20/Javacode
- Spring Source Code: https://github.com/navinreddy20/spring6-course
- Microservices Source Code: https://github.com/navinreddy20/MicroserviceTutorials

### Core Java

#### JDK Setup

- IDE (Integrated Development Environment): VS Code, Eclipse, IntelliJ Idea, NetBeans
- Compiler
- JDK (Java Development Kit)
- JDK Download: https://www.oracle.com/java/technologies/downloads/#jdk24-mac
- Check java & javac version

```
$ java --version
$ javac --version
```

- Download VS Code: https://code.visualstudio.com/download

#### IntelliJ Idea Setup

- Download IntelliJ Idea: https://www.jetbrains.com/idea/

#### First Code in Java

- JShell (Java Shell Tool)
- Entering JShell, write jshell in terminal

```
$ jshell
$ 2 + 3
$ System.out.println("Hello World");
```

- Java Code

```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

- Compile Java Code: `$javac filename.java`

#### How Java Works

<img src="../images/2.png" >

### Variables

- Java is Strongly Typed Language

```
public class Main {
    public static void main(String args[]) {
        int num1 = 5;
        int num2 = 3;
        int result = num1 + num2;
        System.out.println(result);
    }
}
```

- Data Type -> Primitive Type
  -> Integer -> int(4bytes), long(8bytes), short(2bytes), byte(1byte)
  -> Float -> float(4bytes), double(8bytes)
  -> Character -> char(2bytes)
  -> Boolean -> True/False

```
public class Main {
    public static void main(String args[]) {
        int num1 = 9;
        byte by = 127;
        short sh = 558;
        long l = 5854l;
        float f = 5.8f;
        double d = 5.8;
        char c = 'k';
        boolean b = true;
    }
}
```

### Literals

Literals are the fixed values that write directly into code. They represent constant values of a particular data type - like numbers, characters, strings etc.

```
int number = 100;            // Integer literal
float pi = 3.14f;            // Floating-point literal
char grade = 'A';            // Character literal
String name = "John";        // String literal
boolean isPassed = true;     // Boolean literal
String city = null;          // Null literal
```

### Type Conversion (Automatic/Implicit Casting)

- Java automatically converts a smaller data type into a larger data type
- It happens implicitly
- No data loss happens here

```
int a =10;
long b = a;
float c = b;
```

- Order of data types (small -> big)
  byte -> short -> int -> float -> double

### Type Casting (Manual/Explicit Casting)

- Manually convert a larger data type into a smaller data type
- Have to tell Java what is trying to do
- Risk of data loss if the value is too big

```
double d = 9.78;
int i = (int) d;
```

### Arithmetic Operators

- Addition (+)
- Subtraction (-)
- Multiplication (\*)
- Division (/)
- Modulus Operator to get reminder (%)
- +=, -=, \*=, /=, %=
- Increment Operator -> i++ (post-increment), ++i (pre-increment)
- Decrement Operator -> i-- (post-decrement), --i (pre-decrement)

### Relational Operators

- > , <, >=, <=, ==, !=

### Logical Operator

- &&, ||, !

### If Else

```
if(condition) {
    statement;
} else {
    statement;
}
```

### If Else If

```
if(condition1) {
    statement;
} else if (condition2) {
    statement;
} else {
    statement;
}
```

### Ternary

```
condition ? statement1 : statement2;

number i = n % 2 == 0 ? 10 : 15;
```

### Switch Statement

```
public class Main {
    public static void main(String args[]) {
        int n = 2;

        switch(n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }
    }
}
```

### While Loop

```
public class Main {
    public static void main(String args[]) {
        int i = 1;

        while(i <= 4) {
            System.out.println("Hello " + i);
            i++;
        }
    }
}
```

### Do While Loop

```
public class Main {
    public static void main(String args[]) {
        int i = 1;

        do {
            System.out.println("Hello " + i);
        } while(n <= 4);
    }
}
```

### For Loop

```
public class Main {
    public static void main(String args[]) {
        for(int i = 0; i <= 4; i++) {
            System.out.println("Hello " + i);
        }
    }
}
```

### Class and Object theory

- Object Oriented Programming
- Object - Properties and Behavior
- Class
- Create a class file -> Compiled to create a byte code -> JVM run this byte code and object is created

### Class and Object Practical

```
class Calculator{
    public int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}

public class Demo {
    public static void main(String a[]) {
        int num1=4;
        int num2=5;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
```

### JDK, JRE, JVM

- JDK (Java Development Kit) -> Convert the java code into byte code
- JVM (Java Virtual Machine) -> Runs the Java Code
- JRE (Java Runtime Environment) -> Provide the additional in-built classes for running java code

### Methods

```
class Computer {
    public void playMusic() {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost) {
        if(cost >= 10)
            return "Pen";

        return "Nothing";
    }
}

public class Demo {
    public static void main(String a[]) {
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMeAPen(12);
        System.out.println(str);
    }
}
```

### Method Overloading

```
class Calculator {
    public int add(int n1, int2){
        return n1+n2;
    }

    public double add(double n1, int n2){
        return n1+n2;
    }

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}

public class Demo {
    public static void main(String a[]) {
        Calculator calc = new Calculator();
        calc.add(2,3);
        calc.add(2,3,4);
    }
}
```

### Stack & Heap

In java, stack & heap are two areas of memory used for different purposes:
Stack:
_ Stores: Local variables, method calls and references to objects
_ Scope: Each thread has it's own stack
_ Lifetime: Variables are created when a method is called and destroyed when the method exits
_ Speed: Very fast access
_ Memory Management: Handled automatically LIFO - Last In First Out
_ Example:

```
    int x = 10;
```

Heap:
_ Stores: All Java Objects (instances created with new)
_ Scope: Shared among all threads
_ Lifetime: Objects remain until they are no longer referenced and garbage collected
_ Speed: Slower than stack
_ Memory management: Managed by java garbage collector
_ Example:

```
Calculator calc = new Calculator();
```

### Creation of Array

```
public class Demo {
    public static void main(String a[]) {
        int nums[] = {3,7,2,4};
        nums[1] = 8;
        System.out.println(nums[1]); // Output -> 8

        int nums1[] = new int[4];
        System.out.println(nums1[1]); // Output -> 0
    }
}
```

### Multi dimensional array

```
public class Demo {
    public static void main(String a[]) {
        int nums[][] = new int[3][4];

        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }

        for(int n[]: nums) {
            for(int m: n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
```

### Jagged Array

A jagged array in java is an array of arrays where each "row" can have a different length. Unlike a regular 2D array, jagged arrays do not require all inner arrays to be the same size.

```
public class JaggedArrayDemo {
    public static void main(String a[]) {
        int[][] jagged = new int[3][];

        jagged[0] = new int[2]; // First row has 2 columns
        jagged[1] = new int[4]; // Second row has 4 columns
        jagged[2] = new int[3]; // Third row has 3 columns

        // Assign values
        jagged[0][0] = 1;
        jagged[0][1] = 2;
        jagged[1][0] = 3;
        jagged[1][1] = 4;
        jagged[1][2] = 5;
        jagged[1][3] = 6;
        jagged[2][0] = 7;
        jagged[2][1] = 8;
        jagged[2][2] = 9;

        // Print jagged array
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[]: jagged) {
            for(int m: n) {
                System.out.println(m);
            }
        }
    }
}
```

### Drawbacks of array

- Fixed size
- Homogeneous data
- No Built-in methods
- Inefficient insert/delete
- Wasted memory
- No type safety for object arrays
- No support for generics

### Array of Objects

```
class Student {
    int rollNo;
    String name;
    int marks;
}

public class Demo {
    public static void main(String a[]) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = 'Navin';
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollNo=2;
        s2.name = 'Pradip';
        s2.marks = 90;

        Student s[] = new Student[2];

        for(int i=0; i<s.length; i++) {
            System.out.println(s[i].name + ':' + s[i].marks);
        }
    }
```

### Enhanced Array

```
public class Demo {
    public static void main(String a[]) {
        int nums[] = new int[3];

        for(int n: nums) {
            System.out.println(n);
        }

        Student stds[] = new Student[3];

        for(Student s: stds) {
            System.out.println(s.name + ':' + s.marks);
        }
    }
}
```

### What is String

```
public class Demo {
    public static void main(String a[]) {
        String name = new String("Yeasin");
        String last_name = "Arafath";
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello " + name);
        System.out.println(name.charAt(0));
        System.out.println(name.concat("Hello"));
    }
}
```

### Mutable vs Immutable String

```
public class Demo {
    public static void main(String a[]) {
        String name = "navin";
        name = name + " reddy";
        System.out.println(name);

        String s1 = "Navin";
        String s2 = "Navin";
        System.out.println(s1 == s2);
    }
}
```

- By default strings are immutable
- Mutable -> Change (String Buffer, String Builder)
- Immutable -> can't change

### StringBuffer & StringBuilder

In java, both StringBuffer & StringBuilder are used to create mutable strings. Unline String, which is immutable, these classes allow to change the contents without creating new objects.

```
public class Demo {
    public static void main(String a[]) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // By default Buffer size of StringBuilder is 16 bytes.

        StringBuilder sb = new StringBuilder("Navin");
        System.out.println(sb.capacity()); // Capacity is 21 bytes here
        System.out.println(sb.length());

        sb.append(" Reddy");
        // Convert StringBuffer into String format
        String str = sb.toString();

        sb.deleteCharAt(2);
        sb.insert(0, "Java ");
    }
}
```

StringBuffer:
_ Thread-safe (synchronized): Multiple threads can use it safely.
_ Slower than StringBuilder due to synchronization \* Use when thread safety is required

StringBuilder:
_ Not thread-safe: Not safe for use by multiple threads
_ Faster than StringBuffer \* Use when thread safety is not needed

### Static Variable

A static variable is a variable that belongs to the class, not to any specific object. It is shared among all instances/objects of that class.

- Declared using the static keyword
- Only one copy exists, regardless of how many objects are created.
- Can be accessed using the class name, (ClassName.variable)
- Useful for values that should be common to all objects

```
class Calculator {
    // Instance variable (unique for each object)
    int price;

    // Static variable (shared by all objects)
    static String name;

    public void show() {
        // Local variable (exists only within this method)
        String new_name;
    }
}

public class Demo {
    public static void main(String a[]) {
        Calculator.name = "Sony"; // Set static variable
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();
        System.out.println(Calculator.name); // Output: Sony
    }
}
```

### Static method

A static method belongs to the class, not to any specific object. It can be called without creating an instance of the class.

- Declare using the static keyword
- Can be accessed using the class name (ClassName.methodName())
- Can only access static variables and other static methods directly
- Cannot use this or super keywords

```
class Calculator {
    static String name = "Sony";

    static void showBrand() {
        System.out.println("Brand: " + name);
    }
}

public class Demo {
    public static void main(String a[]) {
        Calculator.showBrand();
    }
}
```

### Static block

A static block is a block of code inside a class that is executed only once, when the class is loaded into memory (before any object is created or any static method is called).

- Declared using static {..}
- Used to initialize static variables or perform class-level setup
- Runs automatically when the class is loaded

```
class Calculator {
    static String brand;

    // Static block
    static {
        brand = "Sony";
        System.out.println("Static block is executed. Brand set to " + brand);
    }
}

public class Demo {
    public static void main(String a[]) {
        System.out.println(Calculator.brand);
    }
}
```

### Class.forName

It is a method used to load a class dynamically at runtime. It returns the Class object associated with the class or interface with the given string name.

- Loads the class into memory
- Executes static blocks and static initializations of the class
- Commonly used for loading JDBC drivers or frameworks that require dynamic class loading

```
public class Demo {
    static {
        System.out.println("Static block executed!");

        public static void main(String a[]) {
            Class.forName("Demo");
        }
    }
}
```

### Encapsulation

Encapsulation is one of the fundamental concepts of OOP. It refers to the bundling of data(variables) and methods (functions) that operate on the data into a single unit, called a class. It also restricts direct access to some of the object's components, which is known as data hiding.

- Achieved by declaring variables as private and providing public getter and setter methods to access and modify them.
- Protects the internal state of an object from unintended or harmful changes.
- Improves code maintainability and flexibility.

```
class Student {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class Demo {
    public static void main(String a[]) {
        Student s = new Student();
        s.setMarks(90);
        System.out.println(s.getMarks());
    }
}
```

### Getters and Setters

Getters and setters are special methods used to access and modify private variables of a class. They help achieve encapsulation by controlling how variables are accessed and updated.

- Getter: Returns the value of a private variable
- Setter: Sets or updates the value of a private variable

```
class Student {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100) { // validation
            this.marks = marks;
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(85);
        System.out.println(s.getMarks());
    }
}
```

### `this` keyword

The `this` keyword in java is a reference variable that refers to the current object.

- When local and instance variables have the same name, `this` helps to refer to the instance variable
- Pass the current object as a parameter
- Invoke current object's method or constructor

```
class Student {
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return this.marks;
    }
}
```

### Constructor

A constructor is a special method in a class that is called automatically when an object is created. It's main purpose is to initialize the object's state (assign values to variables).

- Has the same name as the class
- Does not have a return type
- Can be overloaded (multiple constructors with different parameters)
- If no constructor is defined, Java provides a default constructor

```
class Student {
    private int marks;

    // Default constructor
    public Student() {
        marks = 0;
    }

    // Parameterized constructor
    public Student(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return this.marks;
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(95);
    }
}
```

### Naming convention

- Class Names: Use PascalCase (Example: Student, CalculatorDemo)
- Method Names: Use camelCase (Example: getMarks(), setMarks(int marks))
- Variable Names: Use camelCase (Example: studentName, totalMarks)
- Constant Names: Use ALL_UPPERCASE (Example: MAX_SIZE, PI)
- Package Name: Use all lowercase (Example: com.example.project)

### Anonymous Object

An anonymous object is an object that is created without assigning it to a reference variable. It is used only once, typically for calling a method immediately after creation.

- No reference variable is used
- The object cannot be reused
- Useful for one-time method calls

```
Class Demo {
    public void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new Demo().show();
    }
}
```

### Inheritance

Inheritance is an important concept in OOP that allows one class(child/subclass) to inherit the properties and behaviors of another class (super/parent class).

- Promotes code reusability
- Support hierarchical inheritance
- The `extends` keyword is used for inheritance
- A subclass can add its own fields and methods or override parent methods

- Single Inheritance: It means a class inherits from only one parent class.

```
class Animal {
    public void eat() {
        .....
    }
}

class Dog extends Animal {
    public void bark() {
        ....
    }
}

public class Demo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
```

- Multilevel Inheritance: Multilevel inheritance means a class inherits from a class, which in turn inherits from another class, forming a chain.

```
class Animal {
    public void eat() {
        ....
    }
}

Class Dog extends Animal {
    public void bark() {
        ....
    }
}

class Puppy extends Dog {
    public void weep() {
        .....
    }
}
```

### Multiple Inheritance

Multiple inheritance means a class can inherit from more than one parent class.

- Java does not support multiple inheritance with classes to avoid ambiguity (the "diamond problem"), reason if two parent classes have the same method, the compiler cannot decide which one to use.

```
class A {}
class B {}
class C extends A, B {} // This is not allowed
```

- Java supports multiple inheritance through interfaces.

```
interface A {
    void show();
}

interface B {
    void display();
}

class C implements A,B {
    public void show() {
        ....
    }

    public void display() {
        ....
    }
}
```

### super method

The super keyword in Java is used to refer to the immediate parent class.

- Access parent class methods that are overridden in the child class
- Access parent class variables when they are hidden by child class variables
- Call the parent class constructor (using super())

```
class Animal {
    public void eat() {
        ....
    }
}

class Dog extends Animal {
    public void eat() {
        ...
    }

    public void printEat() {
        super().eat();
    }
}
```

- When create an object of a class, it will call the constructor of parent class & child class both

```
class A {
    public void A() {

    }
}

class B extends A {
    public B () {
        super();
        ....
    }

    public B(int n) {
        super();
        ....
    }
}
```

- In java, every class extends Object class by default

```
class A extends Object {

}
```

### this method

The this keyword in java is a reference of the current object.

- Call another constructor in the same class
- Call another method of the same object

```
class Student {
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
        this.display();
    }

    public void display() {
        .....
    }
}
```

```
class Student {
    private int marks;

    public Student() {
        this(0);
    }

    public Student(int marks) {
        this.marks = marks;
    }
}
```

- Use this.methodName() to call another method of the same object
- Use this() to call another constructor in the same class.

### Method overriding

Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its parent class. The method in the child class must have the same name, return type and parameters as the method in the parent class.

- Used to provide specific behavior in the subclass
- Enables runtime polymorphism
- The @Override annotation is often user for clarity

```
class Animal {
    public void eat() {
        ....
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        .....
    }
}
```

### Packages

A package in java is a namespace that organizes related classes and interfaces.
Packages help avoid name conflicts, make code modular and provide access protection.

- Packages group related classes together
- Prevent naming conflicts (e.g. two classes with the same name in different packages)
- Provide controlled access using access modifiers (public, protected, etc)
- Java has built-in packages (e.g. java.util, java.io)

```
# Define a package
package mypackage;

public class MyClass {
    public void show() {
        ....
    }
}

### Using a package in another class
import mypackage.MyClass;

public class Demo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
```

- Packages are simply folder or nested folders
- A file inside package or folder, declare the file as a package
- Import the package for using the class

### Maven Repository

Maven Repository (often referred to as mvnrepository.com) is a central online storage location where java libraries, frameworks, plugins and other project dependencies are published and shared.

- Used by Maven (a popular Java build tool) to download and managed project dependencies automatically.
- Contains thousands of open source java libraries (JAR files)
- Developers add dependencies to their pom.xml file, and maven fetches them from the repository
- There are three main types: local, central and remote repository

Example Dependency in pom.xml

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <version>3.2.5</version>
</dependency>
```

### Access Modifiers

Access modifiers control the visibility and accessibility of classes, variables, methods and constructors. Java provides four main access modifiers:

- Public: Accessible from anywhere
- Protected: Accessible within the same packages and by subclasses (even in different packages)
- Default: Accessible only within the same package
- Private: Accessible only within the same class.

```
public class Demo {
    public int a;
    protected int b;
    int c;
    private int d;
}
```

### Polymorphism (Many Behavior)

Polymorphism is an OOP concept that means "many forms". In java, it allows objects to be treated as instance of their parent class rather than their actual class. There are two types:

1. Compile-time Polymorphism (Method Overloading):

- Same method name with different parameters in the same class
- Decided at compile time

```
class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
}
```

2. Runtime Polymorphism (Method Overriding):

- Subclass provides a specific implementation of a method already defined in its parent class
- Decided at run time

```
class Animal {
    public void sound() {
        ....
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        .....
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

### Dynamic Method Dispatch

It is the mechanism by which a call to an overridden method is resolved at runtime, not compile time. It enables runtime polymorphism in java.

- Achieved using method overriding and upcasting (Parent reference, child object)
- The method to be executed is determined by the actual object type, not the reference type

```
class Animal {
    public void sound() {
        ...
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        ....
    }
}

public class Demo {
    public static void main(String[] a){
        Animal a = new Dog();
        a.sound();
    }
}
```

### Final Keyword

The final keyword in java is used to restrict the user in various ways. It can be applied to variables, methods and classes

- Final Variable
  Value can connot be changed once assigned (acts as a constant)

```
final int MAX_VALUE = 100;
```

- Final Method
  Can't be overridden by subclass

```
class Animal {
    public final void eat() {
        ....
    }
}
```

- Final Class
  Can't be extended (no subclass can be created)

```
final class Animal {}
```

### Object class: equals(), toString(), hashCode()

In Java, every class implicitly extends the Object class which provides some important methods:

1. equals()

- Used to compare two objects for equality
- Default implementation compares references (memory addresses)
- Can be overridden to compare object contents

```
class Student {
    int id;
    String name;

    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student s = (Student) obj;
        return id == s.id && name.equals(s.name);
    }
}
```

2. toString()

- Returns a string representation of the object
- Default: class name + @ + hashcode
- Often overridden for meaningful output

```
class Student {
    int id;
    String name;

    public String toString() {
        return "Student{id=" + id + ", name'" + name + "'}";
    }
}
```

3. hashCode()

- Returns an integer hash code for the object
- Used in hashing-based collections (e.g. HashMap, HashSet)
- Should be overridden when equals() in overridden

```
class Student {
    int id;
    String name;

    public int hashCode() {
        return id + name.hashCode();
    }
}
```

### Upcasting & Downcasting

1. Upcasting

- Converting a subclass reference to a superclass reference
- Done automatically (implicitly)
- Allows to use polymorphism

```
class Animal {}
class Dog extends Animal {}

public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();
    }
}
```

2. Downcasting

- Converting a superclass reference back to a subclass reference
- Must be done explicitly
- Can cause ClassCastException if the object is not actually an instance of the subclass

```
Animal a = new Dog();
Dog d = (Dog) a;
```

### Wrapper Class

A wrapper class in java provides a way to use primitive data types (int, char, boolean) as objects. Each primitive type has a corresponding wrapper class in the java.lang package.

- Needed when working with collections (like ArrayList, HashMap) which require objects, not primitives.
- Provide utility methods for converting between types, parsing etc
- Support for null values (primitive can't be null)
- Primitive types and their wrapper class: byte(Byte), short(Short), int(Integer), long(Long), float(Float), double(Double), char(Char), boolean(Boolean)

```
int a = 10;
Integer a = 10;
Integer obj = Integer.valueOf(a);
int b = obj.intValue();

Integer x = 5;
int y = 5;
```

### Abstract Keyword

The abstract keyword is used to declare abstract classes and abstract methods.

1. Abstract Class:

- Can't be instantiated (can't create objects directly)
- Can have abstract methods (without implementation) and concrete methods (with implementation)
- Used as a base for other classes

```
abstract class Animal {
    abstract void sound();
    void eat() {
        .....
    }
}
```

2. Abstract Method

- Declared without a body (no implementation)
- Must be implemented by subclass

```
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        .....
    }
}
```

### Inner Class

An inner class is a class defined within another class. Inner classes are used to logically group classes that are only used in one place, increase encapsulation, and can access members of the outer class.

- Types of inner classes:

  1. Member Inner Class (Regular Inner Class)
  2. Static Nested Class
  3. Local Inner Class (Defined inside a method)
  4. Anonymous Inner Class

- Member Inner Class (Regular Inner Class):

```
class Outer {
    int x =10;

    class Inner {
        void display() {
            ....
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
```

### Anonymous Inner Class

An anonymous inner class is a type of inner class without a name. It is used to provide a quick implementation of an interface or abstract class, usually for one-time use.

- Defined and instantiated in a single expression
- Commonly used for event handling or passing short-lived implementations

- Example: Implementing an interface

```
interface Animal {
    void sound();
}

public class Demo {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void sound() {
                ....
            }
        };

        dog.sound();
    }
}
```

- Example: Extending a class

```
class Person {
    void great() {
        ....
    }
}

public class Demo {
    public static void main(String[] args) {
        Person p = new Person(){
            @Override
            void great() {
                ....
            }
        };

        p.great();
    }
}
```

### Abstract & Anonymous Inner Class

```
abstract class A {
    public abstract void show();
}

public class Demo {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void show() {
                ....
            }
        };

        a.show();
    }
}
```

### What is interface

An interface in Java is a reference type, that can contain only abstract methods, default methods, static methods, constants. Interfaces are used to specify what a class must do, but not how to does it.

- All methods in an interface are public and abstract by default
- A class implements an interface using the implements keyword
- A class can implement multiple interfaces
- Interfaces can't be instantiated directly
- One interface can extends another interface

```
interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        ....
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

### Need of interface

- Achieve Abstraction
- Multiple Inheritance
- Loose Coupling
- Standardization
- Plug-and-plug Architecture

### What is enum

An enum (short for enumeration) in java is a special data type that defines a set of named constants. Enums are used to represent a fixed set of related values, such as days of the week, directions, or status code.

- Enums are type-safe and can have fields, methods and constructors
- Each value in an enum is an instance of the enum type.
- Enums can be used in switch statements

```
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Demo {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        switch(today) {
            case MONDAY:
                ....
                break;
            case FRIDAY:
                ...
                break;
            default:
                ....
        }
    }
}
```

### Enum Class

An enum class in java is a special type of class that represents a group of constants. Enums are used when you have a fixed set of related constants, such as days of the week, directions or status code.

- Enums are type-safe
- Each value in an enum is an instance of the enum type
- Enums can have fields, methods, and constructors
- Can be used in switch statements

```
enum Status {
    SUCCESS(200), ERROR(500);

    private int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

public class Demo {
    public static void main(String[] args) {
        Status s = Status.SUCCESS;
        System.out.println(s + " code: " + s.getCode());
    }
}
```

### Annotations

Annotations are special markers in Java that provide metadata (information) about code. They do not change the action of the code directly but can be used by the compiler or tools to generate code, check errors, or provide information at runtime.

- Annotations start with @ (e.g., @Override, @Deprecated)
- Used for compiler instructions, runtime processing and code generation
- Common in frameworks like Spring, JUnit, Hibernate etc

Common Built-in Annotations:

- @Override - Indicates a method overrides a superclass method
- @Deprecated - Marks a method/class as outdated
- @SuppressWarnings - Tells the compiler to ignore specific warnings

```
class Animal {
    @Deprecated
    public void oldMethod() {
        ...
    }

    @Override
    public String toString() {
        ....
    }
}
```

### Types of interface

1. Normal Interface / Regular Interface

- Contains only abstract methods (until java 7)
- From Java 8, can also have default and static method

```
interface Animal {
    void sound();
}
```

2. Functional Interface / SAM (Single Abstract Method Interface)

- An interface with exactly one abstract method
- Can have multiple default or static methods
- Used for lambda expressions
- Marked with @FunctionalInterface annotation

```
@FunctionalInterface
interface Drawable {
    void draw();
}
```

3. Marker Interface
   An interface with no methods or fields. Used to make a class for special behavior

### Functional Interface / SAM (Single Abstract Method Interface)

A functional interface is an interface that contains exactly one abstract method. It can have any number of default or static methods. Functional interfaces are used primarily for lambda expressions and method references.

- Has only one abstract method (Single Abstract Method - SAM)
- Can have multiple default or static methods
- Marked with @FunctionalInterface annotation
- Used extensively in Java's functional programming features

```
@FunctionalInterface
interface Drawable {
    void draw();
}

public class Demo {
    public static void main(String[] args) {
        Drawable d = new Drawable() {
            public void draw() {
                ....
            }
        }

        d.draw();
    }
}
```

### Lambda Expression

A lambda expression is a concise way to represent an anonymous function (a function without a name) that can be passed as an argument or stored in a variable. Lambda expressions are used primarily to implement functional interfaces.

```
@FunctionalInterface
interface Drawable {
    void draw();
}

public class Demo {
    public static void main (String[] args) {
        Drawable d = () -> System.out.println("Hello");

        d.draw();
    }
}
```

- Used to provide implementation for functional interfaces
- Makes code shorter and more readable
- Commonly used with Java Streams and Collections API

### Lambda Expression with return

A lambda expression can return a value just like a regular method. If the lambda body has a single expression, the return keyword is optional. For multiple statements, use curly braces and an explicit return.

```
@FunctionalInterface
interface Adder {
    int add(int i, int j);
}

public class Demo {
    public static void main(String[] args) {
        Adder a = (i, j) -> i+j;
        int result = a.add(2,3);
        System.out.println(result);
    }
}
```

### Errors

An error in Java is a serious problem that occurs during the execution of a program and is typically not meant to be handled by the application code. Errors usually indicate issues with the environment or the Java Virtual Machine (JVM) itself, such as running out of memory or system resources.

- Errors are represented by the Error class in Java
- Errors are unchecked
- Most errors can't be recovered from by the program

Types of Errors in Java:

1. Compile-time error:
   - Detected by the compiler before the program runs
   - Examples: Syntax errors, missing semicolons, undeclared variables, type mismatches
2. Runtime errors:
   - Occur during program execution
   - Examples: Division by zero, accessing invalid array index, null pointer access
3. Logical Errors:
   - Program compiles and runs, but produces incorrect results due to mistakes in logic.
   - Examples: Using the wrong formula for a calculation
4. JVM Errors:
   - Represented by subclasses of Error
   - Examples: OutOfMemoryError, StackOverflowError, VirtualMachineError

### What is Exception:

An exception is an event that disrupts the normal flow of a program's execution. It occurs when an error happens during runtime, such as dividing by zero, accessing an invalid array index or trying to open a file that doesn't exist.

- Exceptions are objects that represent errors or unusual conditions.
- Java provides a robust exception handling mechanism using try, catch, finally, throw and throws
- Exceptions can be checked or unchecked

```
public class Demo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### Try with multiple catch

```
public class Demo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
            int a = 10/0;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### Exception Hierarchy

```
java.lang.Throwable
   |
   |-- java.lang.Error
   |     (Serious problems, not meant to be caught)
   |     |-- OutOfMemoryError
   |     |-- StackOverflowError
   |     |-- VirtualMachineError
   |
   |-- java.lang.Exception
         (Conditions that a program might want to catch)
         |
         |-- java.lang.RuntimeException (Unchecked exceptions)
         |     |-- NullPointerException
         |     |-- ArithmeticException
         |     |-- ArrayIndexOutOfBoundsException
         |     |-- ClassCastException
         |
         |-- (Checked exceptions)
               |-- IOException
               |-- SQLException
               |-- FileNotFoundException
               |-- ClassNotFoundException
```

- Error: Serious issues related to the JVM or system
- Exception: Issues that can be handled in code. Checked Exception must be handled or declared. Unchecked exception not required to be handled.

### Exception throw keyword

The Throw keyword is used to explicitly throw an exception in Java. It is often used to throw custom exceptions or to indicate an error condition in code.

- Used inside a method or block to throw an exception object
- Can throw both checked and unchecked exceptions
- After throw, no code in the same block is executed

```
public class Demo {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void validateAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }

        System.out.println("Access granted");
    }
}
```

### Custom Exception

```
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Demo {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch(AgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if(age < 18) {
            throw new AgeException("Age must be 18 or above");
        }
        System.out.println("Access Granted");
    }
}
```

### Ducking exceptions using throws

Ducking an exception means passing the responsibility of handling an exception to the calling method, instead of handling it where it occurs. This is done using the throws keyword in the method signature.

- Used to declare that a method might throw certain checked exceptions.
- The caller of the method must handle or further declare the exception.

```
import java.io.IOException;

public class Demo {
    public static void readFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### BufferReader

```
import java.io.BufferReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        BufferReader br = new BufferReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println(name);
    }
}
```

### Scanner

```
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
    }
}
```

### Try with resources

The try-with-resources statement is used to automatically close resources (like files, streams, sockets) after use. Any object that implements the AutoCloseable interface can be used in try-with-resources.

- No need to explicitly close resources in a finally block
- Resources are closed automatically even if an exception occurs.

```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### Threads

A thread in Java is a lightweight unit of a process that executes independently.

- A process is a program in execution
- A process can have multiple threads (multithreading)
- All threads in a process share the same memory but run independently.

Life Cycle of a Thread:
A thread in java has several states:

- New - Created but not started
- Runnable - Ready to run but waiting for CPU
- Running - Currently executing
- Waiting / Timed waiting - Waiting for another thread to notify or for a timeout
- Terminated - Finished execution

Creating threads in Java:
There are two main ways:

1. Extending `Thread` class:

```
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // start thread
    }
}
```

2. Implementing `Runnable` interface

```
class MyThread implements Runnable {
    public void run(){
        System.out.println("Runnable thread: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}
```

\*\* Implementing `Runnable` interface is more flexible because Java allows multiple interface implementations.

3. Using Lambda (Shorter)

```
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Lambda thread: " + Thread.currentThread().getName());
        });

        t1.start();
    }
}
```

Thread methods:

- start() -> Starts the thread
- run() -> Code execute inside thread
- sleep(ms) -> Pause execution
- join() -> Wait for a thread to finish
- setPriority(int) -> set priority (1-10)
- isAlive() -> Check if thread is still running

Multithreading:

```
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        t1.start();
        t2.start();
    }
}
```

Thread Synchronization:
When multiple threads access shared data, race conditions can happen. Used `synchronized` keyword to prevent data corruption.

```
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() { return count; }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
```

----------- Section 03 Remaining Part will be after this ---------

### Maven Introduction

Maven is a powerful build application and project management tool for java projects. It simplifies the process of building, testing and deploying java applications by managing dependencies, compiling code and running tests and packaging the application.

- Dependency management: Automatically downloads and manages libraries (JAR) project needs.
- Standard directory structure: Enforces a standard project layout.
- Build lifecycle: Automates compiling, testing, packaging and deploying.
- Plugins: Extensible with plugins for various tasks.
- Project Object Model (POM): Uses a POM.xml file to configure the project, dependencies, plugins and build settings.

Example pom.xml Dependency:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <version>3.2.5</version>
</dependency>
```

### Maven in IDE

Most modern IDEs like IntelliJ IDEA, Eclipse and VSCode provide built-in support for Maven, making it easy to manage dependencies, build and run Java projects.

- Automatic Dependency Download: Add dependencies to pom.xml and the ide downloads them automatically.
- Project Structure: IDE recognize Maven's standard directory layout.
- Build & Run: Easily build, test and run maven projects with GUI buttons or context menus.
- Lifecycle Management: Run maven goals (like clean, install, package) directly from the IDE
- Plugin Integration: Use maven plugins for code analysis, testing and deployment within the IDE.
- Create new project on IntelliJ IDEA (Create New Project -> set Name, Location, Build System and JDK -> Click Create)

- Download & Install Apache Maven to local pc: https://maven.apache.org/

### Archetype in maven:

A Maven archetype is a template for generating a new Maven project structure. Archetypes provide a predefined project layout and sample files, making it easy to start new projects with best practices and standard configurations.

- Archetypes help quickly scaffold mew projects (e.g., Java Application, web app, spring boot app)
- The most common archetype is maven-archetype-quickstart for a basic java project.
- Can create own custom archetypes
- Creating a project with an archetype: `mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

### Getting Dependencies

In Maven, dependencies are external libraries that project needs. Declare them in pom.xml file, and Maven automatically downloads them from the Maven repository and adds them to projects classpath.

- How to add a dependency:

  1. Find the dependency on mvnrepository.com or another maven repository
  2. Copy the <dependency> block for the library
  3. Paste it inside the <dependencies> section of pom.xml file

  ```
      <dependencies>
          <!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
          <dependency>
              <groupId>com.mysql</groupId>
              <artifactId>mysql-connector-j</artifactId>
              <version>9.3.0</version>
          </dependency>

          <!-- https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core -->
          <dependency>
              <groupId>org.hibernate.orm</groupId>
              <artifactId>hibernate-core</artifactId>
              <version>7.0.0.Final</version>
          </dependency>
      </dependencies>
  ```

  4. When build project (mvn clean install or via IDE), Maven downloads the specified dependencies and makes them available to project automatically

### Effective POM

The Effective POM is the final configuration of Maven project after combining pom.xml with all inherited settings from parent POMs, super POM, and active profiles. It shows the complete set of configurations, dependencies, plugins and settings that maven will use to build project

- Combines project's pom.xml, parent POMs and maven's default super POM
- Shows all inherited defines in pom.xml
- Useful for debugging and understanding the actual build configuration
- How to viw the effective pom: Command Line (mvn help:effective-pom) or IDE (Right-click the project → Maven → Show Effective POM (or similar option))

### Maven in Eclipse

Eclipse IDE for Enterprise Java and Web Developers.

- Click File -> New -> Maven Project -> Fill all settings

### How maven works BTS

1. Reads the pom.xml:
   - Maven starts by reading project's pom.xml file, which defines dependencies, plugins, build settings and project metadata.
2. Build lifecycle & phases:
   - Maven uses a standard build lifecycle with phases like validate, compile, test, package, install and deploy.
   - When run a command (e.g., mvn install) Maven executes all phases up to and including install
3. Dependencies Resolution:
   - Maven checks local repository (/.m2/repository) for required dependencies
   - If a dependency is missing, Maven downloads it from the central repository and caches it locally
   - Maven also resolves transitive dependencies

### JDBC Introduction

JDBC (Java Database Connectivity) is a Java API that allows Java applications to connect to and interact with relational databases (like MySQL, Oracle, PostgreSQL etc)

- Provides a standard interface for connecting to databases, executing SQL queries and retrieving results.
- JDBC is part of the Java Standard Edition platform
- Works with any database that provides a JDBC driver.

Main steps in JDBC:

1. Load the JDBC driver:
   Example: Class.forName("com.mysql.cj.jdbc.Driver");
2. Establish a connection
   Example: Connection con = DriverManager.getConnection(url, user, password);
3. Create a statement:
   Example: Statement stmt = con.createStatement();
4. Execute SQL Queries:
   Example: ResultSet rs = stmt.executeQuery("SELECT \* FROM users");
5. Process the results
6. Close the connection

```
import java.sql.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/dbname", "username", "password");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
        con.close();
    }
}
```

### Postgres Setup

- Download & Install PostgreSQL: https://www.postgresql.org/
- Set the database superuser (postgres) password for local setup: 123
- Postgres Database Port: 5433
- Postgres GUI: pgAdmin 4
- Create a database using the pgAdmin 4 gui or the below command:

```
CREATE DATABASE demo
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LOCALE_PROVIDER = 'libc'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
```

- Create a table name 'student' with sid(integer), sname(text) & marks(integer)
- Inter data: `INSERT INTO student VALUES(1, 'Yeasin', 99);`

### JDBC setup

1. Add JDBC Driver Dependency
   - For Maven, add the database driver dependency to pom.xml
   ```
   <dependency>
       <groupId>org.postgresql</groupId>
       <artifactId>postgresql</artifactId>
       <version>42.7.3</version>
   </dependency>
   ```
2. Load the JDBC Driver
   ```
   Class.forName("org.postgresql.Driver");
   ```
3. Establish a connection
   ```
   Connection con = DriverManager.getConnection(
   "jdbc:postgresql://localhost:5433/demo", "postgres", "123");
   ```
4. Create Statement and Execute Queries
   ```
   Statement stmt = con.createStatement();
   ResultSet rs = stmt.executeQuery("SELECT * FROM student");
   while (rs.next()) {
       System.out.println(rs.getInt("sid") + " " + rs.getString("sname") + " " + rs.getInt("marks"));
   }
   ```
5. Close the Connection
   ```
   con.close();
   ```

### Postgres Library Jar

- Create a Java Project in Intellij IDEA
- Add the postgreSQL maven dependency in pom.xml

```
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.7.6</version>
    </dependency>
```

- Or download the jar from here: https://jdbc.postgresql.org/

### Connecting Java and DB, Execute and process, fetching all records

```
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load JDBC Driver
        Class.forName("org.postgresql.Driver");

        // Establish a connection
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demo", "postgres", "123");

        // Create Statement and execute queries
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        System.out.println("sid - sname - marks");
        while (rs.next()){
            System.out.println(rs.getInt("sid") + " - " + rs.getString("sname") + " - " + rs.getInt("marks"));
        }

        // Close connection
        con.close();
    }
}
```

### CRUD Operations

```
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load JDBC Driver
        Class.forName("org.postgresql.Driver");

        // Establish a connection
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demo", "postgres", "123");

        // Create Statement and execute queries
        Statement stmt = con.createStatement();

        // Create Operation
        stmt.execute("INSERT INTO STUDENT VALUES(3, 'Adib', 80)");
        System.out.println("Record Created");

        // Update Operation
        stmt.execute("UPDATE student set sname='Max' WHERE sid=3");
        System.out.println("Record Updated");

        // Delete Operation
        stmt.execute("DELETE FROM student WHERE sid=3");
        System.out.println("Record Deleted");

        // Read Operation
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        System.out.println("sid - sname - marks");
        while (rs.next()){
            System.out.println(rs.getInt("sid") + " - " + rs.getString("sname") + " - " + rs.getInt("marks"));
        }

        // Close connection
        con.close();
    }
}
```

### Problems with statements

1. SQL Injection Risk:
   - Using statement with string concatenation allows user input to modify the SQL query, making application vulnerable to SQL injection attacks
   - Example:
   ```
   String sql = "SELECT * FROM users WHERE username='" + userInput + "'";
   stmt.executeQuery(sql);
   ```
2. Difficult to handle dynamic data
3. Performance Issues
4. No Parameter Binding
5. Code Readability and Maintainability

### PreparedStatement in JDBC

A PrepareStatement is a JDBC interface used to execute parameterized SQL queries safely and efficiently. It solves many problems associated with Statement.

- Prevents SQL injection
- Easier to handle dynamic data
- Better performance
- Type Safety

```
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demo", "postgres", "123");

        // Insert Operation
        String insertSql = "INSERT INTO student (sid, sname, marks) VALUES (?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(insertSql);
        pstmt.setInt(1, 4);
        pstmt.setString(2, "Alex");
        pstmt.setInt(3, 85);
        pstmt.executeUpdate();

        // Read Operation
        String selectSql = "SELECT * FROM student WHERE sid = ?";
        pstmt = con.prepareStatement(selectSql);
        pstmt.setInt(1, 4);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("sid") + " - " + rs.getString("sname") + " - " + rs.getInt("marks"));
        }

        con.close();
    }
}
```

### What is Hibernate:

Hibernate is a popular open-source Object-Relational Mapping (ORM) framework for Java. It simplifies database interactions by mapping Java objects (classes) to database tabales, allowing developers to work with databases using standard Java objects instead of SQL queries.

- Automatic Table Mapping: Maps Java classes to database tables and Java fields to table columns.
- Database Independence: Works with different databases without changing code.
- HQL (Hibernate Query Language): Allows quering the database using object-oriented syntax.
- Automatic CRUD operations: Handles create, read, update and delete operations automatically.
- Caching: Improves performance by caching frequently used data.
- Transaction Management: Integrates with Java transactions APIs.

```
// Example: Saving an object
Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();
Student s = new Student(1,'John', 90);
session.save(s);
tx.commit();
session.close();
```

### Project Setup for Hibernate

- Create a project (set name, location, Build System, JDK) and create
- Create a package name `com.yeasin` inside src > main > java folder
- Create a class name `Main.java` inside the package

- Add this postgresql JDBC driver maven dependency in pom.xml file

```
<!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.5</version>
</dependency>
```

- Add this Hibernate maven dependency in pom.xml file

```
<!-- https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core -->
<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>7.0.0.Final</version>
</dependency>
```

### Save Data

- Add the below dependencies in pom.xml file

```
<dependencies>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.7.3</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.6.3.Final</version>
        </dependency>
    </dependencies>
```

- Create a hibernate.cfg.xml file inside src > main and add this as JDBC postgresql driver connectivity

```
<hibernate-configuration xmlns="http://www.hibernate.org/xsd/orm/cfg">
    <session-factory>
        <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
        <property name="hibernate.connection.url">jdbc:postgresql://localhost:5433/demo</property>
        <property name="hibernate.connection.username">postgres</property>
        <property name="hibernate.connection.password">123</property>
        <property name="hibernate.hbm2ddl.auto">update</property>
    </session-factory>
</hibernate-configuration>
```

- Create a package com.yeasin inside src > main > java
- Create Student class inside the package

```
package com.yeasin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int sid;
    private String sname;
    private int marks;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", marks=" + marks +
                '}';
    }
}
```

- Update the main class

```
package com.yeasin;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.setSid(4);
       s1.setSname("Yeasin Arafat");
       s1.setMarks(25);

       SessionFactory sf = new Configuration().addAnnotatedClass(com.yeasin.Student.class).configure().buildSessionFactory();
       Session session = sf.openSession();

       Transaction transaction = session.beginTransaction();
       session.persist(s1);
       transaction.commit();
       session.close();
       sf.close();

       System.out.println(s1);
    }
}
```

### Show SQL config

Add the below property in hibernate.cfg.xml file for:

- To show SQL: `<property name="hibernate.show_sql">true</property>`
- To show the formatter sql: `<property name="hibernate.format_sql">true</property>`
- To set the DBMS dialect: `<property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>`

### Fetching the data

```
Student s2 = session.get(Student.class, 1);
```

--------- Section 06 Remaining Part will be after this -------

### Introduction to Spring

Spring is a powerful, lightweight and popular open-source framework for building enterprise Java applications. It provides comprehensive infrastructure support for developing Java applications easily and efficiently.

- Inversion of Control (IoC): Manages object creation and dependencies using Dependency Injection (DI)
- Aspect-Oriented Programming (AOP): Separates cross-cutting concerns (like logging, security) from business logic.
- Modular: Can use only what need (Spring Core, Spring MVC, Spring Data, Spring Boot etc)
- Transaction Management: Simplifies database transaction handling
- Integration: Works well with other frameworks and technologies (Hibernate, JPA, JMS, etc)
- Testability: Makes unit testing and integration testing easier.

Why use Spring?

- Reduces boilerplate code
- Promotes loose coupling and easier maintainability
- Provides a consistant programming model
- Widely used in the industry for web, microservices and enterprise applications

### Spring Docs

- Sping Website: https://spring.io/
- Spring Documentation: https://docs.spring.io/spring-framework/reference/index.html

### IDE for Spring

1. IntelliJ IDEA
   - Widely used for Spring and Spring Boot development
   - Excellent Spring integration, code completion and project templates
2. Eclipse IDE
   - Popular, free and extensible
   - Support Spring development via plugins (Spring Tools, Spring IDE)
3. VS Code
   - Lightweight and fast
   - Supports Spring Boot via extensions (e.g., Spring Boot Tools, Java Extension Pack)

### IoC & DI

Inversion of Control (IoC):

- IoC is a design principle where the control of object creation and dependency management is transferred from the application code to a container or framework
- In Spring, the IoC container is responsible for creating, configuring and managing the lifecycle of objects (beans)

Dependency Injection (DI):

- DI is a specific type of IoC where dependencies (objects a class needs) are provided to a class, rather than the class creating them itself.
- In Spring, DI can be done via constructor injection, setter injection or field injection.

```
public class StudentService {
    private StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }
}
```

### Spring VS Spring Boot

- Setup: Spring needs manual configuration, more boilerplate. Spring boot has auto-configuration, minimal setup.
- Project type: Spring is general-purpose modular, spring boot is convention-over-configuration, rapid development
- Dependencies: Spring add and manage dependencies manually. Spring boot starter dependencies simplify dependency management.
- Embeded Server: Spring does not included any default. Spring boot comes with embedded servers (Tomcat, Jetty etc)
- Production ready: Spring needs extra setup for monitoring, metrics, etc. Spring boot has built-in production features
- Opinionated: Spring is flexible, but requires more decisions. Spring boot opinionated defaults for faster development
- Main use: Spring is for large, complex or legacy enterprise projects. Spring boot is for Microservices, rest apis, quick prototypes.

### First Spring Boot App

1. Using VSCode

   - Install "Extension Pack for Java" and "Spring Boot Extension Pack" extensions
   - From view, click command Palette and type Spring Initilize and create a spring boot app

2. Using IntelliJ IDEA

   - Using create new project

3. Using Spring Initializer Web
   - Visit https://start.spring.io/ and create spring boot project

### DI using Spring Boot

Spring boot makes dependency injection (DI) easy by automatically managing beans and their dependencies using annotations.

- Create a service class

```
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public String getStudentName() {
        return "John Doe";
    }
}
```

- Inject the Service into a Controller

```
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;

    // Constructor Injection (recommended)
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public String getStudent() {
        return studentService.getStudentName();
    }
}
```

- @Service and @RestController mark classes as beans managed by spring boot
- @Autowired tells Spring to inject the StudentService bean into the controller
- Spring Boot automatically creates and wires the beans at runtime.

### Autowiring in Spring Boot

Autowiring in spring boot is the process where the Spring Framework automatically injects the required dependencies into beans at runtime.

- Use the @Autowired annotation to let Spring resolve and inject the collaborating bean

- Create a Laptop class

```
package org.yeasin.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void compile() {
        System.out.println("Laptop is compiling");
    }
}

```

- Create a Alient Class Autowiring Laptop bean

```
package org.yeasin.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Laptop laptop;

    public void code() {
        laptop.compile();
    }
}
```

- Spring Boot Application Main Class

```
package org.yeasin.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
        Alien obj = context.getBean(Alien.class);
        obj.code();
    }
}

```

- @Autowired can be used on fields, constructor or setter methods
- Spring Boot automatically scans and wires beans marked with @Component, @Service, @Repository, @Controller
- Constructor injection is recommended for required dependencies

### Create Spring Project (Maven Project) Not Spring Boot

- Using IntelliJ Idea, New Project -> Maven Archetype (Name, Location, JDK, Catalog, Archetype, Advanced Settings)
- Add the Spring Context package to work with Spring ApplicationContext inside pom.xml

```
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.2.7</version>
</dependency>
```

- src -> main -> java -> org.yeasin -> App.java

```
package org.yeasin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = (Alien) context.getBean("alien");
        alien.code();
    }
}

```

- src -> main -> java -> org.yeasin -> Alien.java

```
package org.yeasin;

public class Alien {
    public void code() {
        System.out.println("Alien is coding");
    }
}

```

- src -> main -> resources -> spring.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="alien" class="org.yeasin.Alien"></bean>

</beans>
```

### Object Creation

Spring creats objects on the below line

`ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");`

based on spring.xml file.

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="alien" class="org.yeasin.Alien"></bean>

</beans>
```

Spring creates the objects of the including classes in spring.xml file. If a class is not defined in spring.xml file, then spring will not create not objects.

### Bean Scopes in Spring:

Spring provides several bean scopes that defines the lifecycle and visibility of beans managed by the Spring container.
Scopes are:

1. singleton: (Default) Only one instance per Spring container. Shared across the entire application.
2. prototype: A new instance is created every time the bean is requested from the container.
3. request: (Web Only) One instance per HTTP request.
4. session: (Web Only) One instance per HTTP session.
5. application: (Web Only) One instance per ServerlContext (application-wide)
6. websocket: (Web Only) One instance per WebSocket session

Setting Bean Scope:

1. Annotation Based:

```
@Component
@Scope("prototype")
public class Alient {

}
```

2. XML Based:

```
<bean id="alien" class="org.yeasin.Alient" scope="prototype" />
```

### Setter Injection

Setter Injection is a type of Dependency Injection where the Spring container injects dependencies into a bean using setter methods.

- Spring calls the public setter method of a bean after creating the bean instance
- The dependency is passed as an argument to the setter method

Annotation-based setter injection:

```
@Component
public class Alien {
    private Laptop laptop;
    private int age;

    @Autowired
    public void Alien(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void code() {
        laptop.compile();
    }
}
```

XML-based setter injection:

```
<bean id="alien" class="org.yeasin.Alien">
    <property name="laptop" ref="laptop" />
    <property name="age" value="21" />
</bean>

<bean id="laptop" class="org.yeasin.Laptop"  />
```

### Constructor Injection

Constructor Injection is a type of Dependency Injection where the Spring container injects dependencies into a bean via its constructor. This is the recommended way for required dependencies, as it ensures that the bean is always created with all its required collaborators.

Annotation-based Constructor Injection:

```
@Component
public class Alien {
    private final Laptop laptop;
    private final int age;

    @Autowired
    public Alien(Laptop laptop){
        this.laptop = laptop;
        this.age = 21;
    }

    public void code() {
        laptop.compile();
    }
}
```

XML-based Constructor Injection:

```
<bean id="alien" class="org.yeasin.Alien">
    <constructor-arg ref="laptop" />
    <constructor-arg value="21" />
</bean>

<bean id="laptop" class="org.yeasin.Laptop" />
```
