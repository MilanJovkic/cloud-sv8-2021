# Set the base image to use for containers
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the compiled JAR into the container
COPY target/movie-0.0.1-SNAPSHOT.jar /app

# Expose the port the application runs on
EXPOSE 8050

# Define the command to run the application when the container starts
CMD ["sh", "-c", "java -jar -Dspring.datasource.url=${DATABASE_URL} -Dspring.datasource.username=${DATABASE_USERNAME} -Dspring.datasource.password=${DATABASE_PASSWORD} -Dspring.datasource.table=${DATABASE_TABLE} movie-0.0.1-SNAPSHOT.jar"]

# docker build -t movie-app .
# docker run -e DATABASE_URL=jdbc:postgresql://moviedb.cboow0s4okta.us-east-1.rds.amazonaws.com:5432/initial_db -e DATABASE_USERNAME=postgres -e DATABASE_PASSWORD=bakii123 -e DATABASE_TABLE=movie -p 8050:8050 movie-app