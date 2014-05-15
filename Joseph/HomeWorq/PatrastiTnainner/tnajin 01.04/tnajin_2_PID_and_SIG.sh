#!/bin/bash
if [ `ps -All | grep $1 | wc -l` -eq 0 ];
        then
                echo "no $1 running..."
        else
ps -p $1 -o comm=
case $2 in
15) echo "SIGKILL -15";;
9) echo "SIGKILL -9";;
2) echo "SIGKILL -2";;
-1) echo "SIGKILL --1";;
*) suite;;
esac
kill -$2 $1
fi
#sleep 321 &
