package main;

import java.util.Set;
import java.util.TreeSet;

public class Emprunteurs {

	static Set<Emprunteur> emprunteurs = new TreeSet<Emprunteur>(); 
	
	public void addEmprunteur(Emprunteur emprunteur){
		emprunteurs.add(emprunteur);
	}
	
	public Emprunteur rechercherParNom(String Nom){
		Emprunteur result= null;
		for(Emprunteur but : emprunteurs){
			if(but.getNom().equals(Nom)){
				result=but;
			}	
		}
		return result;	
	}
	
	public void list(){
		System.out.println("\n");
		for(Emprunteur but : emprunteurs){
			System.out.println(but);
			
		}
	}
	
	public Emprunteur rechercherParMontant(float prix){
		Emprunteur result= null;
		float total = 0;
		for(Emprunteur but : emprunteurs){
			for(Facture facture : but.factures.factures){
				total+=facture.getTotal();
				if(total==prix)
					result=but;
			}
		}
		return result;	
	}
}
