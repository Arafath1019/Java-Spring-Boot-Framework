# Java Spring Framework 6 with Spring Boot 3

### Source Code Links
* Java Source Code: https://github.com/navinreddy20/Javacode
* Spring Source Code: https://github.com/navinreddy20/spring6-course
* Microservices Source Code: https://github.com/navinreddy20/MicroserviceTutorials

### Core Java
#### JDK Setup
* IDE (Integrated Development Environment): VS Code, Eclipse, IntelliJ Idea, NetBeans
* Compiler
* JDK (Java Development Kit)
* JDK Download: https://www.oracle.com/java/technologies/downloads/#jdk24-mac
* Check java & javac version
```
$ java --version
$ javac --version
```
* Download VS Code: https://code.visualstudio.com/download

#### IntelliJ Idea Setup
* Download IntelliJ Idea: https://www.jetbrains.com/idea/

#### First Code in Java
* JShell (Java Shell Tool)
* Entering JShell, write jshell in terminal
```
$ jshell
$ 2 + 3
$ System.out.println("Hello World");
```
* Java Code
```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

* Compile Java Code: `$javac filename.java`

#### How Java Works
<img src="../images/2.png" >

### Variables
* Java is Strongly Typed Language
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
* Data Type -> Primitive Type
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
* Java automatically converts a smaller data type into a larger data type
* It happens implicitly 
* No data loss happens here
```
int a =10;
long b = a;
float c = b;
```
* Order of data types (small -> big)
byte -> short -> int -> float -> double

### Type Casting (Manual/Explicit Casting)
* Manually convert a larger data type into a smaller data type
* Have to tell Java what is trying to do
* Risk of data loss if the value is too big
```
double d = 9.78;
int i = (int) d;
```

### Arithmetic Operators
* Addition (+)
* Subtraction (-)
* Multiplication (*)
* Division (/)
* Modulus Operator to get reminder (%)
* +=, -=, *=, /=, %=
* Increment Operator -> i++ (post-increment), ++i (pre-increment)
* Decrement Operator -> i-- (post-decrement), --i (pre-decrement)

### Relational Operators
* >, <, >=, <=, ==, !=

### Logical Operator
* &&, ||, !

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
* Object Oriented Programming
* Object - Properties and Behavior
* Class
* Create a class file -> Compiled to create a byte code -> JVM run this byte code and object is created

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

* JDK (Java Development Kit) -> Convert the java code into byte code
* JVM (Java Virtual Machine) -> Runs the Java Code
* JRE (Java Runtime Environment) -> Provide the additional in-built classes for running java code

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