#include <stdio.h>
#include <stdlib.h>
#include "prototype.h"
#include "dessin.c"

int exercice1()
{
    int L;
    char caractere;
    scanf("%d", &L);
    fflush(stdin);
    scanf("%c", &caractere);
    ligne(L, caractere);
    return 0;
}
