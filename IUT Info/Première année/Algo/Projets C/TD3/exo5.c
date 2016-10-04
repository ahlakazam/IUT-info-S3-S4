#include <stdio.h>
#include <math.h>

int main ()
{
    int n=-1, i=0, resultat=0;
    while (n < 0)
    {
        scanf("%d", &n);
    }
    for (i=1 ; i<n ; i++)
    {
        if (i * i == n)
        {
            resultat = 1;
            break;
        }
    }
    if (resultat == 1)
        printf("\nOui, carre de %d", i);
    else
        printf("Non");
    return 0;
}
