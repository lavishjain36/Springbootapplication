FROM maven:3-eclipse-temurin-21 AS build

COPY . .

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre

COPY --from=build /target/*.jar springrender.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "springrender.jar"]