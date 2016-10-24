package main;

public class Safe {
	private String name;
	private float prix;
	private int insuranceAmount;
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
