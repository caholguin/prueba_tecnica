FROM openjdk:21-jdk-slim AS builder

WORKDIR /app

COPY . .

RUN chmod +x ./mvnw

RUN ./mvnw clean package -DskipTests

FROM openjdk:21-jdk-slim

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

ENV SPRING_DATASOURCE_URL=jdbc:mysql://db:3306/mydatabase
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=rootpassword

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
