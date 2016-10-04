//
// IUT de Nice / Departement informatique / Module M213
// Annee 2014_2015 - Extensions Java 5
//
// Classe Exemple_6_1 - Calcul de la moyenne d'un tableau de notes
//                      (nouvelle boucle for et tableaux)
// 
// Auteur : A. Thuaire
//

public class Exemple_6_1 {

   public static float moyenne (float[] notes) {
   float somme=0.0f; 
     
      for (float val : notes) somme += val;

      return somme/notes.length;
   }	

// ---                                                   Methode main
   
   public static void main(String[] args) {
   	
   	  // Creer un tableau de notes
      // 
      float[] notes = new float[4];
      
      notes[0]= 12.5f;
      notes[1]= 8.0f;
      notes[2]= 10.0f;
      notes[3]= 14.f;
        	
      float moyenne= moyenne(notes);
      
      System.out.println("M= " + moyenne);
   }
} 
