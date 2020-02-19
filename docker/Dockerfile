FROM openjdk:11-jdk
ADD docker-0.0.1-SNAPSHOT.jar docker.jar
EXPOSE 8080 5005
CMD ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "docker.jar"]
