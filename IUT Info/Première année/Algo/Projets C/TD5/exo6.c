#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int test=0, erreur=0;
    char caractere='a';
    while (caractere != ',')
    {
        scanf("%c",&caractere);
        fflush(stdin);
        if (caractere == '(')
            test=1;
        if ((caractere ==')') && (test==0))
            erreur=1;
        if ((caractere =='(' && (test==1)))
            erreur=1;
        if ((caractere==')') && (test==1))
            erreur=0;
    }
    if (erreur==1)
        printf("Game Over !");
    else
        printf("Bien joue !");

    return 0;
}
