#!/bin/bash
    cat /dev/null > .q6q5q4.txt
    find /home/ -name '.q4q5q6.txt' 2>/dev/null > .q6q5q4.txt
    char=$(echo `cat .q6q5q4.txt` | sed -e 's/.q4q5q6.txt/REPOZIT\//g')
    while [ 1==1 ]; do
    echo " "
    echo "Copy_from=1"
    echo "Copy_to=2"
    echo "Delete_f=3"
    echo "Delete_d=4"
    echo "ADD_f=5"
    echo "ADD_d=6"
    echo "SEE=7"
    echo "EXIT=8"
    echo -en "\nmutqagreq nax@ntreli funciayi hamar@="
    read f
    echo " "
LS (){
    cd $char
    echo "REPOZTI parunakutyun@"
    echo $(ls)
    echo " "
 }
LS
Copy_from () {
    echo " "
    echo "Copy file from REPOZIT"
    echo -en "mutqagreq filepath sksac REPOZIT/"
    read filepath
    echo -en "\nmutqagreq filename="
    read filename
    echo -en "\nmutqagreq path_fromcopy="
    read path_tocopy
    cp $char$filepath/$filename $path_fromcopy/
    echo " "
    return 0
}
Copy_to () {
    echo " "
    echo "Copy file to REPOZIT"
    echo -en "mutqagreq filepath sksac REPOZIT/"
    read filepath
    echo -en "\nmutqagreq filename="
    read filename
    echo -en "\nmutqagreq path_tocopy="
    read path_tocopy
    cp $path_tocopy/$filename $char$filepath/
    echo " "
    return 0
}
Delete_f () {
    echo " "
    echo "Delete file in REPOZIT"
    echo -en "mutqagreq filepath sksac REPOZIT/"
    read filepath
    echo -en "\nmutqagreq filname="
    read filename
    cd $char$filepath
    rm $filename
    echo " "
    return 0
}
Delete_d () {
    echo " "
    echo "Delete dir in REPOZIT"
    echo -en "\nmutqagreq dirpath sksac REPOZIT/"
    read dirpath
    echo -en "\nmutqagreq dirname="
    read dirname
    cd $char$dirpath
    rm -r $dirname
    echo " "
    return 0
}
ADD_f () {
    echo " "
    echo "ADD file in REPOZIT"
    echo -en "mutqagreq filepath sksac REPOZIT/"
    read filepath
    echo -en "\nmutqagreq filename="
    read filename
    touch $char$filepath$filename
    echo " "
    return 0
}
ADD_d () {
    echo " "
    echo "ADD dir in REPOZIT"
    echo -en "\nmutqagreq dirpath sksac REPOZIT/"
    read dirpath
    echo -en "\nmutqagreq dirname="
    read dirname
    mkdir $char$dirpath$dirname
    echo " "
    return 0
}
SEE () {
    echo " "
    echo -en "\nmutqagreq dirpath sksac REPOZIT/"
    read dirpath
    cd $char$dirpath
    echo "dir parunakutyun@"
    echo $(ls)
    echo " "
}
EXIT () {
exit 0
}
case "$f" in
    [1] ) Copy_from;;
    [2] ) Copy_to;;
    [3] ) Delete_f;;
    [4] ) Delete_d;;
    [5] ) ADD_f;;
    [6] ) ADD_d;;
    [7] ) SEE;;
    [8] ) EXIT;;
esac
done
