#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

void triSelection (int T[], int taille)
{
    int i;
    int temp = 0;
    int max=0;
    for (i=0;i<taille;i++)
    {
        temp = T[taille-i-1];
        max = maxTab(T,taille-i-1);
        T[taille-i-1] = T[max];
        T[max] = temp;
        afficheTableau(T,taille); printf("\n");
    }
}

void afficheTableau (int T[], int taille)
{
    int i=0;
    for (i=0;i<taille;i++)
    {
        printf("%d ", T[i]);
    }
}

void triBulle (int T[], int taille)
{
    int i=0;
    int temp=0;
    int test = 1;
    while (test == 1)
    {
        test = 0;
        for (i=0;i<taille;i++)
        {
            if (T[i+1] < T[i])
            {
                temp=T[i];
                T[i] = T[i+1];
                T[i+1] = temp;
                test = 1;
            }
        }
    }
}

void suppElementPos (int T[], int *taille, int pos)
{
    int i=pos;
    for (i=pos;i<*taille;i++)
    {
        T[i] = T[i+1];
    }
    (*taille)--;
    realloc(T,*taille * sizeof(int));
}

void suppElem (int T[], int *taille, int cible)
{
    int indice = recherche(T,*taille,cible);
    if (indice != -1)
        suppElementPos(T,taille,indice);
    else
        printf("Element inexistant");
}

void suppTous (int T[], int *taille, int cible)
{
    int indice = recherche(T,*taille,cible);
    if (indice == -1)
    {
        printf("Element inexistant");

    }
    else
    {
        while (indice != -1)
        {
            suppElementPos(T,taille,indice);
            indice = recherche(T,*taille,cible);
        }
    }
}

void inserElemPos (int T[], int *taille, int indice, int element)
{
    int i=*taille;
    (*taille)++;
    //realloc(T,*taille * sizeof(int));
    printf("bonjour  ");
    for (i=(*taille)-1;i>=indice+1;i--)
    {
        printf("  %d  ",i);
        T[i] = T[i-1];
    }
    T[indice] = element;
}

void inserElem (int T[],int *taille, int element)
{
    realloc(T,(*taille)+1 * sizeof(int));
    int i = (*taille)-1;
    if (estTriecroissant(T,*taille))
    {
        while ((T[i] > element) && (i > 0))
        {
            T[i+1] = T[i];
            i--;
        }
        T[i+1] = element;
    }
    (*taille)++;
}
