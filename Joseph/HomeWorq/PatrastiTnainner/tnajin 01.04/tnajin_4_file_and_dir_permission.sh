#!/bin/bash
for filename in $@; do #filename mutqagrum
    result=
    if [ -f $filename ]; then  #file prmissions voroshum
        result="$filename is a regular file"
    else
    if [ -d $filename ]; then
        result="$filename is a directory"
    fi
    fi
    if [ -w $filename ]; then
        result="$result and it is writable"
    else
        result="$result and it is not writable"
    fi
    if [ -x $filename ]; then
        result="$result and it is executable"
    else
        result="$result and it is not executable"
    fi
    if [ -r $filename ]; then
        result="$result and it is readable"
    else
        result="$result and it is not readable"
    fi
    if [ -O $filename ]; then
        result="$result and it is owned by the effective user id "
    else
        result="$result and it is not exists"
    fi
    if [ -u $filename ]; then
        result="$result and it is  set-user-id bit is set"
    else
        result="$result and it is not exists"
    fi
    echo "$result"
done


