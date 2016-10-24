package main;

import java.util.Set;
import java.util.TreeSet;


public class ManageVeh {

	static Set<Vehicule> ts = new TreeSet<Vehicule>(); 
	public void addVeh(Vehicule veh){
		ts.add(veh);
	}
	
	public Vehicule rechercherParMarque(String marque){
		Vehicule result= null;
		for(Vehicule but : ts){
			if(but.getMarque().equals(marque)){
				result=but;
			}	
		}
		return result;	
	}
	
	public Vehicule rechercherParDistance(float distance){
		Vehicule result= null;
		for(Vehicule but : ts){
			if(but.getDistance()==distance){
				result=but;
			}	
		}
		return result;	
	}
	
	public void listParType(){
		System.out.println("\n");
		for(Vehicule but : ts){
			System.out.println(but);
			
		}
	}
	
	
	
	/*
	 * 	public Set<Professeur> getCorrectures(){
		Set<Professeur> set=new HashSet<Professeur>();
		for(Evaluation evaluation: evaluations ){
			set.add(evaluation.getTeacher());
		}
		return set;
	}
	 */
}
