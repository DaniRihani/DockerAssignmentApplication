FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/webapp-service.jar webapp-service.jar
EXPOSE 8080
CMD ["java", "-jar", "webapp-service.jar"]
