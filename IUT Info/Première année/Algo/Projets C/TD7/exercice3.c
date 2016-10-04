#include <stdio.h>
#include <stdlib.h>

int test_espace(int N)
{
    char caractere;
    int somme=0, i=0;
    for (i=0;i<=N;i++)
    {
        scanf("%c", &caractere); fflush(stdin);
        if (caractere == ' ')
            somme++;
    }
    return somme;
}
