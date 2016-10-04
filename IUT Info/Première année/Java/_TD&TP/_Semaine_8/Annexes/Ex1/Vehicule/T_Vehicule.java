/**
 * @(#)T_Vehicule.java
 *
 *
 * @author
 * @version 1.00 2016/3/14
 */


public class T_Vehicule
{

   public static void main (String[] args) throws Throwable
   {
        Vehicule v1 = new Velo (17) ;             // nb vitesses
        Vehicule v2 = new Voiture (40.5, 5) ;     // c a p a c i te r e s e r v o i r , nb de p l a c e s
        Vehicule v3 = new Camion (100.0, 100.0) ; // c a p a c i te r e s e r v o i r , volume
        System.out.println("Vehicules : " + "\n" + v1 + "\n" + v2 + "\n" + v3 + "\n");
        ((VAMoteur)v2).approvisionner (35.0) ;    // l i t r e s d ' e s s enc e
        ((VAMoteur)v3).approvisionner(70.0);
        v1.transporter ("Dijon", "Valence") ;
        v2.transporter (5, 300) ;
        v3.transporter ("des tuiles", 1000) ;
        System.out.println("Nombre de véhicules : " + Vehicule.getNextId());

    }
}