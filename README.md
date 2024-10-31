# Despliegue de la Aplicación con Docker

Este documento proporciona instrucciones sobre cómo desplegar la aplicación en un entorno local utilizando Docker.

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes programas:

- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) o superior.
- [Maven](https://maven.apache.org/download.cgi) (se puede usar la versión proporcionada en el proyecto).
- [Docker](https://www.docker.com/products/docker-desktop) y [Docker Compose](https://docs.docker.com/compose/).

## Pasos para Desplegar la Aplicación

### 1. **Clona el repositorio** (si aún no lo has hecho):

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_DIRECTORIO_DEL_PROYECTO>
  ```

### 2. **Compila el proyecto:**

Asegúrate de estar en la raíz del proyecto y ejecuta el siguiente comando para construir el archivo JAR de la aplicación:

```bash
.\mvnw.cmd clean package -DskipTests
```

### 3. **Despliega la aplicación:**

Una vez que el proyecto esté compilado, ejecuta el siguiente comando para construir y ejecutar los contenedores de Docker:

```bash
docker-compose up --build
```

### 4. **Accede a la Aplicación:**

La aplicación estará disponible en http://localhost:8080. Puedes utilizar herramientas como Postman o tu navegador para interactuar con la aplicación.

### 5. **Tambien Puedes probar la api con swagger en el siguiente link:** http://localhost:8080/api/v1/swagger-ui/index.html o tambien en postman a continuación comparto los endpoints 

### Crear una Franquicia

- **Endpoint:** `POST /api/v1/franchises`
- **URL Completa:** [http://localhost:8080/api/v1/franchises](http://localhost:8080/api/v1/franchises)
- **Descripción:** Crea una nueva franquicia en el sistema.
- **Body de la Solicitud:**
  ```json
  {
    "name": "prueba"
  }
  ``` 
### Actualizar una Franquicia

- **Endpoint:** `PUT /api/v1/franchises/1`
- **URL Completa:** [http://localhost:8080/api/v1/franchises/1](http://localhost:8080/api/v1/franchises/1)
- **Descripción:** Actualizar franquicia.
- **Body de la Solicitud:**
  ```json
  {
    "name": "prueba"
  }
  ```  

### Crear Sucursal

- **Endpoint:** `POST /api/v1/branches`
- **URL Completa:** [http://localhost:8080/api/v1/branches](http://localhost:8080/api/v1/branches)
- **Descripción:** Crear sucursal.
- **Body de la Solicitud:**
  ```json
  {
    "name": "prueba",
    "franchiseId": 1
  }
  ```  
  
### Actualizar Sucursal

- **Endpoint:** `PUT /api/v1/branches/1`
- **URL Completa:** [http://localhost:8080/api/v1/branches/1](http://localhost:8080/api/v1/branches/1)
- **Descripción:** Actualizar sucursal.
- **Body de la Solicitud:**
  ```json
   {
    "name": "pruebas",
    "franchiseId": 1
   }
  ```   
  
### Crear Producto

- **Endpoint:** `POST /api/v1/products`
- **URL Completa:** [http://localhost:8080/api/v1/products](http://localhost:8080/api/v1/products)
- **Descripción:** Crear producto.
- **Body de la Solicitud:**
  ```json
   {
    "name": "pruebas",
    "stock": 10,
    "branchId": 1
   }
  ``` 
  
### Actualizar Producto

- **Endpoint:** `PUT /api/v1/products/1`
- **URL Completa:** [http://localhost:8080/api/v1/products/1](http://localhost:8080/api/v1/products/1)
- **Descripción:** Actualizar producto.
- **Body de la Solicitud:**
  ```json
   {
    "name": "pruebas",
    "stock": 10,
    "branchId": 1
   }
  ```
  
### Actualizar stock de Producto

- **Endpoint:** `PATCH /api/v1/products/stock/1`
- **URL Completa:** [http://localhost:8080/api/v1/products/stock/1](http://localhost:8080/api/v1/products/stock/1)
- **Descripción:** Actualizar stock.
- **Body de la Solicitud:**
  ```json
   {
   "name": "prueba",
   "franchiseId": 1
   }
  ```  


### Actualizar stock de Producto

- **Endpoint:** `GET /api/v1/products/maxStock/1`
- **URL Completa:** [http://localhost:8080/api/v1/products/maxStock/1](http://localhost:8080/api/v1/products/maxStock/1)
- **Descripción:** mostrar producto con mas stock por sucursal para una franquicia puntual retornar a que surcursal pertenece.
- **Body de la Solicitud:**
  ```json
   {
    "stock": 1500  
   }
  ``` 
  
### Eliminar Producto

- **Endpoint:** `DELETE /api/v1/products/1`
- **URL Completa:** [http://localhost:8080/api/v1/products/1](http://localhost:8080/api/v1/products/1)
- **Descripción:** Elimina un producto.

 
  


