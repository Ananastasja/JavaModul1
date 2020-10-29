#!/bin/bash
date
USER=Anastasia
echo "hello $USER!"
pwd
ps auux | tail +2 | wc -l
ps auux | grep bioset | grep -v grep | wc -l
ls -l /etc/passwd | awk {'print $1'}
