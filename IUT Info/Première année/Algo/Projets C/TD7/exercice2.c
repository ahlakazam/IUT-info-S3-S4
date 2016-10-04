#include <stdio.h>
#include <stdlib.h>
#include "prototype.h"


int main()
{
    int L,h;
    char caractere;
    scanf("%d", &L); fflush(stdin);
    scanf("%d", &h); fflush(stdin);
    scanf("%c", &caractere); fflush(stdin);
    rectangle(L, h, caractere);
    return 0;
}
