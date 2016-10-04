#include <stdio.h>
#include <math.h>

int main ()
{
    int min, max, n=0, i=0;
    float moyenne=0;
    scanf("%d", &n);
    min = n;
    max = n;
    while (n != -1)
    {
        if (n < min)
            min = n;
        else if (n > max)
            max = n;
        moyenne += n;
        i++;
        scanf("%d", &n);
    }
    moyenne /= (float)i;
    printf("Min : %d\nMax : %d\nMoyenne : %f", min, max, moyenne);
    return 0;
}
