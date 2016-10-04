//
// IUT de Nice / Departement informatique / Module APO Java
// Annee 2011_2012 - DUT/S2T
//
// Cours_8 / Exemple 2 - Creer et initialiser une liste chainee
//     
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_2 {
   
   public static void main(String[] args) {
   	
      // Construire une liste de test
      //
      LinkedList notes= new LinkedList();
     
      notes.add(new Integer(17));
      notes.add(new Integer(14));
      notes.add(new Integer(6));
      
      System.out.println ("Notes= " + notes);  
   }
}
