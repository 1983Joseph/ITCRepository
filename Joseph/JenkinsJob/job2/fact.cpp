#include <iostream>
#include <stdlib.h>
#include <stdio.h>
int fact(int a)
{
    if (a<0)
    {
        return 0;
    }
    if (a==0)
        return 1;
    else
        return a*fact(a-1);
}
int main(int argc, char *argv[])
{
    int a;
    a = atoi (argv[1]);
    std::cout << fact(a);
    return 0;
}
