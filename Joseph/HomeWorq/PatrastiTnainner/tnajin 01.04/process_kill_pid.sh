#!/bin/bash
#function name { commands; } or name () { commands; }
function terminate_process 
{
   if [ `ps -All | grep $1 | wc -l` -eq 0 ];
   then
      echo "no $1 running..."
   else
      user_id=`whoami`
      ps -eo pid, comm, user | grep $1 | grep $user_id > file_name
      pid=`sed -e 's/^ *//g' -e 's/\ .*//g' file_name`
      kill -15 $pid
     #rm -f file_name
   fi
}
terminate_process $1
