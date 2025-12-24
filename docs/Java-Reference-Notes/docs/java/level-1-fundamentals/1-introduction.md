!!! tip "Deadlock Warning"
    Deadlock occurs when two or more threads are blocked forever, waiting for one another. This is often caused by incorrect nesting of synchronized blocks.

    Always acquire locks in the same order across all threads to avoid this critical issue.
1️⃣ History of Java (Detailed)
==============================

### 1.1 Origin of Java

*   Java was developed by **James Gosling** and his team at **Sun Microsystems**.
    
*   The work started in **1991** as part of the **Green Project**.
    
*   The goal was to create a language for **consumer electronic devices** such as TVs, set-top boxes, and embedded systems.
    

### 1.2 Why Java Was Needed

Before Java:

*   C and C++ were **platform dependent**
    
*   Memory management was **manual**
    
*   Programs were **unsafe** due to pointers
    
*   Code portability was difficult
    

Java aimed to solve:

*   Platform dependency
    
*   Security issues
    
*   Complex memory management
    
*   Poor portability
    

### 1.3 Evolution of Java

*   Initially named **Oak**
    
*   Renamed to **Java** in 1995
    
*   First public release: **Java 1.0**
    
*   **Java 2 (1998)** introduced:
    
    *   J2SE
        
    *   J2EE
        
    *   J2ME
        
*   **2010**: Oracle acquired Sun Microsystems
    
*   **Java 8 (2014)**: Most revolutionary release
    
*   **Java 17+**: Long-term support (LTS)
    

### 1.4 Java Philosophy

> **Write Once, Run Anywhere (WORA)**

This philosophy means:

*   Compile once
    
*   Run the same code on any operating system
    

2️⃣ Features of Java (Detailed)
===============================

### 2.1 Simple

*   No explicit pointers
    
*   Automatic garbage collection
    
*   Easy syntax compared to C++
    

### 2.2 Object-Oriented

Java supports:

*   **Encapsulation** – data hiding
    
*   **Inheritance** – code reusability
    
*   **Polymorphism** – many forms
    
*   **Abstraction** – hiding implementation
    

### 2.3 Platform Independent

*   Java code is compiled into **bytecode**
    
*   Bytecode runs on JVM available for different OS
    

### 2.4 Secure

Security is provided by:

*   Bytecode verifier
    
*   No pointer arithmetic
    
*   ClassLoader security
    
*   Security Manager
    

### 2.5 Robust

*   Strong exception handling
    
*   Garbage collection
    
*   Compile-time and runtime checking
    

### 2.6 Portable

*   Same bytecode works everywhere
    
*   Fixed size primitive data types
    

### 2.7 Multithreaded

*   Built-in thread support
    
*   Concurrent execution
    
*   Efficient CPU utilization
    

### 2.8 High Performance

*   JIT compiler improves execution speed
    
*   Adaptive runtime optimization
    

### 2.9 Distributed

*   Supports RMI
    
*   Supports web services
    
*   Supports networking APIs
    

### 2.10 Dynamic

*   Classes loaded at runtime
    
*   Supports reflection
    

3️⃣ Java Editions (SE, EE, ME)
==============================

3.1 Java SE (Standard Edition)
------------------------------

Core Java platform.

### Includes:

*   Language fundamentals
    
*   OOP concepts
    
*   Collections
    
*   Multithreading
    
*   I/O
    
*   Networking
    
*   JDBC
    

### Used for:

*   Standalone applications
    
*   Desktop applications
    
*   Core backend logic
    

3.2 Java EE (Enterprise Edition)
--------------------------------

Now called **Jakarta EE**

### Built on top of Java SE

### Includes:

*   Servlets
    
*   JSP
    
*   EJB
    
*   JPA
    
*   JMS
    
*   Web services
    

### Used for:

*   Enterprise applications
    
*   Large-scale distributed systems
    
*   Banking & financial apps
    

3.3 Java ME (Micro Edition)
---------------------------

### Designed for:

*   Embedded systems
    
*   IoT devices
    
*   Mobile and consumer electronics
    

### Comparison Summary

EditionPurposeJava SECore programmingJava EEEnterprise applicationsJava MEEmbedded & mobile

4️⃣ JDK vs JRE vs JVM (Detailed)
================================

### 4.1 JVM (Java Virtual Machine)

*   Executes Java bytecode
    
*   Platform dependent
    
*   Responsible for:
    
    *   Memory management
        
    *   Garbage collection
        
    *   Thread management
        
    *   Security
        

### 4.2 JRE (Java Runtime Environment)

*   Provides runtime environment
    
*   Contains:
    
    *   JVM
        
    *   Core Java libraries
        

Used to **run** Java applications.

### 4.3 JDK (Java Development Kit)

*   Used for **development**
    
*   Contains:
    
    *   JRE
        
    *   Compiler (javac)
        
    *   Debugger
        
    *   Tools (jar, javadoc)
        

### Relationship Diagram

```   JDK   └── JRE        └── JVM   `

5️⃣ Java Program Structure
==========================

```java hl_lines="4 7"
public class ImmutableClass {
    private final String name; // (1)
    
    // Line 4 is highlighted
    public ImmutableClass(String name) { 
        this.name = name;
    }

    // Line 7 is highlighted
    public String getName() {
        return name; 
    }
}
```
### Explanation

1.  **Package statement** – organizes classes
    
2.  **Import statement** – imports classes
    
3.  **Class declaration** – blueprint
    
4.  **Main method** – execution entry point
    
5.  **Statements** – instructions
    

### Rules

*   Only one public class per file
    
*   Filename must match public class name
    
*   main method signature must be exact
    

6️⃣ First Java Program (Detailed)
=================================

```java
class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```

### Explanation of main method

*   public – accessible by JVM
    
*   static – no object needed
    
*   void – returns nothing
    
*   String\[\] args – command-line arguments
    

7️⃣ Compilation & Execution Flow
================================

### Step-by-Step

1.  Write source code (.java)
    
2.  Compile using javac
    
3.  Bytecode (.class) generated
    
4.  JVM loads bytecode
    
5.  Bytecode verified
    
6.  JIT converts to native code
    
7.  CPU executes instructions
    

### Commands

```cmd
  javac Hello.java  
  java Hello   
```

8️⃣ Bytecode & Platform Independence
====================================

### Bytecode

*   Intermediate code
    
*   Generated by Java compiler
    
*   Stored in .class file
    

### Platform Independence Explained

*   Same bytecode runs on:
    
    *   Windows JVM
        
    *   Linux JVM
        
    *   macOS JVM
        
``` 
Source     ↓  Bytecode     ↓  JVM (OS Specific)     ↓  Execution   

```