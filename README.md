Attendance System Backend (attendance-system-be)

This is the backend service for the Attendance System application, built using Spring Boot. It provides RESTful APIs for managing users, attendance records, authentication, and other related functionalities.
Features

    User management (students, teachers, and administrators)
    Attendance tracking for classes
    API-based authentication and authorization
    Data persistence using a relational database
    Integration with frontend for seamless user experience

Prerequisites

To run this project, ensure you have the following installed:

    Java 21 or higher
    Spring Boot
    Maven or Gradle
    PostgreSQL/MySQL (or your preferred database)
    Git

Getting Started

    Clone the Repository

git clone https://github.com/yourusername/attendance-system-be.git
cd attendance-system-be

Set up Database Configuration
Update application.properties or application.yml with your database details.

Build the Project

./mvnw clean install

Run the Application

    ./mvnw spring-boot:run

    API Endpoints
    Access the API documentation at http://localhost:8080/swagger-ui.html (if Swagger is configured).

API Overview
Method	Endpoint	Description
GET	/users	Get all users
POST	/users	Create a new user
GET	/attendance/{userId}	Get attendance for a user
POST	/attendance	Record attendance
Dependencies

    Spring Boot Starter Web
    Spring Data JPA
    Spring Security (for authentication)
    H2/PostgreSQL/MySQL (database)

Contributing

    Fork the project.
    Create a feature branch (git checkout -b feature-name).
    Commit changes (git commit -m 'Add feature').
    Push to the branch (git push origin feature-name).
    Create a Pull Request.
