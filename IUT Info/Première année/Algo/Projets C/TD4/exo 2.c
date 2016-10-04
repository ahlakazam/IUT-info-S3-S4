#include <stdio.h>
#include <stdlib.h>

int main()
{
    int nb=0, billet[]={500 , 200 , 100 , 50 , 20 , 10 , 5 , 2 , 1}, compteurbillets[9]={}, reste=0, i=0;
    scanf("%d", &nb);
    do
    {
        compteurbillets[i] = nb / billet[i];
        nb -= compteurbillets[i] * billet[i];
        if (compteurbillets[i])
            printf("\n%d x %d", billet[i], compteurbillets[i]);
        i++;
    }while (nb != 0);

    return 0;
}
