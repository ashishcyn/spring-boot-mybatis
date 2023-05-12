# spring-boot-mybatis
SpringBoot MyBatis Project


## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [API](#api)



## General info
This project is simple SpringBoot MyBatis Project.

## Technologies
Project is created with: 
* https://start.spring.io/
* Springboot 3.0.6
* Java 17
* Maven
* Spring Web
* H2 Database
* MyBatis Framework

## Setup

### H2 Database
* H2 in memory database is used for this project
* DB Console:http://localhost:8080/h2-console/
* JDBC URL: refer application.properties
* User Name: refer application.properties 
* Password: refer application.properties
* Sample Data: refer data.sql

### Local run 
* Build the project using maven command: `mvn clean install`
* Run the spring-boot-mybatis project locally: `mvn spring-boot:run` 
* Access the application at: http://localhost:8080/


### API
* Get All Users: http://localhost:8080/rest/user/all
* Insert User: http://localhost:8080/rest/user/insert
* Update User: http://localhost:8080/rest/user/updateUser
* Delete User: http://localhost:8080/rest/user/deleteUser



<!-- 
Reference:
https://www.youtube.com/watch?v=ZP8Um12Z_mk
https://www.youtube.com/watch?v=E0cRlFNpiL0
-->