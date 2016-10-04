#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i=0;
    double montant=1600.0;
    for (i=1 ; i < 100 ; i++)
    {
        montant *= 1.02;
    }
    printf("%f", montant);

    return 0;
}
