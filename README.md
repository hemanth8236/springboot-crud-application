# Simple Web Application

## Overview
This is a simple CRUD (Create, Read, Update, Delete) web application built using Spring Boot. It provides REST API endpoints for managing products, including creating, reading, updating, and deleting product information.

## Project Structure
```
src/
└── main/
    └── java/
        └── com/
            └── hemanth/
                └── simplewebApp/
                    ├── controller/
                    │   ├── HomeController.java
                    │   ├── LoginController.java
                    │   └── ProductController.java
                    ├── model/
                    │   └── Product.java
                    ├── service/
                    │   └── ProductService.java
                    └── SimplewebAppApplication.java
```

## Main Components

### SimplewebAppApplication
- **File**: `SimplewebAppApplication.java`
- **Description**: The main entry point of the Spring Boot application. It initializes the application context and starts the embedded server.

### Controllers
- **HomeController**
  - **File**: `HomeController.java`
  - **Endpoints**:
    - `GET /`: Returns "Hello World"
    - `GET /about`: Returns "This is a simple web app"

- **LoginController**
  - **File**: `LoginController.java`
  - **Endpoints**:
    - `GET /login`: Returns "Login Page"

- **ProductController**
  - **File**: `ProductController.java`
  - **Endpoints**:
    - `GET /products`: Returns a list of all products
    - `GET /products/{prodId}`: Returns a product by its ID
    - `POST /products`: Adds a new product
    - `PUT /products`: Updates an existing product
    - `DELETE /products/{prodId}`: Deletes a product by its ID

### Model
- **Product**
  - **File**: `Product.java`
  - **Description**: Represents a product with an ID, name, and price.

### Service
- **ProductService**
  - **File**: `ProductService.java`
  - **Description**: Contains business logic for managing products, including methods for retrieving, adding, updating, and deleting products.

## Dependencies
- **Maven**: The project uses Maven for dependency management. The `pom.xml` file contains all the necessary dependencies for the application.

## Conclusion
This documentation provides an overview of the Simple Web Application, its structure, and its main components. The application is a CRUD-based REST API built using Spring Boot, designed to manage product information efficiently. For further development, additional features can be added to enhance functionality.
