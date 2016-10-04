#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void rempli_matrice(int matrice[10][10], int n)
{
    int i=0, a=0, b=0;
    for (i=0;i<n;i++)
    {
        for (a=0;a<n;a++)
        {
            matrice[i][a]=b;
            printf("%d ",matrice[i][a]);
            b++;
        }
        a=0;
        printf("\n");
    }
}


