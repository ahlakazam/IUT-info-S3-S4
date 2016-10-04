//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Segment - Tests unitaires de la methode
// 					translation
//
//

public class T_Segment_N5
{
   public static void main (String[] args)
   {
      Tests.Begin("Geom2D.Segment", "1.0.0");

         Tests.Design("Controle de la methode translation", 3);
         {
            Tests.Case("Methode translation");
            {
            	Point o= new Point();
   				Point p1= new Point(1., 1.);
   				Point p2= new Point(1., 4.5);
   				Point p3= new Point(-1, -2);
            	Point p4= new Point(1.5, -2);
            	Point p5= new Point (-1, 2.25);

            	Vecteur v1 = new Vecteur (1.,1.);
            	Vecteur v2 = new Vecteur (-2.,1.);
            	Vecteur v3 = new Vecteur (-4.,-3.);
            	Vecteur v4 = new Vecteur (0.,0.);

 				try
 				{
 					Segment s = new Segment(o,p3);
     				Tests.Unit("[ (1.0 , 1.0),(0.0 , -1.0) ]",  s.translation(v1).toString());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}

 				try
 				{
 					Segment s = new Segment(p1,p2);
     				Tests.Unit("[ (-1.0 , 2.0),(-1.0 , 5.5) ]",  s.translation(v2).toString());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}

 				try
 				{
 					Segment s = new Segment(p4,p5);
     				Tests.Unit("[ (-2.5 , -5.0),(-5.0 , -0.75) ]",  s.translation(v3).toString());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}

   				try
 				{
 					Segment s = new Segment(p4,p5);
     				Tests.Unit("[ (1.5 , -2.0),(-1.0 , 2.25) ]",  s.translation(v4).toString());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}
            }
         }
      Tests.End();
   }
}
