# SpringBoot with Docker


* To build the docker image without a maven plugin

`docker build -t sgsakthi1992/docker:latest .`

* To check the list of created docker images

`docker images`

* To run the container

`docker run --rm -it -p 8080:8080 -p 5005:5005 sgsakthi1992/docker:latest`

* To get the list of running containers

`docker container ls`

* To stop the running container

`docter container stop <container_id>`

* To enable remote debugging

`-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005`

* To run the docker build via maven - add the plugin

`mvn clean package docker:build`

`docker run --rm -it -p 8080:8080 -p 5005:5005 docker-image:latest`

* To run the container using docker-compose.yml

`docker-compose up -d`

**Note:** -d to run in the background

* To check the status of the containers

`docker-compose ps`

* To stop the running container using docker-compose.yml

`docker-compose down`