#!/usr/bin/env bash
JAR_NAME=gshop-0.0.1-SNAPSHOT.jar
PID_FILE=shopcenter.pid
PID=$(ps -ef | grep ${JAR_NAME} |grep -v grep|  awk '{print $2}')  # 算法有待细化
echo 'killing pid' ${PID}
kill ${PID}
rm ${PID_FILE} | true
