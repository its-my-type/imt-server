#!/bin/bash

process=$(ps -ef | grep '[i]mt')

pid=$(echo ${process} | cut -d " " -f2)

echo $pid
kill -9 $pid

