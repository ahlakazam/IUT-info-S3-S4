#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, i=1,nombre=1, precedent1=0, precedent2=0;
    scanf("%d", &n);
    printf("%d\n", nombre);
    precedent1=nombre;
    for(i=1;i<n;i++)
    {
        printf("%d\n", nombre);
        precedent2 = precedent1;
        precedent1=nombre;
        nombre = precedent1 + precedent2;
    }
    return 0;
}
