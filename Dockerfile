FROM openjdk:8u265-jdk

MAINTAINER Rakesh Mittal "rakeshkumar.mittal@nttdata.com"

WORKDIR /usr/local/bin/

#Transfer our jar

COPY ./target/fleetman-0.0.1-SNAPSHOT.jar webapp.jar

EXPOSE 8080

CMD ["java", "-Dspring.profiles.active=docker-demo","-jar","webapp.jar"]