FROM openjdk:8-jdk-alpine
# Define environment variables
#ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \JAVA_OPTS=""
EXPOSE 8081
ADD target/*.jar myapp1.jar
ENTRYPOINT ["java","-jar","/myapp1.jar"]

