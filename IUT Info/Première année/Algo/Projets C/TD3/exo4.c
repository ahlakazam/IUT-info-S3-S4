#include <stdio.h>
#include <math.h>

int main ()
{
    int a=0, b=0, A, i=1;
    scanf("%d", &a); A=a;
    scanf("%d", &b);
    for (i=1;i < b;i++)
    {
        a += A;
    }
    printf("%d\n", a);
    a = A;
    i = 1;
    while (i < b)
    {
        a +=A;
        i++;
    }
    printf("%d", a);
    return 0;
}
