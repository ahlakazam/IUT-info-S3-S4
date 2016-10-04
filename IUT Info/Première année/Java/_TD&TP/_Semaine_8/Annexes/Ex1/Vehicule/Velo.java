public class Velo extends VSansMoteur
{
    private int nbVitesses;
    public Velo(int nbV)throws Throwable
    {
    	super();
        if (nbV <= 0) throw new Throwable();
        nbVitesses = nbV;
    }
    public String toString() { return super.toString() + " nbVitesses = " + nbVitesses; }
    public void transporter(Object depart, Object arrivee)
    {
    	//if (depart == null)
    	// if ((String)depart.length == 0)
        System.out.println("le vélo n° " + getId() + " a roulé de " + depart + " à " + arrivee);
    }
}
