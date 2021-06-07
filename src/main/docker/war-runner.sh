#!/bin/sh

[ -x /opt/setup.sh ] && /opt/setup.sh
 
cd /opt/war-runner && \
java -jar ./war-runner.jar
exit $?