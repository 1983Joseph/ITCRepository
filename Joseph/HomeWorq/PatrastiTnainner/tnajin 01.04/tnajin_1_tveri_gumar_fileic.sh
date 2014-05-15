#!/bin/bash
#script@ ashxatacnelu hamar anhrajesht e mutqagrel file.txt anun@      
sum=0;           #popoxakanneri arjeqavorum
`grep -P -o "[0-9]+" $1 > g.txt` #mutqagrac file tvanshanneri grancum 
                                                  # g.txt filei mech
for ((i=1; i<=`cat g.txt | wc -l`; i++))   #ajd tveri gumari hashvum  
do
let sum=$sum+`head -n $i g.txt | tail -n 1`
done
echo "$sum"                                      #ardjunqi artacum
rm g.txt
