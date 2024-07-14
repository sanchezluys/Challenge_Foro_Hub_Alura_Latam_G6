![img.png](src/img/logoAlura.png)


# JAVA SDK 17 + Intellij IDEA
## Challenge FORO HUB G6 One
### SPRING BOOT
### Profesores: Genesys Rondon, Eric Fraga, Diego Rojas, Jose Viera 

<hr>

![Static Badge](https://img.shields.io/badge/Lenguaje-Java%2017-blue)  ![Static Badge](https://img.shields.io/badge/Versi%C3%B3n-Beta-Yellow)  <label><img src="https://img.shields.io/badge/Estatus-En%20Desarrollo-green"></label>
<hr>
    <img src="src/img/logoJava.png" alt="Logo Java" width="150px">
<hr>


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


2) IDE INTELLIJ JETBRAINS <br>

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

## Endpoints de la API

### 1. POST: /login   Autenticación

![img.png](src/img/endpoint_login.png)

### 2. GET: /usuarios    Ver Listado de Usuarios

![img.png](src/img/getListadoUsuarios.png)

### 3. POST: /usuario    Agregar Usuario

payload:

    {
        "login":"nombre_usuario",
        "clave":"clave_usuario"
    }

![img.png](src/img/agregarUsuario.png)

### 4. GET: /usuarios/{id}  Ver un Usuario Por Id

![img.png](src/img/verUsuarioPorId.png)

### 5. DELETE: /usuarios/{id}  Borrar Un Usuario por Id

![img.png](src/img/borrarUsuario.png)

### 6. PUT: /usuarios   Editar Usuario

payload:

    {
        "id":"2",
        "login":"otro_nombre"
    }
    
![img.png](src/img/editarUsuario.png)

### 7. POST: /topicos   Agregar Un nuevo Topico

![img.png](src/img/agregarNuevoTopico.png)

### 8. PUT: /topicos   Actualizar un topico

![img.png](src/img/actualizarTopico.png)

### 9. GET: /topicos/{id}   Ver Topico por Id

![img.png](src/img/topicoPorId.png)

### 10. GET: /topicos   Listar todos los Topicos

![img.png](src/img/listarTopicos.png)

### 11. DELETE: /topicos/{id}   Borrar un Topico

![img.png](src/img/borrarTopico.png)

### 12. GET: /hello    Verificar que este funcionando el servidor

![img.png](src/img/verificarServidor.png)


## Documentacion de la API

http://localhost:8080/swagger-ui/index.html

### Login

![img.png](src/img/loginDoc.png)

### Endpoints para usuarios

![img.png](src/img/endPointUsuariosDoc.png)

### Endpoints para topicos

![img.png](src/img/endPointTopicosDoc.png)

### Endpoint hello server

![img.png](src/img/endPointHelloDoc.png)

## Diagrama Entidad Relación para MySQL

![img.png](src/img/diagramaEntidadRelacion.png)


![img.png](src/img/muestraBaseDatosTopicos.png)

## Configuración Insomia Endpoints

![img.png](src/img/configuracionInsomia.png)

Archivo de configuración Insomia Desktop

[Insomia Configuracion](src/files_xtras/insomia_config.json)

## Mejoras y Bugs pendientes por corregir

| Item | Tipo   | Descripción                                          | Propuesta      |
|------|--------|------------------------------------------------------|----------------|
| 1    | Bug    | No guarda la clave encriptada en los nuevos usuarios | revisar código |
|      |        |                                                      |                |
| 2    | Mejora | Que solo liste los usuarios activos                  |                |
|      |        |                                                      |                |
| 3    | Mejora | Mejorar los mensajes en cada respuesta de la API     |                |
|      |        |                                                      |                |
|      |        |                                                      |                |
|      |        |                                                      |                |
|      |        |                                                      |                |
