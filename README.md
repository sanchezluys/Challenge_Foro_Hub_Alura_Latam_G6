# <h1>Challenge Foro Hub</h1>

proyecto: <h2>spring-boot-3</h2>

 

<ol>
  <li>Aprenda a aislar código de reglas de negocio en una aplicación</li>
  <li>Implemente princípios SOLID</li>
  <li>Documente una API seguindo el protocolo OpenAPI</li>
  <li>Aprenda a escribir pruebas automatizadas en una aplicación con Spring Boot</li>
  <li>Realize el build de una aplicação con Spring Boot</li>
  <li>Use variables de entorno/ambiente y prepare una aplicación para su implementación/deploy</li>
</ol>

links

1) dependencias<br>
<a>https://www.postman.com/</a><br>
<a>https://spring.io/projects/spring-boot</a><br>
<a>https://www.aluracursos.com/</a><br>

### Tecnologías aplicadas

| Item | Nombre               | Usos |
|------|----------------------|------|
| 1    | Lombok               |      |
|      |                      |      |
| 2    | Spring Web           |      |
|      |                      |      |
| 3    | Spring Boot DevTools |      |
|      |                      |      |
| 4    | Spring Data JPA      |      |
|      |                      |      |
| 5    | Flyway Migration     |      |
|      |                      |      |
| 6    | MySQL Driver         |      |
|      |                      |      |
| 7    | Validation           |      |
|      |                      |      |
| 8    | Spring Security      |      |


2) ide<br>
<a href="https://www.jetbrains.com/idea/promo/?msclkid=c934a6edeb2510614d26c2af04a86b25&utm_source=bing&utm_medium=cpc&utm_campaign=AMER_en_BR_IDEA_Branded&utm_term=intellij&utm_content=intellij%20idea">Descarga Intellij</a>
<br>


### Payload para el login
    {
        "login":"luys",
        "clave":"123456"
    }

#### Se usa Bcrypt https://bcrypt-generator.com/
    En la BD MySQL:
    login: luys
    clave: $2a$12$Q8OJ.GSLqj5PgWEExE22o.zEncR/l6I4JFR3pQoW0mlyxdBKy/LTK

## Endpoints
### 1. /login

![img.png](src/img/endpoint_login.png)

### 2. GET: /usuario

### 3. PUT: /usuario

### 4. GET: /usuario/{id}

### 5. DELETE: /usuario/{id}

### 6. GET: /topico

### 7. PUT: /topico



## Documentacion de la API

http://localhost:8080/swagger-ui/index.html

## Diagrama Entidad Relación
