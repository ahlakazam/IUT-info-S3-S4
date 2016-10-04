//
// IUT de Nice / Departement informatique / Module APO Java
// Annee 2011_2012 - DUT/S2T
//
// Cours_8 / Exemple 2 - Parcourir une liste de valeurs reelles
//
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_3 {

   public static float moyenne (final LinkedList notes) {
   float somme= 0.0f;

      Iterator i= notes.iterator();

      //while (i.hasNext()) somme+= ((Float)i.next()).floatValue();
      //while (i.hasNext()) somme+= ((float)i.next());
      while (i.hasNext()) somme+= i.next();

      return somme/notes.size();
   }

   public static void main(String[] args) {

      // Construire une liste de test
      //
      LinkedList notes= new LinkedList();

      notes.add(new Float(17.5f));
      notes.add(new Float(14.0f));
      notes.add(new Float(6));

      System.out.println ("Moyenne= " + moyenne (notes));
   }
}
