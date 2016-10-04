#ifndef PROTOTYPES_H_INCLUDED
#define PROTOTYPES_H_INCLUDED

typedef struct {
    int taille;
    int sommet;
    float* tab;

}pile;

void creerPile (pile* p, int taille);
void empiler (pile* p, int element);
bool estVide (pile p);
bool estPleine (pile p);
void depiler (pile* p);
void afficherPile (pile p);
void errorCode (int e);

#endif // PROTOTYPES_H_INCLUDED
