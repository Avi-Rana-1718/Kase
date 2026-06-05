# Kase

> Part of the [Kase](https://github.com/Avi-Rana-1718/Kase) project ecosystem

Kase is a modular, microservices-based **case management and workflow platform** built with Spring Boot and Java 21. This repository serves as the **shared library** for the Kase ecosystem — housing common JPA entities, shared DTOs, and cross-service utilities consumed by all other Kase services.

---

## Ecosystem Overview

The Kase platform is split across focused, independently deployable services:

| Service       | Description | Repo                                                   |
|---------------|---|--------------------------------------------------------|
| **KaseAuth**  | Identity management, JWT auth, RBAC, multi-tenancy | [KaseAuth](https://github.com/Avi-Rana-1718/KaseAuth)  |
| **KaseAdmin** | Feature flag management, per-org flag assignment, and tenant-scoped user listings | [KaseAuth](https://github.com/Avi-Rana-1718/KaseAdmin) |
---

## What's in This Module

- **JPA Entities** — Shared domain models (users, organizations, roles, cases) used across services
- **DTOs** — Common data transfer objects for inter-service communication
- **Utilities** — Shared helper classes and constants
- **PostgreSQL** — Configured as the backing relational database

---
