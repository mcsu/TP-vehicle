package main;

public class Safe {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + insuranceAmount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(prix);
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
		Safe other = (Safe) obj;
		if (insuranceAmount != other.insuranceAmount)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(prix) != Float.floatToIntBits(other.prix))
			return false;
		return true;
	}
	private String name;
	private float prix;
	private int insuranceAmount;//assurance
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getInsuranceAmount() {
		return insuranceAmount;
	}
	public void setInsuranceAmount(int insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	public Safe(String name, float prix, int insuranceAmount) {
		super();
		this.name = name;
		this.prix = prix;
		this.insuranceAmount = insuranceAmount;
	}
	@Override
	public String toString() {
		String result="";
		result+="保险信息";
		result+="险种";
		result+=name;
		result+="价格";
		result+=prix;
		result+="保额";
		result+=insuranceAmount;
		result+="%";
		return result;
	}

	
}
