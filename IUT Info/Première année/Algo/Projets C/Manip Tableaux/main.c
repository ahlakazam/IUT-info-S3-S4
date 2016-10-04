#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

int main()
{
    int T[10]={5,9,21,6,7,2,98,2,9,2};
    int taille = 10;
    triSelection(T,taille); afficheTableau(T,taille);printf("\n\n");
    inserElem(T,&taille,29); printf("\n");
    afficheTableau(T,taille);
    return 0;
}
