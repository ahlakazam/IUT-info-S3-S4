#include <stdio.h>
#include <stdlib.h>

int main()
{
    long
    int nb, i=0, lignes, a=0;
    scanf("%d", &nb); scanf("%d", &lignes);
    for (a=0 ; a<lignes ; a++)
    {
        for (i=0 ; i<nb ; i++)
            printf("*");
        i=0;
        printf("\n");
    }

    return 0;
}
