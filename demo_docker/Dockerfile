FROM openjdk:17-jdk-alpine
WORKDIR /opt/app
COPY target/demo_docker-0.0.1-SNAPSHOT.jar demodocker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demodocker.jar"]
