FROM maven:3.6.3-jdk-11 AS build
COPY . .
RUN mvn clean package 

FROM openjdk:11-jre-slim
COPY --from=build /target/*.jar spatial-wars.jar

EXPOSE  8080

ENTRYPOINT ["java","-jar","/spatial-wars.jar"]


