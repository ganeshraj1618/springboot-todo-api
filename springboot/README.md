@"
# Spring Boot Todo API

A REST API for managing todos built with Spring Boot.

## Live Demo

https://springboot-todo-api-iw4o.onrender.com/api/todos

## Tech Stack

- Java 23
- Spring Boot 3.3.0
- Spring Data JPA
- H2 Database
- Maven
- Docker
- Render

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/todos | Create a todo |
| GET | /api/todos | Get all todos |
| GET | /api/todos/{id} | Get one todo |
| PUT | /api/todos/{id} | Update todo |
| DELETE | /api/todos/{id} | Delete todo |
| GET | /api/todos/completed | Get completed |
| GET | /api/todos/pending | Get pending |
| GET | /api/todos/search?keyword=xyz | Search |

## How to Run Locally

git clone https://github.com/ganeshraj1618/springboot-todo-api.git
cd springboot-todo-api
./mvnw spring-boot:run

## Author

Ganesh Raj - https://github.com/ganeshraj1618
"@ | Out-File -FilePath README.md -Encoding UTF8