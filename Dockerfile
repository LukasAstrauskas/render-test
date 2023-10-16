FROM gradle:7.3.1-jdk17-alpine AS build
COPY ..
RUN gradle clean build

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/Web_Test-0.0.1-SNAPSHOT.jar Web_Test.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Web_Test.jar"]