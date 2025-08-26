# springboot-restful-webservices
 
# Spring Boot RESTful Web Services

A simple Spring Boot application that exposes RESTful APIs to manage users. It connects to a **MariaDB** database and demonstrates basic CRUD operations.

---

## Features

- Create, Read, Update, Delete (CRUD) operations for `User` entity.
- Uses **Spring Data JPA** for database interaction.
- Connects to **MariaDB** database.
- JSON-based REST APIs.
- Exception handling for database constraints (e.g., unique email).

---

## Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- MariaDB
- Maven
- Postman (for API testing)

---

## Database Setup

1. Create database in MariaDB:

```sql
CREATE DATABASE USER_MANAGEMENT;
USE USER_MANAGEMENT;

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL
);

2. Update application.properties:

spring.datasource.url=jdbc:mariadb://localhost:3306/USER_MANAGEMENT
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


## Running the Application

1. Clone the repository:

git clone https://github.com/margiecaina/springboot-restful-webservices.git
cd springboot-restful-webservices


2. Build and run:

./mvnw spring-boot:run

3. The app runs at:

http://localhost:8080


## API Endpoints

| Method | Endpoint    | Description             |
| ------ | ----------- | ----------------------- |
| GET    | /users      | Get all users           |
| GET    | /users/{id} | Get a user by ID        |
| POST   | /users      | Create a new user       |
| PUT    | /users/{id} | Update an existing user |
| DELETE | /users/{id} | Delete a user by ID     |


## Sample POST request body:

{
  "email": "john@example.com",
  "firstName": "John",
  "lastName": "Doe"
}

## Testing

Use Postman to send HTTP requests.

Check database entries via MariaDB CLI or GUI tools.
