# CustomerBackend

Bakend MS para customer, este proyecto fue realizado son Spring Boot.

## Development server

Ejecute  `mvn spring-boot:run` para un servidor de desarrollo. Vaya a `http://localhost:9090/`. Los EndPoint de los servcios expuestos se encuentran en el recurso `src/test/resources/Spring-Customer.postman_collection.json` importable desde Postman.

## Build

Ejecute `mvn clean install` para construir el proyecto. Los artefactos de construcción se almacenarán en el `target/` directory.

## Docker image

Ejecute `docker build -t` para construir la imagen de docker, el archivo `Dockerfile` se encuentra en la carpeta raíz del proyecto.

## Note

Se debe ajustar la configuración definida en `application.yml` para autenticarse contra la base de datos y correr el script `schema.sql` el cual fuonciona para culquier versión de PostgreSQL.
