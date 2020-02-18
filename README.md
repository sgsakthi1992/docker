#SpringBoot with Docker

* To build the docker image

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
