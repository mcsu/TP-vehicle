package main;

import java.util.Set;
import java.util.TreeSet;

public class Locations {

	 static Set<Location> ts = new TreeSet<Location>();  

	 public static void add(Location location){
		ts.add(location);
	}
	 
	 public Location rechercherParDebut(Date debut){
		 Location result= null;
			for(Location but : ts){
				int a,b;
				a=(but.getDebut().annee)*10000+(but.getDebut().mois*100)+(but.getDebut().jour);
				b=(debut.annee)*10000+(debut.mois*100)+(debut.jour);
				if(a==b){
					result=but;
				}	
			}
			return result;	
	 }
	 
	 public void proposerDevis(String Nom){
		 Location result= null;
			for(Location but : ts){
				if(but.emprunteur.getNom().equals(Nom)){
					System.out.println(but.emprunteur.devis);
				}
			}
			
	 }
	 public void proposerFacture(String Nom){
		 Location result= null;
			for(Location but : ts){
				if(but.emprunteur.getNom().equals(Nom)){
					System.out.println(but.emprunteur.facture);
				}
			}
			
	 }
	 public void proposerTous(String Nom){
		 Location result= null;
			for(Location but : ts){
					System.out.println(but);	
			}	
	 }
	 
	 
	 
}
