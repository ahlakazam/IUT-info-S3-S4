#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    printf("Hello world!\n");
    srand(time(NULL));
    int i=0;
    int j=0,k=0;
    int tab[100];
    for (i=0;i<500;i++)
    {
        tab[i] = (rand() % 6) +1;
    }
    for (i=2;i<8;i++)
    {
        k=0;
        while (tab[j] != i && j < 500)
        {
            j++;
            k++;
        }
        printf("%d", k);
    }
    return 0;
}
