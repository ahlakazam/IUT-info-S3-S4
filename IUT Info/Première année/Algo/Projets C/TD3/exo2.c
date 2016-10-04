#include <stdio.h>

int main ()
{
    int a, b, A, B;
    scanf("%d", &a);
    scanf("%d", &b);
    A = a;
    B = b;
    while (a != b)
    {
        if (a < b)
            b -= a;
        else
            a -= b;
    }
    printf("\nLe PGCD de %d et %d est %d", A, B, a);
    return 0;
}
