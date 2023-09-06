FROM maven:3.8-openjdk-17 as maquinabuild

COPY . .

RUN mvn clean package -DskipTest

FROM openjdk:17-jdk-slim

COPY --from=maquinabuild /target.sala_demo-0.0.1-SNAPSHOT.jar fidalgo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","fidalgo.jar"]