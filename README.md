#RESTful Web Services - SOCIAL MEDIA APPLICATION
Este proyecto fue creado con el fin de dar seguimeinto a la seccion 3 - RESTful Web Services con Spring Boot del curso Master Microservices with Spring Boot and Spring Cloud

Estructura de URIs
- Obtener todos los usuarios	-	GET /users
- Crear un usuario				-	POST /users
- Obtener un usuario			-	GET /users/{id}
- Eliminar un usuario			-	DELETE /users/{id}

- Obtener todas las publicaicones de un usuario		-	GET /users/{id}/posts
- Crear una publicaicon de un usuario				-	POST /users/{id}/posts
- Obteenr los detalles de un post					-	GET /users/{id}/post/{id}