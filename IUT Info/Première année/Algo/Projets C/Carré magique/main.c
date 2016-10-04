#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

int main()
{
    int T[5][5];
    int i=0, a=0;
    for (i=0;i<5;i++)
    {
        for (a=0;a<5;a++)
        {
            T[i][a]=0;
        }
    }
    remplissage(T);
    for (i=0;i<5;i++)
    {
        for (a=0;a<5;a++)
        {
            printf(" %d ",T[i][a]);
        }
        printf("\n");
    }
    return 0;
}
