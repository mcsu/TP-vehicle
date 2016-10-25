package main;

public class Vehicule {


	private int Numero;
	private static int id;
	private float price;
	private int stoke;
	private float distance;
	private String marque;
	private int type;
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
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	
	
}