//
// IUT de Nice / Departement informatique / Module APO Java
// Annee 2011_2012 - DUT/S2T
//
// Cours_8 / Exemple 4_2 - Dupliquer une liste chainee
//
// Auteur : A. Thuaire
//

import java.util.*;

public class Exemple_4_2 {

   public static void main(String[] args) {

      // Construire une liste source
      //
      LinkedList source= new LinkedList();
      LinkedList copie;
      Ville w1= new Ville("C", 500000);

      source.add(new Ville("A", 200000));
      source.add(new Ville("B", 350000));
      source.add(w1);
      source.add(new Ville("D", 40000));

      // Cloner la liste source
      //
      copie= (LinkedList)source.clone();

      // Modifier l'objet pointe par la variable w1
      //
      w1.setPopulation(600000);
      //source.remove(0);

      // Visualiser la liste source
      //
      System.out.println ("Source= " + source);

      // Visualiser la copie
      //
      System.out.println ("Copie= " + copie);
   }
}
