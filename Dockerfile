FROM maven:3.9.7-eclipse-temurin-21 AS build

WORKDIR /app

COPY . .

RUN mvn clean package

FROM eclipse-temurin:21-jre

WORKDIR /

COPY --from=build /app/target/*.jar app.jar

CMD ["java", "-jar", "/app.jar"]
