package main;

public class Moto extends Véhicule{

	private int cylindre;
	public Moto(int id, float price, int stoke, float distance,int cylindre) {
		super(id, price, stoke, distance);
		// TODO Auto-generated constructor stub
		this.cylindre=cylindre;
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

}
