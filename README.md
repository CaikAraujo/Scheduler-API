# 📅 Scheduler API

An API developed for appointment management, focusing on high scalability, rigorous data validation, and security. This project was developed for **educational purposes**, applying **Clean Code** patterns and layered architecture to consolidate knowledge in software engineering.

## 🛠️ Technology Stack

* **Backend**: Java 21 with Spring Boot 3.
* **Persistence**: Spring Data JPA and PostgreSQL.
* **Security**: Spring Security with customized filter configuration for the development environment.
* **Infrastructure**: Isolated database via Docker.
* **Productivity**: Lombok for reducing boilerplate code and Bean Validation for data integrity.

## 🏗️ System Architecture

The application is divided into well-defined layers for separation of concerns:

* **Controller**: REST endpoint exposure layer, using `@Valid` to ensure only consistent data enters the system.
* **Service**: Layer where business logic and operation orchestration reside.
* **Repository**: Data layer abstraction using JPA interfaces for efficient queries.
* **Model**: `Appointment` entity mapped with persistence annotations and validations such as `@Future` for date rules.



## 🚀 How to Run the Project

1. Ensure **PostgreSQL** is active in Docker on port `5432`.
2. Configure credentials in the `src/main/resources/application.properties` file.
3. Run the application via IntelliJ or using the command `./mvnw spring-boot:run`.
4. Integration tests can be performed via Postman at the `/api/appointments` endpoint.

## 🔮 Evolution Roadmap

The project is under constant development with the following planned implementations:

* **Conflict Management**: Implementation of logic to prevent duplicate appointments at the same time.
* **Global Exception Handling**: Creation of `Custom Exceptions` to return standardized and user-friendly error messages in JSON.
* **Automated Notifications**: Development of an in-house messaging system for sending instant confirmations.
* **Interactive Documentation**: Implementation of Swagger/OpenAPI for real-time endpoint visualization and testing.