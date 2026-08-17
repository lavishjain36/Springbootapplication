From maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

From openjdk:17.0.1-jdk-slim
copy --from=build /target/springrender-0.0.1-snashop.jar springrender.jar
EXPOSE 8080
ENTRYPOINT["java","-jar","springrender.jar"]