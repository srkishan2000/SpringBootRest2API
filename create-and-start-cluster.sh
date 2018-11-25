#!/usr/bin/env bash
set -e

docker build -f DockerFile -t spring_boot_rest_2_api .

docker run -d --name spring_boot_rest_2_api -p 8083:8083 spring_boot_rest_2_api

docker logs --follow spring_boot_rest_2_api
