FROM sapmachine:latest
ADD target\demo-jenkins-0.0.1-SNAPSHOT.jar demo-jenkins-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT [ "jave", "-jar", "demo-jenkins-0.0.1-SNAPSHOT.jar" ]
