#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

int main()
{
    int i=0, nb=0, n;
    int T[10];
    scanf("%d", &n);
    for (i=0;i<10;i++)
    {
        T[i]=i;
    }
    printf("%d",comptage(T,nb, n));

    return 0;
}
