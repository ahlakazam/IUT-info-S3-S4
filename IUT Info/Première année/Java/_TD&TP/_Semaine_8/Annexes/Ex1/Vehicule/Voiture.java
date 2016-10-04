public class Voiture extends VAMoteur
{
    private int nbPlaces;
    public Voiture(double c, int nbP) throws Throwable
    {
    	super(c);
        if (nbP <= 0) throw new Throwable();
        nbPlaces = nbP;
    }
    public String toString() { return super.toString() + " nbPlaces = " + nbPlaces; }
    public void transporter(Object n, Object km)
    {
        if (!enPanne())
        {
        	setDistance(getDistance() + (int)km);
        	System.out.println("la voiture n° " + getId() + " a transporté " + (int) n + " personne(s) sur " + km + " km(s)");
        }
        else System.out.println("plus d'essence !");
    }
}
