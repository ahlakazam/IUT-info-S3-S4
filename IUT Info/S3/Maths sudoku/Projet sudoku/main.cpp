#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include "prototypes.h"

using namespace std;

int main()
{
    int grille[9][9] = {{0,6,8,1,9,0,5,2,3}, {5,3,1,8,0,6,9,7,4}, {9,2,4,7,5,3,8,6,1}, {2,4,5,0,7,1,3,8,6}, {3,0,6,2,4,8,1,0,9}, {1,0,9,6,0,5,7,4,2}, {8,9,3,5,0,2,4,1,0}, {6,0,7,4,1,9,0,3,8}, {4,0,2,3,8,7,6,9,5}};
    int i=0;
    int a=0;

    creation_grille(grille);

    for (i=0 ; i<9 ; i++)
    {
        for (a=0 ; a<9 ; a++)
        {
            if (grille[i][a] == 0)
            {
               remplissage(i,a,grille);
            }
        }
    }

    for (i=0 ; i<9 ; i++)
    {
        for (a=0 ; a<9 ; a++)
        {
            printf("%d", grille[i][a]);
        }
        printf("\n");
    }


    return 0;
}
