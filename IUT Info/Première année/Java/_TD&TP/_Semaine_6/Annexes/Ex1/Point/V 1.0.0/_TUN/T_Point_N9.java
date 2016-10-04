//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Point - Tests unitaires de la methode confondus
//
//

public class T_Point_N9
{
   public static void main (String[] args)
   {

      Tests.Begin("Geom2D.Point", "1.0.0");
 		Tests.Design("Controle de la methode confondus", 3);
         {
            Tests.Case("methode confondus");
            {
            	Point p1 = new Point(1., 1.);
            	Point p2 = new Point(1.000000001, 1.000000001);
   				Point p3 = new Point(1., 4.5);

   				Tests.Unit(true,  p1.confondus(p1));
    			Tests.Unit(true,  p1.confondus(p2));
    			Tests.Unit(false, p1.confondus(p3));
            }
         }
      Tests.End();
   }
}