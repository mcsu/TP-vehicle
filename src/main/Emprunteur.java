package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class Emprunteur implements Comparable<Emprunteur>{

	private int id;
	private static int Numero;
	Facture facture;
	Factures factures;
	String nom;
	String prenom;
	Adresse adresse;
	Set<Location> locations;  
	

	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public void louer(Exemplaire exemplaire) throws ParseException{
		Scanner in =  new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Veuillez la date debut.");
		String sDebut = in.nextLine();
		Date debut = df.parse(sDebut);
		System.out.println("Veuillez la date fini.");
		String sFini = in.nextLine();
		Date fini = df.parse(sFini);
		Location location = new Location(debut, fini, exemplaire, this);
	
	}

	public void ramener(Location location){
		locations.remove(location);
		
	}

	@Override
	public String toString() {
		String result = "" ;
		result+="±àºÅ";
		result+=id;
		result+="ÐÕÃû";
		result+=prenom;
		result+=nom;
		result+="\t";
		result+="×¡Ö·";
		result+=adresse;

		return result;
	}
	

	/**
	 * @return the id
	 */
	

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
		Emprunteur.Numero=Emprunteur.Numero+1;
		id=Numero;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = new Adresse(numero,rue,CP,ville);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((facture == null) ? 0 : facture.hashCode());
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
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
		Emprunteur other = (Emprunteur) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (facture == null) {
			if (other.facture != null)
				return false;
		} else if (!facture.equals(other.facture))
			return false;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}
	public int compareTo(Emprunteur o) {
			return 1;
	}

	public  void add(Location location){
		 this.locations.add(location);
	}
	 
	 public Location rechercherParDebut(Date debut){
		 Location result= null;
			for(Location but : locations){
				
				if(but.debut.equals(debut)){
					result=but;
					System.out.println("1");
				}	
			}
			return result;	
	 }
	 
	 public void proposerDevis(String Nom){
		 Location result= null;
			for(Location but : locations){
				if(but.emprunteur.getNom().equals(Nom)){
					System.out.println(but.emprunteur.facture);
				}
			}
			
	 }
	 public void proposerFacture(String Nom){
		 Location result= null;
			for(Location but : locations){
				if(but.emprunteur.getNom().equals(Nom)){
					System.out.println(but.emprunteur.facture);
				}
			}
			
	 }
	 public void proposerTous(String Nom){
		 Location result= null;
			for(Location but : locations){
					System.out.println(but);	
			}	
	 }

	




}
