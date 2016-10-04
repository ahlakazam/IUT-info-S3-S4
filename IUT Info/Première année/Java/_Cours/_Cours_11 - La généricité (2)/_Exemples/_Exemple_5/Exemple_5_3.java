//
// IUT de Nice / Departement informatique / Module M213
// Annee 2014_2015 - Extensions Java 5
//
// Classe Exemple_5_3 - Calcul de la moyenne d'un dictionnaire de notes
//                      (AVEC usage des generics et nouvelle boucle for)
// 
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_5_3 {

   public static float moyenne (HashMap<String, Float> notes) {
   float somme=0.0f; 
      
      for (Map.Entry<String, Float> e : notes.entrySet()) {
      	
      	somme += e.getValue();
      } 

      return somme/notes.size();
   }	

// ---                                                   Methode main
   
   public static void main(String[] args) {
   	
   	  // Creer un dictionnaire de notes
      // 
      HashMap<String, Float> notes = new HashMap<String, Float>();
      
      notes.put("TD1", 12.5f);
      notes.put("TD2", 8.f);
      notes.put("DS", 10.0f);
        	
      float moyenne= moyenne(notes);
      
      System.out.println("M= " + moyenne);
   }
} 
