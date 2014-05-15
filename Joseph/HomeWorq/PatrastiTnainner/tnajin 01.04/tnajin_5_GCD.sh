#!/bin/bash
ARGS=2 #argumentneri tiv@
vat_arg=65 #sxal nermucum
if [ $# -ne "$ARGS" ] #mutqagrvac argumentneri tvi stugum
then
    echo "Ogtagorcman hertakanutyun: `basename $0` arajin_tiv erkrord_tiv"
    exit $vat_arg
fi
gcd ()
{
    dividend=$1  #popoxakanneri veragrum                 
    divisor=$2              
    remainder=1  
    until [ "$remainder" -eq 0 ]     #himnakan cikl
    do
        let "remainder = $dividend % $divisor"
        dividend=$divisor           
        divisor=$remainder
    done                           
}                                
gcd $1 $2 #mutqagrman apahovvum
echo; echo "amenapoqr_@ndhanur_bajanarar $1 ev $2 = $dividend"; echo #ardjunq
exit 0
