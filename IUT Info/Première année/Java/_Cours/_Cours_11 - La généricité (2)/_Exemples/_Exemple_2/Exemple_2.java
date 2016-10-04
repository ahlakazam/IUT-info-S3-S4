//
// IUT de Nice / Departement informatique / Module M213
// Annee 2014_2015 - Extensions Java 5
//
// Classe Exemple_2 - Methodes à nombre variable de parametres
// 
// Auteur : A. Thuaire
//

public class Exemple_2 {

// ---                                                Methode moyenne

   public static float moyenne (int ... notes) {
   float resultat= 0.0f; 
   
      for (int i=0; i < notes.length ; i++) resultat += notes[i];  
      return resultat / notes.length;
   }
   
// ---                                                   Methode main
   
   public static void main(String[] args) {
   	
   	  System.out.println ("M1= " + moyenne (12, 8, 13));
   	  System.out.println ("M2= " + moyenne (12, 8, 13, 10, 17));
   }
} 
