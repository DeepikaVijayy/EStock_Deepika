FROM openjdk:8-jdk-alpine
ENV PORT 8080
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} estockmarket-stock.jar
ENTRYPOINT ["java","-jar","/estockmarket-stock.jar"]