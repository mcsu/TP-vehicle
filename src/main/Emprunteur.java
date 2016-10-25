package main;

import java.util.Set;
import java.util.TreeSet;

import other.Devis;
import other.Facture;




public class Emprunteur implements Comparable<Emprunteur>{

	private int id;
	private static int Numero;
	Facture facture;
	Factures factures;
	String nom;
	String prenom;
	Adresse adresse;
	Devis devis;
	

	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public void louer(Auto vehicule){
		
		

	}
	public void louer(Moto vehicule){
		

	}

	@Override
	public String toString() {
		String result = "" ;
		result+="客户编号";
		result+=id;
		result+="姓名";
		result+=prenom;
		result+=nom;
		result+="\t";
		result+="住址";
		result+=adresse;

		return result;
	}
	public void ramener(){

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
	public int compareTo(Emprunteur o) {
		// TODO Auto-generated method stub
		
			return 1;
		
	}
	
	public void louer(){
		System.out.println("租车程序\n");
		System.out.println("当前可用\n");
//		Utilisation.main(null).m
//		
//		
//		
//		this.devis = new Devis(safe, veh, this, debut, fini);
	}

	




}
