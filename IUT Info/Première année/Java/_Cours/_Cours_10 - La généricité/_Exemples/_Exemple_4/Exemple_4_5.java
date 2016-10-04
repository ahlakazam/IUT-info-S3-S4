//
// IUT de Nice / Departement informatique / Module APO-Java
// Annee 2011_2012 - Extensions Java 5
//
// Classe Exemple_4_5 - Calcul de la moyenne d'un tableau de notes
//                      (AVEC usage des generics et nouvelle boucle for)
// 
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_4_5 {

   public static float moyenne ([]<Float> notes) {
   float somme=0.0f; 
     
      for (float val : notes) somme += val;

      return somme/notes.size();
   }	

// ---                                                   Methode main
   
   public static void main(String[] args) {
   	
   	  // Creer un tableau de notes
      // 
      float[] notes = new float[4];
      
      notes[0]= 12.5f;
      notes[1]=  8.f;
      notes[2]= 10.0f;
      notes[3]= 14.f;
        	
      float moyenne= moyenne(notes);
      
      System.out.println("M= " + moyenne);
   }
} 
