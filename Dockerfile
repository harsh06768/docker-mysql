FROM openjdk:8
EXPOSE 8085
ADD target/springboot-mysql-docker.jar springboot-mysql-docker.jar 
ENTRYPOINT ["java","-jar","/springboot-mysql-docker.jar"]