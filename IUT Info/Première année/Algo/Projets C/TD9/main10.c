#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "prototypes.h"

int main()
{
    point2D point1;
    rectangle rec1;
    point(&point1);
    affichePoint(point1);
    declare_rectangle(&rec1);
    afficheRectangle(rec1);
    printf("\nAjout de 2 a X et Y : \n");
    modifPoint(point1.x+2, point1.y+2, point1.nom, &point1);
    affichePoint(point1);
    printf("\nAjout de 4 a L et l : \n");
    modifRectangle(rec1.coordonnees.x, rec1.coordonnees.y, rec1.nom, rec1.largeur+4, rec1.longeur+4, &rec1);
    afficheRectangle(rec1);
    return 0;
}
