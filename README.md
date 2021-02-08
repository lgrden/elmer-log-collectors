# elmer-log-collectors @ We Get IT

## Description
Elmer is a simple project that shows capabilities collecting application logs by Elastic Stack.

## System requirements
- JDK 11+
- Maven 3.6.1+
- Docker 19.03.12+

## Services
- elmer-log-producer - client producing logs (port 9095)
- elmer-elasticsearch - elastic search instance (port 9200)
- elmer-logstash - logstash consuming logs (port 5000)
- elmer-kibana - kibana visualizing logs (port 5601)

## Build tools and Docker
- build maven project, docker images and run services ```docker_build_deploy.sh```