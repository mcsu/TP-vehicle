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
   
	public Exemplaire(boolean accident, int kilometres, Vehicule vehicule, int id) {
		super();
		this.accident = accident;
		this.kilometres = kilometres;
		this.vehicule = vehicule;
		this.id = id;
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
		String result = "±‡∫≈" ;
		result+=id;
		result+="≥µ¡æ–≈œ¢";
		result+="\n";
		result+=vehicule;
		result+="\n";
		return result;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accident ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + kilometres;
		result = prime * result + ((vehicule == null) ? 0 : vehicule.hashCode());
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
		Exemplaire other = (Exemplaire) obj;
		if (accident != other.accident)
			return false;
		if (id != other.id)
			return false;
		if (kilometres != other.kilometres)
			return false;
		if (vehicule == null) {
			if (other.vehicule != null)
				return false;
		} else if (!vehicule.equals(other.vehicule))
			return false;
		return true;
	}
	@Override
	public int compareTo(Exemplaire o) {
		if (this.getAuto().isLuxe())  
            return 2;
		else if(this.getAuto()!=null)
			return 1;
		else {
			return 0;
		}
		
	}
}


