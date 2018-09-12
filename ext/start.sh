#!/bin/bash

#Runtime Setup

MODE=dev


if [ "$1" = 'docker' ]; then
    echo 'using docker configuration'
    JAVA_HOME="/usr/lib/jvm/java-8-openjdk-amd64"
    APP_PATH="/work"
  fi

PID_FILE=/var/run/ssm-docker.pid
JAVA_OPTS="-Dfile.encoding=UTF-8 -Djava.ext.dirs=${APP_PATH}/lib"
if [ "$1" = 'docker' ]; then
  ${JAVA_HOME}/bin/java ${JAVA_OPTS} -jar ${APP_PATH}/ssm-docker-0.0.1-SNAPSHOT.jar

  for t_s in {1..10} ;do
    sleep 1
    APP_PID=$(ps -ef | grep "/data1/javaapp/ssm-docker" | grep -Ev "grep" | awk -F " " '{print $2}')
    if [ "null$APP_PID" != "null" ];then
      echo ${APP_PID} > ${PID_FILE}
      break
    fi
  done
fi
