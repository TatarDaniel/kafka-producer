# Use a base image with Java installed
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/*.jar app.jar

EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]