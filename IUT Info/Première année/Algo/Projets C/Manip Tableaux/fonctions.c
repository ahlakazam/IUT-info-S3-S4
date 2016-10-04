#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

int maxTab (int T[], int taille)
{
    int i=0;
    int max=0;
    for (i=0;i<taille;i++)
    {
        if (T[i] > T[max])
            max = i;
    }
    return max;
}

int estTriecroissant (int T[], int n)
{
    int i=0;
    for (i=0;i<n-1;i++)
    {
        if (T[i+1] < T[i])
        {
            return 0;
        }

    }
    return 1;
}

int estTriedecroissant (int T[], int n)
{
    int i=0;
    for (i=0;i<n-1;i++)
    {
        if (T[i+1] > T[i])
            return 0;
    }
    return 1;
}

int recherche (int T[], int n, int recherche)
{
    int i=0;
    for (i=0;i<n;i++)
    {
        if (T[i] == recherche)
            return i;
    }
    return -1;
}

int rechercheDicho (int T[], int n, int recherche)
{
    int limitesupp = n-1;
    int limiteinf = 0;
    int pivot = (limitesupp + limiteinf)/2;
    if (estTriecroissant(T, n) == 0)
        return -2;
    while (T[pivot] != recherche && (limitesupp >= limiteinf))
    {
        if (T[pivot] < recherche)
            limiteinf = pivot + 1;
        else if (T[pivot] > recherche)
            limitesupp = pivot - 1;
        else
            return pivot;
        pivot = (limitesupp+limiteinf)/2;
    }
    if (limitesupp >= limiteinf)
        return pivot;
    return -1;
}




