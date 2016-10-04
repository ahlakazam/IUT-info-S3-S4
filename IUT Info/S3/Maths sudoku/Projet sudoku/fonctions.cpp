#include <iostream>
#include <stdio.h>
#include <stdlib.h>

void remplissage (int i, int a, int grille[][9])
{
    (grille[i][a])++;
    int b=0;
    int c=0;

    for (b=0 ; b<9 ; b++)
    {
        c = grille[i][b];
        while (c == grille[i][a])
        {
            (grille[i][a])++;
        }
    }

    /*for (b=0 ; b<9 ; b++)
    {
       if (grille [b][a] == grille[i][a])
        {
            (grille[i][a])++;

        }
    }*/

}

void creation_grille(int grille[9][9])
{
    int a = 0;
    int i=0;

    for (i=0 ; i<9 ; i++)
    {
        for (a=0 ; a<9 ; a++)
        {
            scanf("%d", &grille[i][a]);
            fflush(stdin);
        }
        system("cls");
    }
}
