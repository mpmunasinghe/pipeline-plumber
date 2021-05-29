FROM ubuntu:20.04

RUN apt-get update && \
    apt-get install -y openjdk-11-jre-headless && \
    apt-get clean;


COPY target/plumber-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java","-jar","plumber-0.0.1-SNAPSHOT.jar"]
