package main;

public class Auto extends Vehicule{

	private String model;
	public Auto(int id, float price, int stoke, float distance,String model) {
		super(id, price, stoke, distance);
		// TODO Auto-generated constructor stub
		this.model=model;
	
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auto [model=" + model + ", toString()=" + super.toString() + "]";
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}



}
