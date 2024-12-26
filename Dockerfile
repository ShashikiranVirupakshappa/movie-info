#first line is base image which openjdk:17 which jdk version 17 is used
FROM openjdk:21

#second line tells which port to use for your app
EXPOSE 8090
ADD target/movie-info.jar movie-info.jar
ENTRYPOINT ["java", "-jar", "/movie-info.jar"]