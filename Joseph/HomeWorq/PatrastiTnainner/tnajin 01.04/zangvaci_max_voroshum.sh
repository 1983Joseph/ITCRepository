#!/bin/bash
read -a arr #mutqagrvac tveric zangvaci stacum
echo ${#arr[@]} #zangvaci artaberum
max=${arr[0]}   #max arjeqavorum
for ((j=1;j<=${#arr[*]}; j++)) #zangvaci elementneric maximumi voroshum
do
    if [ $max -lt ${arr[$j]} ]
     then
        max=${arr[$j]}
     fi     
done 
echo "max="$max #max artaberum

