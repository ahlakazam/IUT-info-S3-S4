#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b, i=0;
    scanf("%d", &a);
    scanf("%d", &b);
    while (a >= b)
    {
        a -= b;
        i++;
    }
    printf("%d, reste %d", i, a);
    return 0;
}
