# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:23-jdk-alpine AS build

# Set the working directory in the container
WORKDIR /app

# Copy the standard maven files
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Fix permissions for mvnw (needed when building from Windows)
RUN chmod +x mvnw

# Download dependencies (this layer will be cached)
RUN ./mvnw dependency:go-offline -B

# Copy the actual project files
COPY src src

# Build the application
RUN ./mvnw clean package -DskipTests

# Run stage
FROM eclipse-temurin:23-jre-alpine

WORKDIR /app

# Copy the jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
