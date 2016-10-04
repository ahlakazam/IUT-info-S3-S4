/**
 * @(#)MaClasse.java
 *
 *
 * @author
 * @version 1.00 2013/2/9
 */


class MaClasse
{
	private int val;

	public MaClasse(int x){val=x;}

	public int getVal(){return val;}
	public void setVal(int x){val=x;}

	public void montrer() {System.out.println(val);}

	//public static void f(MaClasse x) {x.setVal(12);}
	public static void g(MaClasse x){x = new MaClasse(12);x.montrer();}

	public static void main(String[] args)
	{
		MaClasse a = new MaClasse(3);
		//a.montrer();
		//f(a);
		//a.montrer();
		a.montrer();
		g(a);
		a.montrer();
	}
}