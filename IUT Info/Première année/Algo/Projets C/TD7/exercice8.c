#include <stdio.h>
#include <stdlib.h>
#include "prototype.h"


int main()
{
    int T1[10], T2[10], i=0;
    char T3[]={'B','o','n','j','o','u','r'}, T4[]="Messieurs Dames\0";
    for (i=0;i<10;i++)
        T1[i] = 2+2*i;
    for (i=0;i<10;i++)
        T2[i] = 2*i+1;
    printf("Affichage du tableau T1 : \n"); tableauE(10, T1);
    printf("\n\nAffichage du tableau T2 : \n"); tableauE(10, T2);
    printf("\n\nAffichage du tableau T3 : \n"); chaines(T3);
    printf("\n\nAffichage du tableau T4 : \n"); chaines(T4);
    strcat(T3,T4);
    printf("\n\nAffichage du tableau T3 : \n"); chaines(T3);
    return 0;
}
