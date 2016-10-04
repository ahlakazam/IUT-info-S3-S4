#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

using namespace std;

int main()
{
    pile p;
    creerPile(&p,10);
    int i=0;
    for (i=0;i<20;i++)
    {
        empiler(&p,3*i);
    }
    try {afficherPile(p);}
    catch (int e) {errorCode(e);}
    system("pause");
    system("cls");
    for (i=0;i<4;i++)
    {
        try {depiler(&p);}
        catch (int e) {errorCode(e);}
    }
    try {afficherPile(p);}
    catch (int e) {errorCode(e);}
    return 0;
}
