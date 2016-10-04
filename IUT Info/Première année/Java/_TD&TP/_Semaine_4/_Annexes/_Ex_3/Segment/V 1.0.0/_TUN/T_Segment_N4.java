//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Segment - Tests unitaires des methodes
// 					longueur, projX et projY
//
//

public class T_Segment_N4
{
   public static void main (String[] args)
   {
      Tests.Begin("Geom2D.Segment", "1.0.0");

         Tests.Design("Controle des methodes longueur, projX et projY", 3);
         {
   			Point p4= new Point(1, 2);
            Point p5= new Point(1.5, -2);
            Point p6= new Point (-1, 2.25);

            Tests.Case("Methode longueur");
            {
            	Point o= new Point();
   				Point p1= new Point(1., 1.);
   				Point p2= new Point(1., -6.25);
   				Point p3= new Point(0., -6.25);

            	try
 				{
 					Segment s1 = new Segment(o,p3);
					Tests.Unit(6.25 ,  s1.longueur());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}

            	try
 				{
 					Segment s1 = new Segment(p1,p2);
					Tests.Unit(7.25 ,  s1.longueur());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}

   				try
 				{
 					Segment s1 = new Segment(p2,p3);
					Tests.Unit(1.0 ,  s1.longueur());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}
            }

   			Tests.Case("Methode projX");
           	{
            	try
 				{
 					Segment s1 = new Segment(p4,p5);
					Tests.Unit("[ (1.0 , 0.0),(1.5 , 0.0) ]",  s1.projX().toString());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}

   				try
 				{
 					Segment s1 = new Segment(p5,p6);
					Tests.Unit("[ (1.5 , 0.0),(-1.0 , 0.0) ]",  s1.projX().toString());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}
            }

            Tests.Case("Methode projY");
           	{
            	try
 				{
 					Segment s1 = new Segment(p4,p5);
					Tests.Unit("[ (0.0 , 2.0),(0.0 , -2.0) ]",  s1.projY().toString());
   				}
   				catch (Throwable e)
   				{
   					System.out.println(e.getMessage());
   				}

   				try
 				{
 					Segment s1 = new Segment(p5,p6);
					Tests.Unit("[ (0.0 , -2.0),(0.0 , 2.25) ]",  s1.projY().toString());
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
