# Stage 1: Build the application
FROM maven:3.8.1-openjdk-17 AS build

WORKDIR /app

# Copy the project files
COPY pom.xml .
COPY src ./src

# Build the project
RUN mvn package

# Stage 2: Create the runtime image
FROM openjdk:17-slim

WORKDIR /app

# Copy the built artifact from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port your application listens on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]