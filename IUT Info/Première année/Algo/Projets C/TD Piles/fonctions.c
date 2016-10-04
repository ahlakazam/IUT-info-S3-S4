#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include"prototypes.h"
#include "Tests_Unit.h"

int appartient_element (ensemble e, int valeur)
{
    if (e.cardinal != -1)
    {
        int i=0;
        for (i=0;i<e.cardinal+1;i++)
        {
            if (e.element[i] == valeur)
                return 1;
        }
    }
    return 0;
}

int get_cardinal (ensemble e)
{
    return e.cardinal;
}

int is_void (ensemble e)
{
    if (get_cardinal(e) == 0)
        return 1;
    else
        return 0;
}
