#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "prototype.h"


int main()
{
    int T1[10]={}, i=0;
    remplissage(T1);
    for (i=0;i<10;i++)
        printf("%d", T1[i]);
    return 0;
}
