package main;

public class Adresse {

	int numero;
	String rue;
	int CP;
	String ville;
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

}
