# Book Management API

A RESTful API built with Spring Boot that provides comprehensive book management functionality. This API allows you to create, read, update, and delete book records with proper validation and error handling.

## Technologies Used

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- H2 Database
- Maven
- Lombok
- Jakarta Validation

## Features

- CRUD operations for books
- Data validation
- Exception handling
- H2 in-memory database
- RESTful endpoints
- Comprehensive error responses

## Prerequisites

- Java 17 or higher
- Maven (or use the included Maven wrapper)
- Git (optional)

## Getting Started

### Installation

1. Clone the repository (or download the ZIP):
```bash
git clone https://github.com/tradervijeth/book-management-api.git
```

2. Navigate to the project directory:
```bash
cd book-management-api
```

3. Build the project:
```bash
# Using Maven
mvn clean install

# Or using Maven wrapper
./mvnw clean install
```

4. Run the application:
```bash
# Using Maven
mvn spring-boot:run

# Or using Maven wrapper
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`

### API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | /api/books | Get all books |
| GET    | /api/books/{id} | Get a specific book |
| POST   | /api/books | Create a new book |
| PUT    | /api/books/{id} | Update a book |
| DELETE | /api/books/{id} | Delete a book |

### Sample Requests

#### Create a Book
```bash
curl -X POST http://localhost:8080/api/books \
  -H "Content-Type: application/json" \
  -d '{
    "title": "The Great Gatsby",
    "author": "F. Scott Fitzgerald",
    "year": 1925,
    "isbn": "978-0743273565",
    "description": "A story of wealth and ambition in the Jazz Age"
}'
```

#### Get All Books
```bash
curl http://localhost:8080/api/books
```

#### Get Book by ID
```bash
curl http://localhost:8080/api/books/1
```

#### Update a Book
```bash
curl -X PUT http://localhost:8080/api/books/1 \
  -H "Content-Type: application/json" \
  -d '{
    "title": "The Great Gatsby",
    "author": "F. Scott Fitzgerald",
    "year": 1925,
    "isbn": "978-0743273565",
    "description": "Updated description"
}'
```

#### Delete a Book
```bash
curl -X DELETE http://localhost:8080/api/books/1
```

### Database Access

The H2 console is available at: `http://localhost:8080/h2-console`

Connection details:
- JDBC URL: `jdbc:h2:mem:bookdb`
- Username: `sa`
- Password: ` ` (empty)

## Project Structure

```
book-management-api/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── bookmanagementapi/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               ├── service/
│   │   │               ├── exception/
│   │   │               └── BookManagementApiApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
└── pom.xml
```

## Error Handling

The API provides detailed error responses for various scenarios:

- 404 Not Found: When requesting non-existent resources
- 400 Bad Request: When the request body fails validation
- 500 Internal Server Error: For unexpected server errors

Example error response:
```json
{
    "title": "Title is required",
    "author": "Author is required"
}
```

## Development

### Running Tests
```bash
mvn test
```

### Packaging the Application
```bash
mvn package
```

The packaged JAR will be available in the `target` directory.

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details

## Project Repository

Project Link: [https://github.com/tradervijeth/book-management-api](https://github.com/tradervijeth/book-management-api)