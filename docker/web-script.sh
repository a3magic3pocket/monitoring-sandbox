#!/bin/sh

# Run node_exporter
./node_exporter-*.*-amd64/node_exporter --web.listen-address=0.0.0.0:9100 --log.level=info &

# Run spring
java -jar /demo-*.jar "$@"