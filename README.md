# Full Stack Application

This project is a full-stack application built with Angular for the frontend and Spring Boot for the backend. It demonstrates a simple architecture where the frontend communicates with the backend to fetch and display data.

## Project Structure

```
fullstack-app
├── backend
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── app
│   │   │   │               ├── Application.java
│   │   │   │               ├── controller
│   │   │   │               │   └── SampleController.java
│   │   │   │               └── service
│   │   │   │                   └── SampleService.java
│   │   │   └── resources
│   │   │       ├── application.yml
│   │   │       └── application-dev.yml
│   │   └── test
│   │       └── java
│   │           └── com
│   │               └── example
│   │                   └── app
│   │                       └── ApplicationTests.java
│   └── pom.xml
├── frontend
│   ├── src
│   │   ├── app
│   │   │   ├── app.component.ts
│   │   │   └── app.module.ts
│   │   └── environments
│   │       ├── environment.ts
│   │       └── environment.prod.ts
│   ├── angular.json
│   ├── package.json
│   └── tsconfig.json
└── README.md
```

## Backend

The backend is a Spring Boot application that serves as the API for the frontend. It includes:

- **Application.java**: The main entry point of the application.
- **SampleController.java**: Handles HTTP requests and returns sample data.
- **SampleService.java**: Contains business logic for fetching data.
- **application.yml**: Main configuration file for application properties.
- **application-dev.yml**: Development-specific configurations.
- **pom.xml**: Maven configuration file for managing dependencies.

## Frontend

The frontend is an Angular application that provides the user interface. It includes:

- **app.component.ts**: The root component of the application.
- **app.module.ts**: The root module that imports necessary modules and declares components.
- **environment.ts**: Development environment variables.
- **environment.prod.ts**: Production environment variables.
- **angular.json**: Angular workspace configuration.
- **package.json**: npm configuration file for managing dependencies.
- **tsconfig.json**: TypeScript configuration file.

## Getting Started

### Prerequisites

- Java 11 or higher
- Node.js and npm
- Maven

### Backend Setup

1. Navigate to the `backend` directory.
2. Run `mvn spring-boot:run` to start the Spring Boot application.

### Frontend Setup

1. Navigate to the `frontend` directory.
2. Run `npm install` to install dependencies.
3. Run `ng serve` to start the Angular application.

### Accessing the Application

- The Angular application will be available at `http://localhost:4200`.
- The Spring Boot API will be available at `http://localhost:8080`.

## License

This project is licensed under the MIT License.