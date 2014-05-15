#!/bin/bash
echo -n "Enter file name : " #file name mutqagrum
read file  #file @ntercum
[ -w $file ] && W="Write = yes" || W="Write = No" #file prmistions voroshum
[ -x $file ] && X="Execute = yes" || X="Execute = No"
[ -r $file ] && R="Read = yes" || R="Read = No"
echo "$file permissions" #ardyunqneri artaberum
echo "$W"
echo "$R"
echo "$X"
