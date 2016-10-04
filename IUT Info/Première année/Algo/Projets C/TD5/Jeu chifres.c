#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void comparaison(int n, int mystere, int i)
{
    if (n > mystere)
        printf("Plus petit ! %d coups\n\n",i) ;
    else if (n < mystere)
        printf("Plus grand ! %d coups\n\n",i);
    else
        printf("Gagne en %d coups !",i);
}

int main()
{
    int mystere=rand()%(1000-1) +1;
    int n=-1,i=0;
    while (n != mystere)
    {
        printf("Entrez un nombre : ");
        scanf("%d", &n);
        i++;
        comparaison(n, mystere,i);

    }

    return 0;
}
