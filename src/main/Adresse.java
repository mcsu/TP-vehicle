package main;

public class Adresse {

	private int numero;
	private String rue;
	private int CP;
	private String ville;
	/**
	 * @return the numero
	 */
	public  int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public  void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}
	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	/**
	 * @return the cP
	 */
	public int getCP() {
		return CP;
	}
	/**
	 * @param cP the cP to set
	 */
	public void setCP(int cP) {
		CP = cP;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adresse :" + numero + rue + CP + ville;
	}
	/**
	 * @param numero
	 * @param rue
	 * @param cP
	 * @param ville
	 */
	public Adresse(int numero, String rue, int cP, String ville) {
		super();
		this.numero = numero;
		this.rue = rue;
		CP = cP;
		this.ville = ville;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CP;
		result = prime * result + numero;
		result = prime * result + ((rue == null) ? 0 : rue.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
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
		Adresse other = (Adresse) obj;
		if (CP != other.CP)
			return false;
		if (numero != other.numero)
			return false;
		if (rue == null) {
			if (other.rue != null)
				return false;
		} else if (!rue.equals(other.rue))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}

	
}
