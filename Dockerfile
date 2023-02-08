FROM openjdk:20-ea-17-slim-buster as builder
WORKDIR /app
COPY ./ src-data

#RUN apt-get update -y && apt-get install maven -y && cd src-data && mvn clean package

FROM openjdk:20-ea-17-slim-buster

WORKDIR /app

RUN apt-get update -y && apt-get upgrade -y && apt-get install wget -y && \
    cd  /tmp && \
    wget https://dlcdn.apache.org/maven/maven-3/3.9.0/binaries/apache-maven-3.9.0-bin.tar.gz && \
    tar xvf apache-maven-3.9.0-bin.tar.gz && \
    mkdir -p /usr/share/maven && \
    cd /usr/share/maven && \
    cp -r /tmp/apache-maven-3.9.0/* . && \
    export MAVEN_HOME=/usr/share/maven && export PATH=\$PATH:/usr/share/maven/bin

COPY ./src /tmp/project/src
COPY ./pom.xml /tmp/project/pom.xml
RUN cd /tmp/project && /usr/share/maven/bin/mvn clean package && cp ./target/*.jar /app/app.jar && cd /app

#COPY ./target/*.jar ./app.jar
COPY ./src/main/resources/db/characters.csv ./src/main/resources/db/characters.csv
COPY ./src/main/resources/db/episodes.csv ./src/main/resources/db/episodes.csv

ENTRYPOINT java -jar app.jar

