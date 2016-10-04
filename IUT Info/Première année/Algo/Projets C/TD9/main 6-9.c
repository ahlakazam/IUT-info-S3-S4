#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "prototypes.h"

int main()
{
    point2D point1;
    rectangle rec1;
    point(&point1);
    declare_rectangle(&rec1);
    affichePoint(point1);
    afficheRectangle(rec1);
    return 0;
}
