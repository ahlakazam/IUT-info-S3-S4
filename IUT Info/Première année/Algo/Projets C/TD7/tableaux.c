#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void tableauE (int n, int tableau[])
{
    int i=0;
    for (i=0;i<n;i++)
        printf(" %d |", tableau[i]);
}

void chaines (char tableau[])
{
    printf("%s\nTaille du tableau : %d", tableau, strlen(tableau));
}

void remplissage(int tableau[])
{
    int i=0,n=0;
    for (i=0;i<10;i++)
    {
        scanf("%d", &n); fflush(stdin);
        if (n==-1)
            break;
        tableau[i]=n;
    }

}

int moyenne (int tableau[], int n)
{
    int i=0,somme=0;
    for (i=0;i<n;i++)
    {
        somme += tableau[i];
    }
    somme /= n;
    return somme;
}

int min (int tableau [], int n)
{
    int i=0;
    int min=tableau[0];
    for (i=0;i<n;i++)
    {
        if (tableau[i] < min)
            min = tableau[i];
    }
    return min;
}

int max (int tableau [], int n)
{
    int i=0;
    int max=tableau[0];
    for (i=0;i<n;i++)
    {
        if (tableau[i] > max)
            max = tableau[i];
    }
    return max;
}

void est_trie (int tableau[], int n)
{
    int i=1, tri=1;
    for (i=1;i<n;i++)
    {
        if (tableau[i] < tableau[i-1])
        {
            printf("Non trie");
            tri=0;
        }
    }
}


