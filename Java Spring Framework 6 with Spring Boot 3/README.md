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

### Stack & Heap
In java, stack & heap are two areas of memory used for different purposes:
Stack:
    * Stores: Local variables, method calls and references to objects
    * Scope: Each thread has it's own stack
    * Lifetime: Variables are created when a method is called and destroyed when the method exits
    * Speed: Very fast access
    * Memory Management: Handled automatically LIFO - Last In First Out
    * Example:

```
    int x = 10;
```

Heap:
    * Stores: All Java Objects (instances created with new)
    * Scope: Shared among all threads
    * Lifetime: Objects remain until they are no longer referenced and garbage collected
    * Speed: Slower than stack
    * Memory management: Managed by java garbage collector
    * Example:
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
* Fixed size
* Homogeneous data
* No Built-in methods
* Inefficient insert/delete
* Wasted memory
* No type safety for object arrays
* No support for generics

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
* By default strings are immutable
* Mutable -> Change (String Buffer, String Builder)
* Immutable -> can't change

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
    * Thread-safe (synchronized): Multiple threads can use it safely.
    * Slower than StringBuilder due to synchronization
    * Use when thread safety is required

StringBuilder:
    * Not thread-safe: Not safe for use by multiple threads
    * Faster than StringBuffer
    * Use when thread safety is not needed

### Static Variable
A static variable is a variable that belongs to the class, not to any specific object. It is shared among all instances/objects of that class. 

* Declared using the static keyword
* Only one copy exists, regardless of how many objects are created.
* Can be accessed using the class name, (ClassName.variable)
* Useful for values that should be common to all objects

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

* Declare using the static keyword
* Can be accessed using the class name (ClassName.methodName())
* Can only access static variables and other static methods directly
* Cannot use this or super keywords

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

* Declared using static {..}
* Used to initialize static variables or perform class-level setup
* Runs automatically when the class is loaded

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

* Loads the class into memory
* Executes static blocks and static initializations of the class
* Commonly used for loading JDBC drivers or frameworks that require dynamic class loading

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