package main;

import java.util.Set;
import java.util.TreeSet;

public class Emprunteurs {

	static Set<Emprunteur> ts = new TreeSet<Emprunteur>(); 
	
	public void addEmprunteur(Emprunteur emprunteur){
		ts.add(emprunteur);
	}
	
	public Emprunteur rechercherParNom(String Nom){
		Emprunteur result= null;
		for(Emprunteur but : ts){
			if(but.getNom().equals(Nom)){
				result=but;
			}	
		}
		return result;	
	}
	
	public void list(){
		System.out.println("\n");
		for(Emprunteur but : ts){
			System.out.println(but);
			
		}
	}
	
	public Emprunteur rechercherParMontant(float prix){
		Emprunteur result= null;
		float total = 0;
		for(Emprunteur but : ts){
			for(Facture facture : Factures.factures){
				total+=facture.getDevis().calculate();
				if(total==prix)
					result=but;
			}
		}
		return result;	
	}
}
