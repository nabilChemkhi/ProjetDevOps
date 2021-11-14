FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/Timesheet-2.2.1-SNAPSHOT.jar Timesheet-2.2.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Timesheet-2.2.1-SNAPSHOT.jar"]
