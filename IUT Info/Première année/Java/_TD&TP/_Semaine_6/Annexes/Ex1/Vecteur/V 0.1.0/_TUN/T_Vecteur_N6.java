//
// IUT de Nice / Departement informatique / Module APO Java
// Annee 2014_2015 - Classes de Geometrie_2D
//
// Classe Vecteur - Tests unitaires des methodes memeSens et produitScalaire 
//                  (cas nominaux)
//
// Auteur : A. Thuaire
//

public class T_Vecteur_N6 {

   public static void main (String[] args) {

      Tests.Begin("_Maths.Vecteur", "0.1.0");

         Tests.Design("Controle des methodes memeSens et produitScalaire", 3); {

            Tests.Case("Methode memeSens"); {
            Vecteur v0= new Vecteur();
            Vecteur v1= new Vecteur (1, 2);
            Vecteur v2= new Vecteur (-2, -4);
            Vecteur v3= new Vecteur (-1, 1);
            Vecteur v4= new Vecteur (1, 1);
            Vecteur v5= new Vecteur (2.75, 2.75);
            
               Tests.Unit(true,  v0.memeSens(v1));
               Tests.Unit(false, v1.memeSens(v2));
               Tests.Unit(false, v3.memeSens(v4));
               Tests.Unit(true,  v4.memeSens(v5));
            }
            
            Tests.Case("Methode produitScalaire"); {
            Vecteur v0= new Vecteur();
            Vecteur v1= new Vecteur (1, 2);
            Vecteur v2= new Vecteur (1, 2);
            Vecteur v3= new Vecteur (-1, 2.25);
            Vecteur v4= new Vecteur (-1, -2);
            
               Tests.Unit(0,    v0.produitScalaire(v1));
               Tests.Unit(5,    v1.produitScalaire(v2));
               Tests.Unit(-3.5, v3.produitScalaire(v4));
            }
         }

      Tests.End();       
   }
}
