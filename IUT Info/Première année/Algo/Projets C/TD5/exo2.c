#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main()
{
    int i=0; unsigned long long int n=1;
    for(i=1;i<=64;i++)
    {
        printf("hello %d\n",i);
        n *= 2;
        printf("%lld\n",n);
    }
    return 0;
}
