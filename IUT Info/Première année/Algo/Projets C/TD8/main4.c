#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

int main()
{
    int T[10], i=0, min, i_min;
    for (i=0;i<10;i++)
    {
        T[i]=i+1;
    }
    minimum(T,&min,&i_min);
    printf("Min : %d, indice %d", min, i_min);

    return 0;
}
