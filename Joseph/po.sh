#!/bin/bash
#tr -d "[\n]" < linux.txt > linux.txt.swp && mv linux.txt.swp linux.txt
cat linux.txt | tr -s "[\n]" "[ ]" > linux.txt.swp && mv linux.txt.swp linux.txt
