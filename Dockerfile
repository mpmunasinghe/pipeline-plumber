FROM ubuntu:20.04

RUN apt-get update && \
    apt-get install -y openjdk-11-jre-headless && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*;

COPY target/plumber-0.0.1-SNAPSHOT.jar .

RUN groupadd -g 999 plumbers && \
    useradd -r -u 999 -g plumbers plumber
USER plumber

EXPOSE 8080

ENTRYPOINT ["java","-jar","plumber-0.0.1-SNAPSHOT.jar"]
