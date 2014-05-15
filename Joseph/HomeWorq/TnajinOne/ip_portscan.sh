#!/bin/bash
if which nmap #arajin hertin stugvum e nmap cragri arkajutyun@
then echo "nmap installed"  #ete nmap install exac e artaberum e ays messeg@
else
echo "nmap no installed"  #ete voch artaberum e messeg ev ancnum e superuseri 
su                        #aystex kpahanjvi password mutqagrum    
sudo apt-get install nmap #kkatarvi nmap cragri install verjum harkavor kexni 
fi                        #@ntrel "exit" tarberak@ 
ipFilename=ip.txt         #popoxani veragrum  
portFilename=port.txt     #popoxakani veragrum 
while read ip; do         #"while do"cikli mijocov kardum e ip.txt file
while read port; do       #nuyn kerp kardum e port.txt file
echo $ip":"$port          #artaberum e stacvac zujger@
if echo `nmap -PN $ip -p$port` | grep -q "open" #scan e anum ayd ip:port zujg@
then echo $ip":"$port>>available.txt     #ete "grep -q" hraman@ true e       
else echo $ip":"$port>>unavailable.txt   #ete false hamapatasxan avelacumner
fi                                       #fileri mech
done < $portFilename;                    #cikleri pakox hramanner
done < $ipFilename;
