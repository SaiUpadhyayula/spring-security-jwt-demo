# Spring Security JWT Demo

This project contains source code to demonstrate how to work with JWT with Spring Boot 3 and Spring Security 6.

## How to run

1. Clone this repository
2. Run `docker compose up -d` to start the database
3. Run `mvn spring-boot:run`

## How to test

1. Register a user by sending a POST request to `http://localhost:8080/api/auth/register` with the following body:

```json
{
  "username": "user",
  "password": "password",
  "email": "user@email.com"
}
```

2. Login by sending a POST request to `http://localhost:8080/api/auth/login` with the following body:

```json
{
  "username": "user",
  "password": "password"
}
```
You will receive a JWT token in the response body.

3. Access the protected resource by sending a GET request to `http://localhost:8080/api/hello` with the token in the Authorization header.

## WARNING

To make the project easy to run, the Private Key(src/main/resources/app.key) is uploaded in the repository. This is a bad practice and should not be done in production. The Private Key should be stored in a secure place and should not be accessible by anyone.
