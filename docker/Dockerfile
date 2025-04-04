FROM amazoncorretto:21-alpine3.20

WORKDIR /

USER root

RUN apk add --no-cache curl

RUN curl -L -O https://github.com/prometheus/node_exporter/releases/download/v1.8.2/node_exporter-1.8.2.linux-amd64.tar.gz

RUN tar xvfz node_exporter-*.*-amd64.tar.gz

RUN rm node_exporter-*.*-amd64.tar.gz

COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar .

COPY ./docker/web-script.sh .

RUN chmod +x /web-script.sh

CMD ["/web-script.sh"]
