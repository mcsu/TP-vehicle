package main;

public class Véhicule {

	int id;
	float price;
	int stoke;
	float distance;
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
	public Véhicule(int id, float price, int stoke, float distance) {
		super();
		this.id = id;
		this.price = price;
		this.stoke = stoke;
		this.distance = distance;
	}
	
	
}
