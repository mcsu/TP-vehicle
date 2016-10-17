package main;

public class Moto extends Véhicule{

	private int ml;
	public Moto(int id, float price, int stoke, float distance,int ml) {
		super(id, price, stoke, distance);
		// TODO Auto-generated constructor stub
		this.ml=ml;
	}
	/**
	 * @return the ml
	 */
	public int getMl() {
		return ml;
	}
	/**
	 * @param ml the ml to set
	 */
	public void setMl(int ml) {
		this.ml = ml;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auto [ml=" + ml + ", toString()=" + super.toString() + "]";
	}

}
