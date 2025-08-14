
# Simple Guice Project - Training Material

## Description
This project demonstrates a basic usage of Google Guice in a Java application. It includes:
- An interface (`HelloWorld`) and its implementation (`HelloWorldImpl`).
- A service class (`HelloWorldService`) that depends on the interface.
- A Guice module (`HelloWorldModule`) to configure bindings.
- An application entry point (`Main`) that uses Guice to inject dependencies and run the service.

## Task Breakdown
1. **Set up the project structure**
	- Create the necessary folders and files for a Maven Java project.
2. **Define the interface and implementation**
	- Write the `HelloWorld` interface and its implementation `HelloWorldImpl`.
3. **Create the service class**
	- Implement `HelloWorldService` that depends on the `HelloWorld` interface.
4. **Configure Guice module**
	- Write `HelloWorldModule` to bind the interface to its implementation.
5. **Write the application entry point**
	- Implement `Main` to use Guice for dependency injection and run the service.
6. **Test the application**
	- Write and run tests (e.g., `MainTest`) to verify the setup.

## Project Structure
```
demo/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── khdour/
│   │               ├── Main.java
│   │               ├── HelloWorld.java
│   │               ├── HelloWorldImpl.java
│   │               ├── HelloWorldModule.java
│   │               └── HelloWorldService.java
│   └── test/
│       └── java/
│           └── com/
│               └── khdour/
│                   └── MainTest.java
└── target/
	└── ... (compiled classes)
```

## Objective
The objective of this task is to help to understanding the basics of dependency injection in Java using Google Guice. and learn how to set up a simple project, define interfaces and implementations, configure modules, and use Guice to manage dependencies.

## Outcomes
- Understand the concept of dependency injection and why it is useful.
- Learn how to use Google Guice to inject dependencies in a Java application.
- Be able to create and configure Guice modules.
- Practice writing and running simple Java code with Guice.

## Things to Think About
- Why is dependency injection preferred over manual instantiation of objects?
- How does Guice help manage dependencies and improve code maintainability?
- What are the benefits of using interfaces and separating implementation from usage?
- How can you extend this project to add more services or change implementations without modifying existing code?

---
This project is a starting point for learning dependency injection with Guice. Explore the code, try modifying bindings, and experiment with different implementations to deepen your understanding.
