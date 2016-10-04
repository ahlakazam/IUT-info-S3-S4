#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include "prototypes.h"

using namespace std;

void creerPile (pile* p, int taille)
{
    p->taille = taille;
    p->sommet = 0;
    p->tab = (float*) malloc(sizeof(float) * taille);
}

void empiler (pile* p, int element)
{
    if (estPleine(*p))
    {
        p->taille++;
        p->tab = (float*) realloc(p->tab,sizeof(float)*p->taille);
    }
    p->sommet++;
    p->tab[p->sommet] = element;
}

void depiler (pile* p)
{
    if (estVide(*p))
        throw -1;
    p->sommet--;
}

void afficherPile (pile p)
{
    if (estVide(p))
        throw -1;
    int i=0;
    for (i=0;i<p.sommet;i++)
    {
        cout << "Valeur " << i+1 << ": " << p.tab[i+1] << endl;
    }
}

void errorCode (int e)
{
    system("cls");
    cout << "Une erreur est survenue, code " << e << endl;
}
