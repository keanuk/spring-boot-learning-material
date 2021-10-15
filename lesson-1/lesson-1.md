# Lesson 1: Introduction

In this lesson we will cover the fundamentals of Spring Boot. We will discuss what it is used for, the tools and libraries that it is built upon, and we will create a demo application to showcase some of the basic functionality.

## What is Spring Boot used for?

Spring Boot is primarily used to create APIs (Application Programming Interface) that serve as an application's back end. It is frequently used by enterprises as an intermediary between a GUI (Graphical User Interface) application and a database.

## What is a REST API?

REST (REpresentational State Transfer) is a set of commands commonly used with web interactions. The ones we will look at are the following:
- GET: read
- POST: write
- PUT: update
- DELETE: delete

GUI Application -> REST API (Spring Boot Application) -> Database

## What is the Spring Framework?

The Spring Framework is a collection of libraries and configurations that take care of the more mundane tasks in creating a web application. It gained popularity because it significantly speeds up development time and abstracts some of the more difficult implementation details for back end applications.

Supports 3 languages:
1. Java
2. Kotlin
3. Groovy

## What is Spring Boot?

Spring Boot is a pre-configured setup of the Spring Framework. A Spring Boot application is still a Spring application, it just removes some of the setup and configuration by giving developers a set of 'sane' defaults to start with.

Controller (Endpoints) -> Service (Business logic) -> Repository (DAO)

## Useful Utilities

We will be using several software utilities to demonstrate some Spring Boot capabilities.

### Editor

- Visual Studio Code
- IntelliJ
- Eclipse

### Browser

- Firefox
- Chromium
- Safari

### API Testing Tools

- Postman (RIP)
- Insomnia
- SoapUI

## Setting up a Spring Boot Application

We are going to create a sample REST API to showcase the process of creating a Spring Boot Application.

[Spring Initializr](https://start.spring.io/)

### Dependencies

		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>


## GET Request

Reads data.

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable("id") UUID id) {
        return mediaService.getSongById(id);
    }


## POST Request

Writes data.

    @PostMapping("/save")
    public int saveSong(@RequestBody @Valid final Song song) {
        return mediaService.insertSong(song);
    }


## PUT Request

Updates data

    @PutMapping("/update")
    public int updateSongById(@RequestParam(value = "id") UUID id, @RequestBody Song song) {
        return mediaService.updateSongById(id, song);
    }


## DELETE Request

Deletes data

    @DeleteMapping("/delete")
    public int deleteSongById(@RequestParam(value = "id") UUID id) {
        return mediaService.deleteSongById(id);
    }

    
## Questions

1. 