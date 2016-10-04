#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int n, centaines, dizaines, unites;
    while (1)
    {
        scanf("%d", &n);
        centaines = n/100;
        dizaines = n/10-centaines*10;
        unites = n-centaines*100-dizaines*10;
        if ((pow(centaines,3)+pow(dizaines,3)+pow(unites,3)) == n)
            printf("Nombre d'Armstrong !\n");
        else
            printf("Non...\n");
    }

    return 0;
}
