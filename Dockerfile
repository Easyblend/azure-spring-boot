FROM maven:3.9.4-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean package

FROM eclipse-temurin:21-jre
COPY --from=build /target/*.jar spatial-wars.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/spatial-wars.jar"]
