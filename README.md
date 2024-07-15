# README

## Project Overview

This project is a full-stack application that demonstrates the use of Java/Spring Boot for the back end and React JS for the front end. The application manages authors and books, using an H2 in-memory database for data storage.

## Back End

### Technology Stack
- **Java**
- **Spring Boot**

### Build and Run

To build and run the back end, use Maven:
```bash
mvn clean install
java -jar ./target/assignment-0.0.1-SNAPSHOT.jar
```

### Endpoint URLs
-   Authors Endpoint: http://localhost:8080/assignment-service/authors/
-   Books Endpoint: http://localhost:8080/assignment-service/books/2

## Database
The application uses H2 in-memory database for data storage.

    1.  DB View URL: http://localhost:8080/assignment-service/h2console
    2.  Driver Class: org.h2.Driver
    3.  JDBC URL: jdbc:h2:mem:testdb
    4.  User Name: sa
    5.  Password: password

## Front End
### Technology Stack
-   React JS
### Setup and Run
To set up and run the front end, use npm:
```bash
npm install
npm start
```
### Development Server
The front end runs on:
- URL: http://localhost:3000

## Running the Application
-   Ensure that the back end is up and running by executing the Maven command provided above. The application will be accessible at http://localhost:8080.
Start the Front End:

-   Navigate to the front end directory and run the npm command provided above. The front end will be accessible at http://localhost:3000.
Access the Database:

-   You can view and interact with the H2 database through the provided DB view URL. Use the credentials provided to log in.

## Contact
-   For any questions or support, please contact [Brandon Bross] at [brandonbross1022@gmail.com].