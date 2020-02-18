FROM openjdk:11-jdk
ADD target/docker-0.0.1-SNAPSHOT.jar docker.jar
EXPOSE 8080 5005
CMD ["java", "-jar", "docker.jar"]
