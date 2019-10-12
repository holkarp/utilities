FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /target/st_auto_scale-0.0.1-SNAPSHOT.jar st_auto_scale.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","st_auto_scale.jar"]