/**
 * @(#)Chien.java
 *
 *
 * @author chloé coupigny--warot
 * @version 1.00 2016/4/15
 */

import java.util.Calendar;

public class Chien {

	/**
	 * Déclaration des attribut
	 **/
	private String name;
	private String race;
	private Character sexe;
	private int[] dateNaiss;
	private Categorie categorie;


	/**
	 * Constructeur par défaut
	 **/
    public Chien() {
    	name = "Indeterminé" ;
    	race ="Indeterminé" ;
    	sexe ='I' ;
    	categorie = Categorie.ATTAQUE;
	}


	/**
	* Constructeur normal
	**/
	public Chien(String name, String race, Character sexe, int day, int month, int year, Categorie c) throws Throwable {
	 // verification de la validité des paramètre
		if (name == null||name.isEmpty())throw new Throwable ("name indeterminé");
	    if (race == null||race.isEmpty())throw new Throwable ("race indeterminé");
	    if (!(sexe == 'M' || sexe== 'F'))throw new Throwable ("sexe incorrect");
	    if (!(day >=1 && day <=31))throw new Throwable ("day incorrect");
	    if (!(month >=1 && month <=12))throw new Throwable ("month incorrect");
	    if (year <=1990)throw new Throwable ("year incorrect");

	 	// initialisation des attributs
	 	this.name = name;
	 	this.race = race;
	  	this.sexe = sexe;
	  	dateNaiss = new int[3];
	  	dateNaiss[0] = day;
	  	dateNaiss[1] = month;
	  	dateNaiss[2] = year;
	  	categorie = c;
	}


	/**
	* Accesseur
	**/
	 public String getName(){return name;}
	 public String getRace(){return race;}
	 public Character getSexe(){return sexe;}
	 public int getDay(){return dateNaiss[0];}
	 public int getMonth(){return  dateNaiss[1];}
	 public int getYear(){return  dateNaiss[2];}

	 public void setNom(String name)throws Throwable{
		if (name == null || name.isEmpty()) throw new Throwable ("name indeterminé");
	   	this.name = name;
	 }
	 public void setRace(String race)throws Throwable{
		if (race == null || race.isEmpty()) throw new Throwable ("race indeterminé");
	   	this.race = race;
	 }
	 public void setSexe (Character sexe) throws Throwable{
	 	if (!(sexe == 'M' || sexe== 'F')) throw new Throwable ("sexe incorrect");
	 	this.sexe = sexe;
	 }


	 /**
     * Methode toString
     **/
     public String toString(){
     	if (dateNaiss == null){ return this.getClass().getName() + " : " + name + ", " + race + ", " + sexe;}
     	else {
     		int day = dateNaiss[0];
     		int month = dateNaiss[1];
     		int year = dateNaiss[2];
     		String date = Chien.toStringDate(day, month, year);
     		return this.getClass().getName() + " : " + name + ", " + race + ", " + sexe +", "+date +", " + getAge()+" jours";
     	}
	}


    /**
    * Méthode toStringDate
    **/
    public static String toStringDate(int j, int m, int y){
    	return String.format("%1$02d/%2$02d/%3$04d", j, m, y);
    }

    /**
     * Méthode calcul age en jour
     */
	public long getAge(){
		Calendar cn = Calendar.getInstance();
		cn.set(dateNaiss[2],(dateNaiss[1]-1),dateNaiss[0]);
		long t1 = cn.getTimeInMillis();

		Calendar cj = Calendar.getInstance();
		long t2 = cj.getTimeInMillis();

		return (t2-t1)/ (24*60*60*1000);
	}



	/**
	 * Méthode clone
	 **/
	public Object clone(){
		if (dateNaiss == null){
			return new Chien();
		}
		else {
			Chien c = null;
			try{
				c = new Chien(this.name, this.race, this.sexe, this.getDay(), this.getMonth(), this.getYear());
			}
			catch (Throwable t){}
			return c;
		}
	}


	/**
	 * Méthode equals
	 **/
	public boolean equals(Object o){

		if (o == null){return false;}
		if (!(o instanceof Chien)){return false;}

		Chien c = (Chien) o;
		if (!(this.name.equals(c.name))){return false;}
		if (!(this.race.equals(c.race))){return false;}
		if (!(this.sexe.equals(c.sexe))){return false;}
		if (this.dateNaiss == null){
			if (c.dateNaiss == null){return true;}
			else{return false;}
		}
		else {
			if (!(this.dateNaiss[0]==(c.dateNaiss[0]))){return false;}
			if (!(this.dateNaiss[1]==(c.dateNaiss[1]))){return false;}
			if (!(this.dateNaiss[2]==(c.dateNaiss[2]))){return false;}

		}

		return true;
	}

	/**
	 *
	 **/
	public boolean accoupler(Chien c){
		if (c == null){return false;}
		if (this.dateNaiss == null || c.dateNaiss == null){return false;}
		if (!(c.race.equals(this.race))){ return false ; }
		if (c.sexe.equals(this.sexe)){return false ; }

		return true;
	}

	public enum Categorie{
		ATTAQUE, DEFENSE, COMPAGNIE, SECOURS, INDETERMINE
	}






	/**
	*
	**/
    public static void main (String[] args){
		Chien cDefault = new Chien();
     	System.out.println("cDefault : "+cDefault.toString());


     	try{
     		Chien cNormal = new Chien("DogName","DogType", 'M',14,3,2016,Categorie.ATTAQUE);
     	 	System.out.println("cNormal : "+cNormal.toString());
     	 	//cNormal.setNom("blabla");
     	 	//System.out.println("cNormal : "+cNormal.toString());
     	 	//System.out.println(cNormal.getAge());
     	 	Chien cClone = (Chien) cNormal.clone();
     	 	System.out.println("cClone : " +cClone.toString());

     	 	Chien cAccoupler =  new Chien("DogName","DogType", 'F',14,3,2016);

     	 	Chien cEquals = new Chien ("name","type",'M', 14,3,2016);
     	 	System.out.println("equals cnormal and cClone : "+cNormal.equals(cClone));
     	 	System.out.println("equals cnormal and cEquals : "+cNormal.equals(cEquals));
     	 	System.out.println("equals cnormal and cDefault : "+cNormal.equals(cDefault));
     	 	System.out.println("accoupler cnormal and cClone : "+cNormal.accoupler(cClone));
     	 	System.out.println("accoupler cnormal and cAccoupler : "+cNormal.accoupler(cAccoupler));
     	 	System.out.println("accoupler cnormal and cDefault : "+cNormal.accoupler(cDefault));
     	 	System.out.println("accoupler cDefault and cDefault : "+cDefault.accoupler(cDefault));
     	 }
     	 catch(Throwable t) {System.out.println(t.getMessage());}




     	 /*Calendar rightNow = Calendar.getInstance();
     	 int j = rightNow.get(Calendar.DAY_OF_MONTH);
     	 int m = rightNow.get(Calendar.MONTH)+1;
     	 int y = rightNow.get(Calendar.YEAR);
     	 System.out.println(Chien.toStringDate(j, m ,y));*/
     }



}