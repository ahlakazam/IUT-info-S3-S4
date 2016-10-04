#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

int main()
{
    int i=0;
    int T1[20], T2[20], T3[20];
    int nbp=0, nbi=0;
    for (i=0;i<20;i++)
    {
        *(T1+i) = i+1;
    }
    separateur(T1,T2,&nbp,T3,&nbi);
    for (i=0;i<nbp;i++)
    {
        printf("%d ", *(T2+i));
    }
    printf("\n");
    for (i=0;i<nbi;i++)
    {
        printf("%d ", *(T3+i));
    }
    return 0;
}
