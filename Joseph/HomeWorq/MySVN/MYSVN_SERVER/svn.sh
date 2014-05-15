#!/bin/bash
cat /dev/null > .q4q5q6.txt
pwd > .q4q5q6.txt
charg=$(echo `cat .q4q5q6.txt`)
INF=/usr/bin/inotifywait
TARGET=$charg
gnome-terminal --command=" tail -f my.files.log"
$INF -rm -e modify -e create -e delete -e move $TARGET/REPOZIT | while read file events; do 
echo "$(date) : $events : $file"
 done >> my.files.log
