#!/bin/bash

# 需要配置=======================
BASE_DIR=/opt/service/marry-restructure-0.0.1-SNAPSHOT
# 服务英文名称，用于显示
SERVICE_NAME=marryRestructureService
# ===============================
PID_FILE=${BASE_DIR}/pid/${SERVICE_NAME}.pid
PID=`cat ${PID_FILE}`

if [[ -z ${PID} ]]; then
  echo "服务${SERVICE_NAME}未启动."
else
  echo "杀死进程${PID}"
  kill -9 ${PID}
  # TODO 再次确认是否成功KILL
  rm  ${PID_FILE}
  echo "停止服务成功"
fi

