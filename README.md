# Despliegue de la Aplicación con Docker

Este documento proporciona instrucciones sobre cómo desplegar la aplicación en un entorno local utilizando Docker.

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes programas:

- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) o superior.
- [Maven](https://maven.apache.org/download.cgi) (se puede usar la versión proporcionada en el proyecto).
- [Docker](https://www.docker.com/products/docker-desktop) 

## Pasos para Desplegar la Aplicación

### 1. **Clona el repositorio** (si aún no lo has hecho):

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_DIRECTORIO_DEL_PROYECTO>
  ```

### 2. **Compila el proyecto:**

La aplicación estará disponible en http://localhost:8080. Puedes utilizar herramientas como Postman o tu navegador para interactuar con la aplicación.

### 3. **Tambien Puedes probar la api con swagger en el siguiente link:** http://localhost:8080/api/v1/swagger-ui/index.html o tambien en postman a continuación comparto los endpoints 

### Generar fibonacci con hora ingresada

- **Endpoint:** `POST /api/v1/fibonacci`
- **URL Completa:** [http://localhost:8080/api/v1/fibonacci](http://localhost:8080/api/v1/fibonacci)
- **Body de la Solicitud:**
  ```json
  {
      "data": "12:23:04"
  }
  ``` 
### Generar fibonacci con hora del servidor

- **Endpoint:** `GET /api/v1/fibonacci/generate`
- **URL Completa:** [http://localhost:8080/api/v1/fibonacci/generate](http://localhost:8080/api/v1/fibonacci/generate)
  

### Obtener todas las series generadas

- **Endpoint:** `GET /api/v1/fibonacci`
- **URL Completa:** [http://localhost:8080/api/v1/fibonacci](http://localhost:8080/api/v1/fibonacci)

  


 
  


