package main;

public class Emprunteur {

	static int id;
	String nom;
	String prenom;
	Adresse adresse;
	
	public void louer(){
		
	}
	
	public void ramener(){
		
	}

	/**
	 * @return the id
	 */
	public static int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public static void setId(int id) {
		Emprunteur.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Emprunteur(String nom, String prenom, int numero,String rue,int CP,String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = new Adresse(numero,rue,CP,ville);
	}



	
}
