# Microservices - Greeting Service em Java 💻🌐

Este projeto é um microserviço desenvolvido em *Java* com o framework *Spring Boot* como parte da disciplina de Paradigmas de Linguagem de Programação no curso de Ciência da Computação. O objetivo é demonstrar o uso de perfis de configuração (Spring Profiles), injeção de dependência e criação de endpoints REST (GET e POST).
Desenvolvido por: *Jamile Rockenbach Ferreira* - *RA: 1137704*.

---

### 🚀 Funcionalidades Implementadas

* *Configuração por Profiles:* Suporte para múltiplos idiomas (Inglês, Espanhol e Italiano) via arquivos .properties.
* *PathVariable:* Endpoint GET que recebe parâmetros diretamente na URL.
* *Requisição POST:* Endpoint que processa corpos de requisição em formato JSON.
* *Centralização de Configurações:* Uso de @ConfigurationProperties para mapear propriedades do sistema.

---

### 🛠️ Estrutura do Projeto

* GreetingConfig.java: Classe responsável por carregar as propriedades do arquivo application.properties.
* GreetingController.java: Controlador REST que gerencia as rotas de saudação.
* resources/: Contém os arquivos de configuração para cada idioma (application-en.properties, application-es.properties, application-it.properties).

---

### ## 📚 Tecnologias Utilizadas

* Java 17
* Spring Boot 3.x
* Maven
* IntelliJ IDEA

---
