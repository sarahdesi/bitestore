# BiteStore

![CI](https://github.com/sarahdesi/bitestore/actions/workflows/ci.yml/badge.svg)

BiteStore is a stock and order management API for an electronics store (phones, laptops, accessories), built as a Spring Boot monolith.

Its main goal is correctness under concurrency: the system must never sell an item it does not have, even when several orders compete for the last unit at the same time. Orders, stock updates and the stock movement history are written in a single transaction.

> Work in progress. Endpoints, architecture notes and known limitations will be documented as each part is built.

## Tech stack

Java 21 · Spring Boot 3.5 · MariaDB 11.4 · Flyway · Testcontainers · Docker Compose · GitHub Actions

## Running locally

Requirements: Java 21+ and Docker.

1. Create your local environment file and set your own passwords:

   ```bash
   cp .env.example .env
   ```

2. Start the database:

   ```bash
   docker compose up -d
   ```

3. Start the application (Flyway applies the migrations on startup):

   ```bash
   ./mvnw spring-boot:run
   ```

The API runs on `http://localhost:8080`.

## Running the tests

```bash
./mvnw verify
```

The integration tests start their own MariaDB container with Testcontainers, so Docker must be running. The database from `docker compose` is not used by the tests.
