#include <stdio.h>
#include <stdlib.h>

void somme_pair(int* somme, int T[])
{
    int i=0;
    for (i=0;i<10;i++)
    {
        if (*(T+i)%2==0)
            *somme +=(*T+i);
    }
}

void minimum(int T[], int* min, int* i_min)
{
    int i=0;
    *min = *(T);
    *i_min = 0;
    for (i=0;i<10;i++)
    {
        if ((*(T+i)) < *min)
        {
            *min = *(T+i);
            *i_min=i;
        }
    }
}

void maximum(float T[], float* max, int* i_max)
{
    int i=0;
    *max = *(T);
    *i_max = 0;
    for (i=0;i<10;i++)
    {
        if ((*(T+i)) > *max)
        {
            *max = *(T+i);
            *i_max=i;
        }
    }
}

int comptage (int T[], int nb, int n)
{
    int i=0;
    nb=0;
    for (i=0;i<10;i++)
    {
        if ((*(T+i)) == n)
        {
            nb++;
        }
    }
    return nb;
}

void matrice (int T[10][5])
{
    int i=0;
    int a=0;
    int b=1;
    for (i=0;i<10;i++)
    {
        for (a=0;a<5;a++)
        {
            *(*(T+i)+a)=b;
            printf(" %d |",*(*(T+i)+a));
            b++;
        }
    }

}
