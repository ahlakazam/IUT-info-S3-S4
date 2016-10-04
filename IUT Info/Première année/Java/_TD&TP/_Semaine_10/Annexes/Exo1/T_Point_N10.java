//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Point - Tests unitaires de la sérialisation
//
//


public class T_Point_N10
{
   public static void main (String[] args) throws Throwable
   {

      Tests.Begin("Geom2D.Point", "1.0.0");
         Tests.Design("Controle de la sérialisation", 3);
         {
            Tests.Case("Save");
            {
            	Point p0= new Point();
            	Point p1= new Point(1, 2);
            	Serialisation.save("p0.data", p0);
            	Serialisation.save("p1.data", p1);
            }

            Tests.Case("Load");
            {
            	Point p00 = (Point) Serialisation.load("p0.data");
				Tests.Unit("(0.0 , 0.0)",  p00.toString());
            	Point p11 = (Point) Serialisation.load("p1.data");
				Tests.Unit("(1.0 , 2.0)",  p11.toString());
            }
         }
      Tests.End();
   }
}