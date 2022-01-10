# ---- Base maven ----
FROM maven:3.5.4-jdk-8-alpine AS build

COPY . /app
RUN mvn -f /app/pom.xml clean package -DskipTests -Dapp.finalName=job-definition-api


FROM adoptopenjdk/openjdk8:alpine

COPY --from=BUILD /app/target/job-definition-api.jar /app.jar
EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

EXPOSE 8080
