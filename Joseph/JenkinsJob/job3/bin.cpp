#include <iostream>
#include <stdlib.h>
#include <stdio.h>
int main(int argc, char *argv[])
{
    int a,b;
    int p=0;
    int t=1;
    a = atoi (argv[1]);
    while (a>0)
    {
        b=a%2;
        a=a/2;
        p=p+b*t;
        t=t*10;
    }
    std::cout <<p<<"\n";
    return 0;
}
