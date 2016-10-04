//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Point - Tests unitaires de la methode homothetie
//
//

public class T_Point_N7
{
   public static void main (String[] args)
   {

      Tests.Begin("Geom2D.Point", "1.0.0");
 		Tests.Design("Controle de la methode homothetie", 3);
         {

            Tests.Case("methode homothetie");
          	{
            	Point p0 = new Point();
   				Point p1 = new Point(1., 1.);
   				Point p2 = new Point(1., 4.5);

   				Tests.Unit("(0.0 , 0.0)",  p0.homothetie(0.5).toString());
    			Tests.Unit("(0.5 , 0.5)",  p1.homothetie(0.5).toString());
    			Tests.Unit("(0.5 , 2.25)",  p2.homothetie(0.5).toString());

    			Tests.Unit("(0.0 , 0.0)",  p0.homothetie(p0,0.5).toString());
    			Tests.Unit("(0.5 , 0.5)",  p1.homothetie(p0,0.5).toString());
    			Tests.Unit("(0.5 , 2.25)",  p2.homothetie(p0,0.5).toString());
   				Tests.Unit("(-1.0 , -1.0)",  p0.homothetie(p1,2.).toString());
    			Tests.Unit("(1.0 , 1.0)",  p1.homothetie(p1,2.).toString());
    			Tests.Unit("(1.0 , 8.0)",  p2.homothetie(p1,2.).toString());
            }
         }
      Tests.End();
   }
}