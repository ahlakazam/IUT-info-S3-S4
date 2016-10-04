#include <stdio.h>
#include <stdlib.h>

int main()
{
    long
    int nb, i=0, lignes, a=0;
    scanf("%d", &nb);
    for (a=1 ; a<=nb ; a++)
    {
        for (i=0 ; i<(nb-a) ; i++)
            printf(" ");
        for (i=1 ; i<2*a ; i++)
            printf("*");
        printf("\n");

    }

    return 0;
}
