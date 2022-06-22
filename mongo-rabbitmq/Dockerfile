FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/mongo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE}  mongo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mongo-0.0.1-SNAPSHOT.jar"]
