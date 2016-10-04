#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "prototypes.h"
#include <time.h>

void separateur (int T1[], int T2[], int* nbp, int T3[], int* nbi)
{
    int i=0;
    for (i=0;i<20;i++)
    {
        if ((*(T1+i)%2) == 0)
        {
            printf("nbp : %d\n", *nbp);
            *(T2+*nbp)=*(T1+i);
            (*nbp)++;
        }
        else
        {
            printf("nbi : %d\n", *nbi);
            *(T3+*nbi)=*(T1+i);
            (*nbi)++;
        }

    }
}

void point(point2D* point1)
{
    int x,y;
    char nom;
    printf("Entrez les informations sur le point : \n");
    printf("X: "); scanf("%d", &x); fflush(stdin);
    printf("Y: "); scanf("%d", &y); fflush(stdin);
    printf("Nom: "); scanf("%c", &nom); fflush(stdin);
    point1->x = x;
    point1->y = y;
    point1->nom = nom;
}

void declare_rectangle (rectangle* rec1)
{
    int x,y,longeur,largeur;
    char nom;
    printf("Entrez les informations sur le rectangle : \n");
    printf("X: "); scanf("%d", &x); fflush(stdin);
    printf("Y: "); scanf("%d", &y); fflush(stdin);
    printf("Longeur: "); scanf("%d", &longeur); fflush(stdin);
    printf("Largeur: "); scanf("%d", &largeur); fflush(stdin);
    printf("Nom: "); scanf("%c", &nom); fflush(stdin);
    rec1->largeur = largeur;
    rec1->longeur = longeur;
    rec1->nom =nom;
    rec1->coordonnees.x = x;
    rec1->coordonnees.y = y;
}

void affichePoint (point2D point)
{
    printf("%c (%d,%d)\n", point.nom, point.x, point.y);
}

void afficheRectangle (rectangle rectangle)
{
    int i=0;
    int a=0;
    printf("Affichage d'un rectangle : \n");
    for (i=0;i<rectangle.largeur;i++)
    {
        for (a=0;a<rectangle.longeur;a++)
        {
            printf("*");
        }
        printf("\n");
    }
}

void modifPoint (int x, int y, char nom, point2D* point)
{
    point->x = x;
    point->y = y;
    point->nom = nom;
}

void modifRectangle (int x, int y, char nom, int largeur, int longeur, rectangle* rec1)
{
    rec1->largeur = largeur;
    rec1->longeur = longeur;
    rec1->nom =nom;
    rec1->coordonnees.x = x;
    rec1->coordonnees.y = y;
}

void tableauRectangles(rectangle T[20], int n)
{
    time_t nb_secondes;
    srand (time(&nb_secondes)) ;
    int i=0;
    for (i=0;i<n;i++)
    {
        T[i].longeur = rand ()% 20;
        T[i].largeur = rand ()% 20;
        T[i].coordonnees.x = rand ()% 10;
        T[i].coordonnees.y = rand ()% 10;
    }
}

int surface (rectangle rec1)
{
    return rec1.longeur * rec1.largeur;
}
