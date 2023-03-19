FROM openjdk:17-oracle
EXPOSE 8080
ADD target/*.jar users-test.jar
ENTRYPOINT ["java","-jar","/users-test.jar"]