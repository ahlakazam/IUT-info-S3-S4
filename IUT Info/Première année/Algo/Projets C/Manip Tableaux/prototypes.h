#ifndef PROTOTYPES_H_INCLUDED
#define PROTOTYPES_H_INCLUDED

int estTriecroissant (int T[], int n);
int estTriedecroissant (int T[], int n);
int recherche (int T[], int n, int recherche);
int rechercheDicho (int T[], int n, int recherche);
int maxTab (int T[], int taille);
void triSelection (int T[], int taille);
void afficheTableau (int T[], int taille);
void triBulle (int T[], int taille);
void suppElementPos (int T[], int *taille, int pos);
void suppElem (int T[], int *taille, int cible);
void inserElemPos (int T[], int *taille, int indice, int element);
void inserElem (int T[],int *taille, int element);


#endif // PROTOTYPES_H_INCLUDED
