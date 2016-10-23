package main;

public class Location {
	
	String numero;
	Date debut;
	Date fin;
	Exemplaire exemplaire;
	Emprunteur emprunteur;
//	PERSONE
	
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the debut
	 */
	public Date getDebut() {
		return debut;
	}
	/**
	 * @param debut the debut to set
	 */
	public void setDebut(Date debut) {
		this.debut = debut;
	}
	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}
	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Location [numero=" + numero + ", debut=" + debut + ", fin=" + fin + ", toString()=" + super.toString()
				+ "]";
	}
	/**
	 * @param numero
	 * @param debut
	 * @param fin
	 */
	public Location(Date debut, Date fin,Emprunteur emprunteur,Exemplaire veh) {
		super();
		this.debut = debut;
		this.fin = fin;
		this.emprunteur = emprunteur;
		this.exemplaire = veh;
	}
}
