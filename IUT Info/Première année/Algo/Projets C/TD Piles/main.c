#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include "Tests_Unit.h"
#include"prototypes.h"

int main()
{
    int i=0;
    ensemble e1,e2,e_union;
    construire_element(&e1); construire_element(&e2); construire_element(&e_union);
    for (i=0;i<10;i++)
    {
        ajouter_element(&e1,i);
    }
    for (i=5;i<15;i++)
    {
        ajouter_element(&e2,i);
    }
    union_ensemble(&e1,&e2,&e_union);
    for(i=0;i<e_union.cardinal;i++)
    {
        printf("%d, %d\n", e_union.element[i],i);
    }
    inter_ensemble(&e1,&e2,&e_union);
    for(i=0;i<e_union.cardinal;i++)
    {
        printf("%d, %d\n", e_union.element[i],i);
    }
    return 0;
}
