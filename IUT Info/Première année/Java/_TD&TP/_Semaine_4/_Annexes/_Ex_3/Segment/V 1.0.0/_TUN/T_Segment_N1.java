//
// IUT de Nice / Departement informatique / Module M2103
// Annee 2013_2014 - Classes de Geom2D
//
// Classe Segment - Tests unitaires des constructeurs
//                  (cas nominaux)
//
//

public class T_Segment_N1
{
   public static void main (String[] args)
   {

      Tests.Begin("Geom2D.Segment", "1.0.0");
         Tests.Design("Controle des constructeurs", 3);
         {
            Tests.Case("Constructeur par defaut");
            {
            	try
            	{
           			Segment s1 = new Segment();
					Tests.Unit("[ (0.0 , 0.0),(1.0 , 0.0) ]",  s1.toString());
            	}
            	catch (Throwable e)
            	{
            		System.out.println(e.getMessage());
            	}

            }

            Tests.Case("Constructeur normal");
            {
            	Point p1= new Point(1, 2);
            	Point p2= new Point(1.5, -2);
            	Point p3= new Point (-1, 2.25);
            	Point p4= new Point (-1, -2);

            	try
            	{
           			Segment s1 = new Segment(p1,p2);
               		Tests.Unit("[ (1.0 , 2.0),(1.5 , -2.0) ]",   s1.toString());
            	}
            	catch (Throwable e)
            	{
            		System.out.println(e.getMessage());
            	}

            	try
            	{
           			Segment s2 = new Segment(p3,p4);
                	Tests.Unit("[ (-1.0 , 2.25),(-1.0 , -2.0) ]",   s2.toString());
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
