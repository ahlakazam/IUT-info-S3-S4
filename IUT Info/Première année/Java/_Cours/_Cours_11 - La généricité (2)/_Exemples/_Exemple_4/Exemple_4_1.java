//
// IUT de Nice / Departement informatique / Module M213
// Annee 2014_2015 - Extensions Java 5
//
// Classe Exemple_4_1 - Calcul de la moyenne d'une liste de notes
//                      (SANS usage des generics)
// 
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_4_1 {

   public static float moyenne (LinkedList notes) {
   float somme=0.0f; 
     
      Iterator i= notes.iterator();
      while (i.hasNext()) 
          somme += (Float)i.next(); 

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
