#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i=0, somme=0;
    while (somme < 1000)
    {
        somme += i;
        printf("Somme : %d\ni : %d\n", somme, i);
        i++;
    }
    printf("%d", i-1);
    return 0;
}
