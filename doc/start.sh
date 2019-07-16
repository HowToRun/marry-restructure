#!/usr/bin/env bash
./stop.sh
sleep 1
JAR_NAME=gshop-0.0.1-SNAPSHOT.jar
PID_FILE=shopcenter.pid
nohup java -jar ${JAR_NAME} &
PID=$(ps -ef | grep ${JAR_NAME} |grep -v grep|  awk '{print $2}')  # 算法有待细化
echo 'starting pid '${PID}
echo ${PID} > ${PID_FILE}
