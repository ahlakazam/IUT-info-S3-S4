#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

int main()
{
    int i=0, i_max;
    float max, T[10];
    for (i=0;i<10;i++)
    {
        T[i]=(float)(1.2*i);
    }
    maximum(T,&max,&i_max);
    printf("Max : %f, indice %d", max, i_max);

    return 0;
}
