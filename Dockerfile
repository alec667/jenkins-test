FROM amazoncorretto:21-alpine
ADD target/demo-jenkins-0.0.1-SNAPSHOT.jar demo-jenkins-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "demo-jenkins-0.0.1-SNAPSHOT.jar" ]
