//
// IUT de Nice / Departement informatique / Module M213
// Annee 2014_2015 - Extensions Java 5
//
// Classe Exemple_4_3 - Calcul de la moyenne d'une liste de notes
//                      (AVEC usage des generics et nouvelle boucle for)
// 
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_4_3 {

   public static float moyenne (LinkedList<Float> notes) {
   float somme=0.0f; 
     
      for (float val : notes) somme += val;

      return somme/notes.size();
   }	

// ---                                                   Methode main
   
   public static void main(String[] args) {
   	
   	  // Creer une liste des notes
      // 
      LinkedList notes = new LinkedList();
      
      notes.add(12.5f);
      notes.add(8.f);
      notes.add(10.0f);
      notes.add(14.f);
        	
      float moyenne= moyenne(notes);
      
      System.out.println("M= " + moyenne);
   }
} 
