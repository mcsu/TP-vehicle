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
		this.setType(1);
		if(this.isLuxe)
			this.setType(2);
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
		Auto other = (Auto) o;  
		  
        // 先按照name属性排序  
//        if (this.isLuxe)  
//            return 1;  
//        if (!this.isLuxe)  
//            return -1; 
////        else
//        	return 0;  
		if (this.getMarque().length()>o.getMarque().length())  
            return 1;  
	 else if (this.getMarque().length()<o.getMarque().length())
            return -1; 
	 else 
		return 1;
	}

}
