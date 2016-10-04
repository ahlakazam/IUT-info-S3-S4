#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n=0, somme=0, i=0;
    scanf("%d", &n);
    for (i=0 ; i<=n ; i++)
    {
        if (i%2 == 0)
            somme += i;
    }
    printf("\n%d", somme);
    somme =0; i=0;
    while (i <= n)
    {
        if (i%2 == 0)
            somme += i;
        i++;
    }
    printf("\n%d", somme);
    somme =0; i=0;
    do
    {
        if (i%2 == 0)
            somme += i;
        i++;
    }while(i <= n);
    printf("\n%d", somme);
    return 0;
}
