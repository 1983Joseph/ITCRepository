#! /bin/bash
if which sl #sl arkayutyan stugum 
then        #sl goyutyan depqum jamanaki fiqsum  
    let now2=$(date +"%H")*3600+$(date +"%M")*60
    let d=$1*3600+$2*60
    echo $d $now2
else        #sl bacakayutyan depqum jamanaki fiqsum
    let now2=$(date +"%H")*3600+$(date +"%M")*60
    let d=$1*3600+$2*60
    echo $d $now2
su          #user popoxum
sudo apt-get install sl #sl install
fi
if [ $d -le $now2 ]     #mutqarac jamanaki chishtutyan stugum
then
    echo "erorr"        #sxal aryunqi artaberum
else 
    let h=$d-$now2      #pahajami stacum  
    sleep $h            #sl qnecum 
sl                      #sl qshum 
fi

