package main;

import java.util.Set;


public class Exemplaire implements Comparable<Exemplaire>{
	private boolean accident;
	private int kilometres;
	private Vehicule vehicule;
	private int id;
	private static int Numero;
	public int getKilometres() {
		return kilometres;
	}
	public boolean isAccident() {
		return accident;
	}
   
	public void setAccident(boolean accident) {
		this.accident = accident;
	}



	public void setKilometres(int kilometres) {
		this.kilometres = kilometres;
	}



	public Vehicule getVehicule() {
		return vehicule;
	}
	public Auto getAuto() {
		return (Auto) vehicule;
	}
	public Moto getMoto() {
		return  (Moto) vehicule;
	}



	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}


	
	
	public Exemplaire(Vehicule vehicule){
		Exemplaire.Numero=Exemplaire.Numero+1;
		id=Numero;
		this.vehicule=vehicule;
	}
	public Exemplaire(Auto vehicule){
		Exemplaire.Numero=Exemplaire.Numero+1;
		id=Numero;
		this.vehicule=vehicule;
	}
	public Exemplaire(Moto vehicule){
		Exemplaire.Numero=Exemplaire.Numero+1;
		id=Numero;
		this.vehicule=vehicule;
	}

	
	
	@Override
	public String toString() {//TODO StringBuilder
		String result = "编号" ;
		result+=id;
		result+="车辆信息";
		result+="\n";
		result+=vehicule;
		result+="\n";
		return result;
//		StringBuilder stringBuilder = null;
//		stringBuilder.append("订单信息");
//		stringBuilder.append("\n");
//		stringBuilder.append("租车人");
//		stringBuilder.append("\n");
//		stringBuilder.append(emprunteur);
//		stringBuilder.append("\n");
//		stringBuilder.append("车辆信息");
//		stringBuilder.append("\n");
//		stringBuilder.append(vehicule);
//		stringBuilder.append("\n");
//		return stringBuilder.toString();
	}

	@Override
	public int compareTo(Exemplaire o) {
		if (this.getAuto().isLuxe())  
            return 2;
		else if(this.getMoto()!=null)  
            return 1;
		else {
			return 0;
		}
		
	}
}


