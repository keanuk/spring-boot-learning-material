# Spring Boot Lesson Plan

## Format

The contents of this lesson plan are intended to be presented in a video format with the presenter providing audio commentary and presenting the contents of their screen.
Each lesson is intended to be 30-60 minutes in length, depending on feedback and questions from the audience.

## Prerequisites and Setup
- Basic Java knowledge
- Java 8 or later
- Text Editor or Java IDE (e.g. Atom, Visual Studio Code, IntelliJ IDEA, etc.)
- REST Client (e.g. Insomnia)

## Proposed Schedule

### Lesson 1: Introduction

In the first lesson, we will learn what Spring Boot is and how we can use it to build a simple RESTful API. 
This lesson will focus more on the concepts of Spring Boot and what types of applications it can be used for. 
We can also go over the prerequisites and individual setups if anyone has any problems on their personal devices.

### Lesson 2: Initializing New Spring Boot Project

In this lesson we will create a new Spring Boot project and go over the basic model of a Spring Boot application.
The initialization will be done in a step-by-step manner, but we will also go over existing tools that allow developers to expidite the process.
As we are creating the project, we will briefly cover what each portion of the project is designed to do.

### Lesson 3: Detailed Overview of the Model

In this lesson, we will go over the overall structure of a Spring Boot application and how each part interacts with the other.
Specifically, we will focus on simple controller, service, repository, and model classes.
By the end of the lesson we will have a basic Spring Boot application that we can interact with through a REST client or a web browser with at least one endpoint.

### Lesson 4: Adding Endpoints and Services

In this lesson we will add additonal endpoints to the controller with corresponding services and repository functions.
We will also cover ways we can expand the model to handle multiple different JSON objects.
This lesson will focus on the different types of REST API calls that can be made to the application.

### Lesson 5: Connecting to a Database

*This lesson is dependent on whether it is easy enough to acquire the proper permissions on company devices to create a demo*

In this lesson we will connect the repository to a database.
We will go over translating SQL queries from the database to Java code using JPA.
We will demonstrate how data is converted from a JSON object to an SQL item stored in a table and vice versa.

### Lesson 6: Testing

In this lesson we will learn how to test our application both with Java and using our REST clients.
For Java tests we will be creating unit tests using JUnit and some other libraries to automate functionality.
For our REST client tests we will be using Insomnia and will go over certain extensions that can be used to speed up running multiple tests at once.

### Lesson 7: Building a GUI

In this lesson we will go over how to connect our Spring Boot API to a graphical front end.
We will be using a web framework such as Angular to create a fairly simple interface that can pass data to our API.
This should give viewers a good idea of the complete pipeline from the user-facing portion of an application to the database.

### Lesson 8 (and beyond): Connecting Addtional Services

In this lesson we can cover other commonly used services such as Kafka, Voltage, and Elasticsearch.
This will involve the creation of several other classes which can be interacted with from our Spring Boot application's service layer.

## References

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Initializr](https://start.spring.io/)