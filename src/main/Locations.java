package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Locations {

	 
	 public static void add(Location location){
		ts.add(location);
	}
	 
	 public Location rechercherParDebut(Date debut){
		 Location result= null;
			for(Location but : ts){
				
				if(but.debut.equals(debut)){
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
