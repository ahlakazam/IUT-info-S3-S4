#include <iostream>
#include <stdlib.h>
#include <malloc.h>
#include"prototypes.h"

using namespace std;

bool estVide (pile p)
{
    return (p.sommet == 0);
}

bool estPleine (pile p)
{
    return (p.sommet == p.taille-1);
}
