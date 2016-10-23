package main;

import main.ManageVeh;
public class Moto extends Vehicule implements Comparable<Moto>{

	private int cylindre;
	public Moto(String marque,float price, int stoke, float distance,int cylindre) {
		super(marque,price, stoke, distance);
		// TODO Auto-generated constructor stub
		this.cylindre=cylindre;
		ManageVeh.ts.add(this);
	}
	/**
	 * @return the ml
	 */
	public int getCylindre() {
		return cylindre;
	}
	/**
	 * @param cylindre the cylindre to set
	 */
	public void setMl(int cylindre) {
		this.cylindre = cylindre;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auto [cylindre=" + cylindre + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int compareTo(Moto o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
