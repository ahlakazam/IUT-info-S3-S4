#ifndef PROTOTYPES_H_INCLUDED
#define PROTOTYPES_H_INCLUDED

void separateur (int T1[], int T2[], int* nbp, int T3[], int* nbi);
typedef struct point2D
{
    int x;
    int y;
    char nom;
}point2D;

typedef struct rectangle
{
    int longeur;
    int largeur;
    char nom;
    point2D coordonnees;
}rectangle;
void point(point2D* point1);
void declare_rectangle (rectangle* rec1);
void affichePoint (point2D point);
void afficheRectangle (rectangle rectangle);
void modifPoint (int x, int y, char nom, point2D* point);
void modifRectangle (int x, int y, char nom, int largeur, int longeur, rectangle* rec1);
void tableauRectangles(rectangle T[20], int n);
#endif // PROTOTYPES_H_INCLUDED
