package main;

import org.omg.CORBA.StringHolder;

import main.Flotte;
public class Moto extends Vehicule implements Comparable<Moto>{

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cylindre;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moto other = (Moto) obj;
		if (cylindre != other.cylindre)
			return false;
		return true;
	}
	private int cylindre;
	public Moto(String marque,float price, int stoke, float distance,int cylindre) {
		super(marque,price, stoke, distance);
		// TODO Auto-generated constructor stub
		this.cylindre=cylindre;
		
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
