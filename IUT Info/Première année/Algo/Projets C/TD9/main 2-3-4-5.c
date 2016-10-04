#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "prototypes.h"

int main()
{
    point2D point1;
    rectangle rec1;
    point(3,5, &point1);
    printf("x: %d\ny: %d", point1.x, point1.y);
    declare_rectangle(10,5,'B', &rec1,5,10);
    printf("\nL: %d\nl: %d\nNom: %c\nCoordonnees : %d/%d", rec1.longeur, rec1.largeur, rec1.nom, rec1.coordonnees.x, rec1.coordonnees.y);
    return 0;
}
