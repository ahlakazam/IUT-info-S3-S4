#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include "prototypes.h"
#include "Tests_Unit.h"

void construire_element (ensemble* e)
{
    e->cardinal = 0;
    e->element = (int*) malloc(sizeof(int));
    if (e->element == NULL) throw 0;
}

void ajouter_element (ensemble *e, int valeur)
{
    if (e->cardinal != 0)
    {
        e->element = (int*) realloc(e->element, sizeof(int)*(e->cardinal+1));
        if (e->element == NULL) throw 0;
    }
    e->element[e->cardinal] = valeur;
    printf("%d\n", e->element[e->cardinal]);
    e->cardinal++;


}

void union_ensemble (ensemble *e1, ensemble *e2, ensemble *e3)
{
    int i=0;
    for (i=0;i<e1->cardinal;i++)
    {
        if(appartient_element(*e2,e1->element[i]) == 0)
        {
            ajouter_element(e3,e1->element[i]);
        }
    }
    for (i=0;i<e2->cardinal;i++)
    {
        ajouter_element(e3,e2->element[i]);
    }
}

void inter_ensemble (ensemble *e1, ensemble *e2, ensemble *e3)
{
    int i=0;
    for (i=0;i<e1->cardinal;i++)
    {
        if(appartient_element(*e2,e1->element[i]) == 1)
        {
            ajouter_element(e3,e1->element[i]);
        }
    }
}


