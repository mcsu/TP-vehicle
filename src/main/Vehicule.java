package main;

public class Vehicule {


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Numero;
		result = prime * result + Float.floatToIntBits(distance);
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + stoke;
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
		Vehicule other = (Vehicule) obj;
		if (Numero != other.Numero)
			return false;
		if (Float.floatToIntBits(distance) != Float.floatToIntBits(other.distance))
			return false;
		if (marque == null) {
			if (other.marque != null)
				return false;
		} else if (!marque.equals(other.marque))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (stoke != other.stoke)
			return false;
		return true;
	}
	private int Numero;
	private static int id;
	private float price;
	private int stoke;
	private float distance;
	private String marque;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the stoke
	 */
	public int getStoke() {
		return stoke;
	}
	/**
	 * @param stoke the stoke to set
	 */
	public void setStoke(int stoke) {
		this.stoke = stoke;
	}
	/**
	 * @return the distance
	 */
	public float getDistance() {
		return distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(float distance) {
		this.distance = distance;
	}
	/**
	 * @param id
	 * @param price
	 * @param stoke
	 * @param distance
	 */
	public Vehicule(String marque,float price, int stoke, float distance) {
		super();
		Vehicule.id=Vehicule.id+1;
		Numero=id;
		this.marque = marque;
		this.price = price;
		this.stoke = stoke;
		this.distance = distance;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	
}