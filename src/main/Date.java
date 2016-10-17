package main;

public class Date {
	int jour;
	int mois;
	int annee;
	
	public Date(int jour, int mois, int annee) {
		// TODO Auto-generated constructor stub
		this.jour=jour;
		this.mois=mois;
		this.annee=annee;
	}

	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}

	/**
	 * @param jour the jour to set
	 */
	public void setJour(int jour) {
		this.jour = jour;
	}

	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}

	/**
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		this.mois = mois;
	}

	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return annee+"/"+mois+"/"+jour;
	}	
}
