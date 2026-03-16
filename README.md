# api-usuarios-java
Projeto de API REST desenvolvido em Java utilizando Spring Boot para gerenciamento de usuários.

Tecnologias utilizadas

Java 17

Spring Boot

Spring Web

Spring Data JPA

Banco de dados H2

Maven

Funcionalidades

Criar usuário

Listar usuários

Estrutura preparada para atualização e remoção de usuários

Arquitetura organizada em Controller, Model e Repository

Estrutura do projeto

src/main/java/com/ian/apiusuarios

controller → Endpoints da API

model → Entidades do sistema

repository → Comunicação com o banco de dados

Endpoint principal

GET /usuarios
Lista todos os usuários cadastrados.

POST /usuarios
Cria um novo usuário.

Exemplo de JSON para criação:

{
"nome": "Ian",
"email": "ian@email.com"
}

Objetivo do projeto

Projeto desenvolvido para prática de desenvolvimento backend utilizando Java e Spring Boot, demonstrando conhecimentos em criação de APIs REST, organização de código em camadas e integração com banco de dados.
