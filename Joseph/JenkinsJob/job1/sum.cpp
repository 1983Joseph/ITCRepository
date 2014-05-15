#include <iostream>
#include <stdlib.h>
#include <stdio.h>
int sum(int a, int b)
{
    return(a+b);
}
int main(int argc, char *argv[])
{
    int a,b;
    a = atoi (argv[1]);
    b = atoi (argv[2]);
    std::cout << sum(a,b);
    return 0;
}
