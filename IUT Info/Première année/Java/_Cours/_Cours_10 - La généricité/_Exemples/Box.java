
public class Box
{
	private Object object;
	public void add(Object object)
	{
		this.object = object;
	}
	public Object get(){return object;}

	public static void main(String[] args)
	{

		// ONLY place Integer objects into this box!
		Box integerBox = new Box();
		integerBox.add(new Integer(10));
		Integer someInteger = (Integer)integerBox.get();
		System.out.println(someInteger);

		// ONLY place Integer objects into this box!
		Box ib = new Box();
		// Imagine this is one part of a large application
		// modified by one programmer.
		ib.add("10"); // note how the type is now String
		// ... and this is another, perhaps written
		// by a different programmer
		//Integer i = (Integer)ib.get();
		//System.out.println(i);

	}
}


/*
public class Box<T>
{
	private T t;
	public void add(T t) {this.t = t;}
	public T get() {return t;}
	public static <T extends Comparable<T>> T Min(T x, T y) { if (x.compareTo(y)<=0) return x; else return y; }
	public static <T extends Comparable<T>> T Min(T x, T y, T z) { return Min(x, Min(y,z)); }

	public <U> void inspect(U u)
	{
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}

	public static void main(String[] args)
	{
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.add(new Integer(10));
		integerBox.inspect("some text");
		System.out.println(Min(2, -13));
		System.out.println(Min("toto", "albert", "zoe"));
		//System.out.println(Min(2, "toto"));
	}
}
*/

/*
public class Box <T, S>
{
	private T valeur1;
	private S valeur2;

	public Box()
	{
		valeur1 = null;
		valeur2 = null;
    }

    public Box(T val1, S val2)
    {
        valeur1 = val1;
        valeur2 = val2;
    }

    public T getValeur1() {return valeur1;}
    public S getValeur2() {return valeur2;}
    public void setValeur1 (T nouv) {valeur1 = nouv;}

	public static void main(String[] args)
	{

		Box<String, String> b1 = new Box<String, String>("toto", "titi");
        System.out.println("Valeur de l'objet b1 : val1 = " + b1.getValeur1() + ", val2 = " + b1.getValeur2());

		Box<String, Boolean> b2 = new Box<String, Boolean>("toto", true);
        System.out.println("Valeur de l'objet b2 : val1 = " + b2.getValeur1() + ", val2 = " + b2.getValeur2());

        Box<?, ?> b3 = new Box<Integer, String>(12, "abc");
        System.out.println("Valeur de l'objet b3 : val1 = " + b3.getValeur1() + ", val2 = " + b3.getValeur2());
        b3 = new Box<Double, Character>(12.7, 'a');
        System.out.println("Valeur de l'objet b3 : val1 = " + b3.getValeur1() + ", val2 = " + b3.getValeur2());

        //b3.setValeur1(35);
        //System.out.println("Valeur de l'objet b3 : val1 = " + b3.getValeur1() + ", val2 = " + b3.getValeur2());

    }
}

*/





