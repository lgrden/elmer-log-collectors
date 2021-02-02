#!/bin/bash
mvn clean install
docker build -t elmer-log-producer log-producer
docker-compose -f docker-compose-all.yaml --env-file docker.env up -d