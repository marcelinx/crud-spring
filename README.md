# CRUD Spring Application

Este é um projeto demo utilizando Spring Boot para criar uma aplicação CRUD simples.

## Descrição

Este projeto é um exemplo de como configurar e implementar uma aplicação CRUD (Create, Read, Update, Delete) utilizando Spring Boot, Spring Data JPA, e H2 Database como banco de dados em memória para facilitar o desenvolvimento e os testes.

## Tecnologias Utilizadas

- **Spring Boot:** para a configuração e execução da aplicação.
- **Spring Data JPA:** para a camada de persistência e acesso a dados.
- **H2 Database:** como banco de dados em memória, facilitando o desenvolvimento e testes.
- **Lombok:** para reduzir a verbosidade do código Java, automatizando getters, setters, e outros métodos com anotações.
- **Spring Boot DevTools:** para suporte a desenvolvimento rápido com reinício automático da aplicação.
- **Spring Boot Starter Web:** para desenvolvimento de aplicações web incluindo RESTful applications usando Spring MVC.
- **Spring Boot Starter Test:** para suporte a testes com JUnit, Hamcrest e Mockito.
- **Spring Boot Starter Validation:** para validação de dados de entrada com Hibernate Validator.

## Pré-requisitos

Para rodar esta aplicação você precisa ter instalado:

- Java 17 ou superior
- Maven 3.2 ou superior

## Como Rodar

1. **Clone o repositório**

```bash
git clone https://github.com/marcelinx/crud-spring
cd crud-spring
```

2. **Compile e execute a aplicação usando Maven**

```bash
mvn clean install
mvn spring-boot:run
```

A aplicação será iniciada e acessível via `localhost:8080`.

## Inicialização da Base de Dados

Ao iniciar a aplicação, a base de dados H2 será automaticamente criada em memória, e uma entrada de exemplo será inserida no banco de dados. Esta inicialização é feita pela classe `CrudSpringApplication` que implementa um `CommandLineRunner` para inserir um curso de exemplo no banco de dados.

## Endpoints

A aplicação define endpoints CRUD básicos para manipulação de cursos. Você pode testar esses endpoints usando Postman ou qualquer outra ferramenta de API RESTful de sua preferência.

### Modelo de Curso

O modelo `Course` possui os seguintes atributos:

- `id`: Identificador único do curso (gerado automaticamente).
- `name`: Nome do curso.
- `category`: Categoria do curso (exemplo: BACK_END).

### Exemplo de Curso Inserido na Inicialização

- **Nome:** Angular com Spring
- **Categoria:** BACK_END

## Contribuindo

Para contribuir com este projeto, por favor, crie um fork do repositório, faça suas alterações e envie um Pull Request.
