FROM openjdk:20-ea-17-slim-buster as builder
WORKDIR /app
COPY ./ src-data

#RUN apt-get update -y && apt-get install maven -y && cd src-data && mvn clean package

FROM openjdk:20-ea-17-slim-buster

WORKDIR /app

RUN apt-get update -y && apt-get upgrade -y

COPY ./target/*.jar ./app.jar
COPY ./src/main/resources/db/characters.csv ./src/main/resources/db/characters.csv

ENTRYPOINT java -jar app.jar

