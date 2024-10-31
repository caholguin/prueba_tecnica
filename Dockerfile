FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/pruebasrping-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENV SPRING_DATASOURCE_URL=jdbc:mysql://db:3306/mydatabase
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=rootpassword

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
