package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class ManageVeh {

	 
	public void addVeh(Exemplaire veh){
		ts.add(veh);
		
	}
	
	public void rechercherParMarque(String marque){
		
		for(Exemplaire but : ts){
			if(but.getVehicule().getMarque().equals(marque)){
				System.out.println(but);
				
			}	
		}
		
	}
	
public Exemplaire rechercherParId(int id){
		Exemplaire o = null;
		for(Exemplaire but : ts){
			if(but.getVehicule().getId()==id){
				o=but;
			}	
		}
		return o;
		
	}
	
	public void rechercherParDistance(float distance){
		
		for(Exemplaire but : ts){
			if(but.getVehicule().getDistance()==distance){
				System.out.println(but);
			}	
		}
		
	}
	
	public void listParType(){
		System.out.println("list par type\n");
		for(Exemplaire but : ts){
			System.out.println(but);System.out.println("daguiqi");
		}
	}
	public void delete(int id){
		for(Exemplaire but : ts){
			if(but.getVehicule().getId()==id)
				ts.remove(but);
		}
	}
	
	
//	public void change(int id){
//		for(Exemplaire but : ts){
//			if(but.getVehicule().getId()==id)
//				ts.                
//			
//			
//		}
//	}
	
//	public void generator(int id){
//		if(this.re)
//	}
	
	
	
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
