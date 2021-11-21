#CINEMA-SERVICE<br>

---
## Table of contents
* [About a project](#about-a-project)
* [Features](#features)
* [Technologies](#technologies)
* [Setup](#setup)
***

## About a project
<a id="about-a-project"></a>
Cinema service is a basic web application for online booking of cinema tickets.<br> 
In this pet-project, the client can register, log in, and also perform all CRUD operations on the database.<br><br>
The project was created to demonstrate my skills in<br>
Spring Core, Spring Web, Spring Security, Hibernate, OOP, SOLID and REST


***

## Features
<a id="features"></a>
Registration:<br>
```
POST: /register
```

All roles:<br>
```
GET:/cinema-halls - watch all cinema-halls
```
```
GET:/movie-sessions/available - watch all available movie sessions
```
```
GET:/movie-sessions / {id} - watch a certain movie session
```
```
GET:/logout - log out
```

Administration:<br>
```
POST:/cinema-halls - add a new cinema-halls
```
```
POST:/movies - add a new movie
```
```
POST:/movie-sessions - add a movie session
```
```
PUT:/movie-sessions/{id} - update information about a movie session
```
```
DELETE:/movie-sessions/{id}  - delete movie session
```
```
GET:/users/by-email - get a user by mail
```

User:<br>
```
GET:/orders - get your orders
```
```
GET:/shopping-carts/by-user - get your shopping cart
```
```
POST:/orders/complete - complete the order
```
```
PUT: /shopping-carts/movie-sessions - add movie ticket to cart
```

---

## Technologies
<a id="technologies"></a>

* [Java 11](https://en.wikipedia.org/wiki/Java_(programming_language))
* [Hibernate](https://en.wikipedia.org/wiki/Hibernate_(framework))
* [Spring](https://en.wikipedia.org/wiki/Spring_Framework)
* [MySQL](https://en.wikipedia.org/wiki/MySQL)
* [Apache Tomcat 9.0.50](https://en.wikipedia.org/wiki/Apache_Tomcat)
***

## Setup.
<a id="setup"></a>

__To run this application please install:__
* [IntelliJ IDEA Ultimate](https://www.jetbrains.com/lp/intellij-frameworks/)
* [MySQL](https://dev.mysql.com/downloads/)
* [Tomcat](https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.50/bin/)
<br><br>

__Steps__
* Fork this project and clone it.
* Create schema in your "MySQL Workbench" 
* Add your personal info to db.properties to connect to your database.
* Add Tomcat 9.0.50 configuration.
* To sign in you can use default account:
  Admin: admin@gmail.com / 12345678
  User: bob@gmail.com / 87654321


_If you wanna connect this project to your database,
just add all the necessary information in the:_

```
src/main/resources
```

```
#MySQL properties
db.driver=YOUR_DRIVER
db.url=YOUR_DATABASE_URL
db.user=YOUR_USERNAME
db.password=YOUR_PASSWORD

#Hibernate properties
hibernate.show_sql=true
hibernate.hbm2ddl.auto=create
hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
