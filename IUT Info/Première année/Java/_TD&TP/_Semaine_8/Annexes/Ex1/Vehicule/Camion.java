public class Camion extends VAMoteur
{
    private double volume;
    public Camion(double c, double v) throws Throwable
    {
    	super(c);
        if (v <= 0) throw new Throwable();
        volume = v;
    }
    public String toString() { return super.toString() + " volume = " + volume; }
    public void transporter(Object materiau, Object km)
    {
        if (!enPanne())
        {
        	setDistance(getDistance() + (int)km);
        	System.out.println("le camion n° " + getId() + " a transporté " + (String) materiau + " sur " + km + " km(s)");
        }
        else System.out.println("plus d'essence !");
    }
}
