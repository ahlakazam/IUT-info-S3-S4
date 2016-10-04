//
// IUT de Nice / Departement informatique / Module APO Java
// Annee 2011_2012 - DUT/S2T
//
// Cours_8 / Exemple 4 - Dupliquer une liste chainee
//
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_4_1 {

   public static void main(String[] args) {

      // Construire une liste source
      //
      LinkedList source= new LinkedList();
      LinkedList copie;

      source.add("bleu");
      source.add("jaune");
      source.add("vert");

      // Dupliquer la liste source
      //
      copie= (LinkedList)source.clone();

      System.out.println ("Source = " + source);
      System.out.println ("Copie = " + copie);

   }
}
