package main;



import main.ManageVeh;
public class Moto extends Vehicule implements Comparable<Moto>{

	private int cylindre;
	public Moto(String marque,float price, int stoke, float distance,int cylindre) {
		super(marque,price, stoke, distance);
		// TODO Auto-generated constructor stub
		this.cylindre=cylindre;
		this.setType(0);
		
	}

	public int getCylindre() {
		return cylindre;
	}
	/**
	 * @param cylindre the cylindre to set
	 */
	public void setCylindre(int cylindre) {
		this.cylindre = cylindre;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result="";
		result+=getMarque();
		result+="气缸";
		result+=cylindre;
		return result;
	}
	@Override
	public int compareTo(Moto o) {
		// TODO Auto-generated method stub
		 if (this.getCylindre()>o.getCylindre())  
	            return 1;  
		 else if (this.getCylindre()<o.getCylindre())  
	            return -1; 
		 else 
			return 0;
	}

}
