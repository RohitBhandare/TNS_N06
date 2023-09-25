# Use a base Java image from Docker Hub
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code into the container's working directory
COPY /Day2/src/com/loops/ForLoop.java .

# Compile the Java program
RUN javac ForLoop.java

# Set the entry point to run the compiled Java program
CMD ["java", "com.loops.ForLoop"]
