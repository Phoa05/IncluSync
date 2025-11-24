# IncluSync 

Sistema de acessibilidade para metrôs com API em Spring Boot e banco de
dados H2.

## Sobre o Projeto

O **IncluSync** é uma API criada para fornecer informações sobre
acessibilidade em estações de metrô.
O sistema integra dados de usuários e estações, fornecendo status como
**temperatura**, **lotação**, **elevadores**, e um **overallStatus**
indicando se a estação está "ADEQUADO" ou "INADEQUADO".

Projetado com **Spring Boot**, **JPA**, **H2**, e configurações
preparadas para migração futura para PostgreSQL.

------------------------------------------------------------------------

## Tecnologias Utilizadas

-   Java 17+
-   Spring Boot 3+
-   Spring Web
-   Spring Data JPA
-   H2 Database
-   DevTools
-   Maven
-   Lombok

------------------------------------------------------------------------

## Como Rodar o Projeto

### Clonar o repositório

``` bash
git clone https://github.com/usuario/inclusync.git
cd inclusync
```

### Rodar a aplicação

``` bash
mvn spring-boot:run
```

### Acessar o console H2

    http://localhost:8080/h2-console

-   JDBC URL: `jdbc:h2:mem:metrodb`
-   User: `sa`

------------------------------------------------------------------------

## Mock de Dados (schema.sql + data.sql)

### schema.sql (criação de tabelas)

``` sql
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255),
    name VARCHAR(255),
    password VARCHAR(255),
    has_mobility_issue BOOLEAN,
    access VARCHAR(255)
);

CREATE TABLE stations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    temperature VARCHAR(255),
    crowd_level INT,
    elevator_status VARCHAR(255),
    overall_status VARCHAR(255),
    updated_at TIMESTAMP
);
```

### data.sql (dados iniciais)

Inclui usuários e várias estações com status diversos. 

#### Acesso de Usuarios 
- Admin: ` sobral@gmail.com `
          `sobral123`

- Usuario: `pedro@gmail.com` 
            `pedro123`

------------------------------------------------------------------------

### Recuperando a Key no código

``` java
@Value("${app.apiKey}")
private String apiKey;
```

------------------------------------------------------------------------

## Endpoints Principais

### Usuários

  Método   Endpoint        Descrição
  -------- --------------- ----------------
  POST     `/users`        Cria usuário
  GET      `/users/{id}`   Busca usuário
  GET      `/users`        Lista usuários

### Estações

  Método   Endpoint           Descrição
  -------- ------------------ ---------------------------
  GET      `/stations`        Lista estações
  GET      `/stations/{id}`   Busca estação específica
  PUT      `/stations/{id}`   Atualiza dados da estação

------------------------------------------------------------------------

## Build e Empacotamento

``` bash
mvn clean package
```

Gera o `.jar` em:

    /target/inclusync.jar
