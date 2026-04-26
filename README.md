# Microservices Java - Sistema e Produtos  💻🌐

Este repositório contém uma arquitetura de microsserviços desenvolvida em **Java** com **Spring Boot**, focada em serviços de saudação, configuração centralizada, conversão de moeda e gerenciamento de produtos.
✨️ Desenvolvido por: Jamile Rockenbach Ferreira - RA: 1137704

---

## 🏗️ Estrutura do Repositório

O projeto está dividido nos seguintes serviços:

### 1. `config-service`
Servidor de configuração centralizada para os demais microsserviços da arquitetura.

### 2. `greeting-service`
Serviço de saudação com suporte a internacionalização (**Spring Profiles**).
* **Endpoints:** * `GET /greeting/{name}`
    * `POST /greeting` (Recebe JSON `{"name": "..."}`)

### 3. `currency-service`
Microsserviço responsável pela lógica de conversão de moedas e cotações.

### 4. `product-service`
Gerenciamento de catálogo de produtos com integração a banco de dados e suporte a moedas estrangeiras.
* **Tecnologias:** Spring Data JPA, PostgreSQL e Flyway.
* **Endpoint:** `GET /products/{id}?targetCurrency=XXX`

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17
* **Framework:** Spring Boot 3.x
* **Banco de Dados:** PostgreSQL
* **Migrações:** Flyway
* **Documentação/Testes:** Postman

---