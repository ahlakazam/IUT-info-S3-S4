public abstract class VAMoteur extends Vehicule implements IApprovisionner
{
    private double capacite;
    private double niveau;

    public VAMoteur(double c) throws Throwable
    {
    	super();
        if (c <= 0) throw new Throwable();
        capacite = c;
        niveau = 0;
    }
    public String toString() { return super.toString() + " capacite = " + capacite + " niveau = " + niveau; }

    public void approvisionner(double nbLitres) throws Throwable
    {
        if (nbLitres <= 0) throw new Throwable();
        if (capacite - niveau < nbLitres) throw new Throwable();
        niveau += nbLitres;
    }
    public boolean enPanne() { return niveau == 0; }

}
