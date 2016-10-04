//
// IUT de Nice / Departement informatique / Module M213
// Annee 2014_2015 - Extensions Java 5
//
// Classe Exemple_5_1 - Calcul de la moyenne d'un dictionnaire de notes
//                      (SANS usage des generics)
// 
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_5_1 {

   public static float moyenne (HashMap notes) {
   float somme=0.0f; 
     
      Iterator i= notes.keySet().iterator();
      String epreuve= null;
      Object note= null;
      
      while (i.hasNext()) {
       
         epreuve= (String) i.next();
         note= notes.get(epreuve); 
         
         somme += ((Float) note).floatValue();
      } 

      return somme/notes.size();
   }	

// ---                                                   Methode main
   
   public static void main(String[] args) {
   	
   	  // Creer un dictionnaire de notes
      // 
      HashMap notes = new HashMap();
      
      notes.put("TD1", 12.5f);
      notes.put("TD2", 8.f);
      notes.put("DS", 10.0f);
        	
      float moyenne= moyenne(notes);
      
      System.out.println("M= " + moyenne);
   }
} 
