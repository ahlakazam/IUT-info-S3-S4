
public abstract class Vehicule implements ITransporter
{
    private static int nextId = 0;
    private int id;
    private int distance;

    public int getId() { return id; }
    public int getDistance() { return distance; }
    public void setDistance(int d){ distance = d; }
    public Vehicule()
    {
        id = nextId;
        nextId++;
        distance = 0;
    }
    public String toString() { return "id = " + id + " distance = " + distance; }
    public void rouler(int n) throws Throwable
    {
        if (n <= 0) throw new Throwable();
        distance += n;
    }
    public abstract void transporter(Object o1, Object o2);

    public static int getNextId(){ return nextId+1;    }
}