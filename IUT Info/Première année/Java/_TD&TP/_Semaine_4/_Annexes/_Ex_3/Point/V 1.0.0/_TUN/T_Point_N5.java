//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Point - Tests unitaires de la methode translation
//
//

public class T_Point_N5
{
   public static void main (String[] args)
   {

      Tests.Begin("Geom2D.Point", "1.0.0");
 		Tests.Design("Controle de la methode translation", 3);
         {

            Tests.Case("methode translation");
          	{
            	Point p0 = new Point();
   				Point p1 = new Point(1., 1.);
   				Point p2 = new Point(1., 4.5);

   				Tests.Unit("(0.0 , 0.0)",  p0.translation(new Vecteur()).toString());
    			Tests.Unit("(1.0 , 1.0)",  p1.translation(new Vecteur()).toString());
    			Tests.Unit("(1.0 , 4.5)",  p2.translation(new Vecteur()).toString());
    			Tests.Unit("(1.0 , 2.0)",  p0.translation(new Vecteur(1.,2.)).toString());
    			Tests.Unit("(2.0 , 3.0)",  p1.translation(new Vecteur(1.,2.)).toString());
    			Tests.Unit("(2.0 , 6.5)",  p2.translation(new Vecteur(1.,2.)).toString());
            }
         }
      Tests.End();
   }
}