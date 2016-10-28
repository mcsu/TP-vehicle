package main;

public class Auto extends Vehicule implements Comparable<Auto>{

	private String model;
	private boolean isLuxe;
	public boolean isLuxe() {
		return isLuxe;
	}
	
	public Auto(String marque,float price, int stoke, float distance,String model,boolean isLuxe) {
		super(marque,price, stoke, distance);
		// TODO Auto-generated constructor stub
		this.model=model;
		this.isLuxe = isLuxe; 
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result="";
		result+=getMarque();
		result+=model;
		if(isLuxe)
			result+="豪华车";
		return result;
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

	public void setLuxe(boolean isLuxe) {
		this.isLuxe = isLuxe;
	}

	public boolean getLuxe(boolean isLuxe) {
		return isLuxe;
	}

	@Override
	public int compareTo(Auto o) {
		if (this.getMarque().equals(o.getMarque()))  
            return 1;  
	 
		else 
			return -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isLuxe ? 1231 : 1237);
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Auto other = (Auto) obj;
		if (isLuxe != other.isLuxe)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	

}
