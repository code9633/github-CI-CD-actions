FROM openjdk:17
EXPOSE  8080
COPY target/springboot-image.jar /springboot-image.jar
ENTRYPOINT ["java","-jar","/springboot-image.jar"]