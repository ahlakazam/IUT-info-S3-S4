//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Point - Tests unitaires des accesseurs de consultation
//
//

public class T_Point_N3
{
   public static void main (String[] args)
   {

      Tests.Begin("Geom2D.Point", "1.0.0");
 		Tests.Design("Controle des accesseurs de consultation", 3);
         {
            Tests.Case("methode getAbscisse");
            {
            	Point p1= new Point(1.5, 3.5);
            	Point p2= new Point(0.5, 2.);
            	Point p3= new Point(-3., 4.);
            	Point p4= new Point(5., 1.2);
            	Point p5= new Point(3.6, 2.3);

				Tests.Unit(1.5,  p1.getAbscisse());
				Tests.Unit(0.5,  p2.getAbscisse());
				Tests.Unit(-3.0,  p3.getAbscisse());
				Tests.Unit(5.0,  p4.getAbscisse());
				Tests.Unit(3.6,  p5.getAbscisse());
            }

            Tests.Case("methode getOrdonnee");
            {
                Point p1= new Point(1.5, 3.5);
            	Point p2= new Point(0.5, 2.);
            	Point p3= new Point(-3., 4.);
            	Point p4= new Point(5., 1.2);
            	Point p5= new Point(3.6, 2.3);

                Tests.Unit(3.5,  p1.getOrdonnee());
				Tests.Unit(2.0,  p2.getOrdonnee());
				Tests.Unit(4.0,  p3.getOrdonnee());
				Tests.Unit(1.2,  p4.getOrdonnee());
				Tests.Unit(2.3,  p5.getOrdonnee());
            }
         }
      Tests.End();
   }
}