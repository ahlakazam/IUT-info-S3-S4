#include <stdio.h>
#include <stdlib.h>

int main()
{
    int nb, somme=1, i=0;
    scanf("%d", &nb);
    for (i=1 ; i<=nb ; i++)
        somme *= i;
    printf("%d", somme);
    return 0;
}
