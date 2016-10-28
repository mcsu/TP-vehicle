package main;

import java.util.Set;
import java.util.TreeSet;


public class Flotte {

	static Set<Exemplaire> ts = new TreeSet<Exemplaire>(); 
	public void addVeh(Exemplaire veh){
		ts.add(veh);
		
	}
	
	public Exemplaire rechercherParMarque(String marque){
		Exemplaire result= null;
		for(Exemplaire but : ts){
			if(but.getVehicule().getMarque().equals(marque)){
				result=but;
				System.out.println(but);
			}	
		}
		return result;	
	}
	
	public Exemplaire rechercherParDistance(float distance){
		Exemplaire result= null;
		for(Exemplaire but : ts){
			if(but.getVehicule().getDistance()==distance){
				result=but;
				System.out.println(but);
			}	
		}
		return result;	
	}
	
	public void listParType(){
		System.out.println("按类型输出\n");
		for(Exemplaire but : ts){
			System.out.println(but);
		}
	}
	public void delete(int id){
		for(Exemplaire but : ts){
			if(but.getVehicule().getId()==id)
				ts.remove(but);
		}
	}
	
	
//	public void change(int id){
//		for(Vehicule but : ts){
//			if(but.getId()==id)
//				ts.remove(but);
//			
//		}
//	}
//	
//	public void generator(){
//		
//	}
//	
	
	
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
