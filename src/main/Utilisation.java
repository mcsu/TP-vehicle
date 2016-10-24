package main;

import java.util.Scanner;

public class Utilisation {
//	public static void ui(){
//		System.out.println("1-估价管理");
//		System.out.println("2-资源管理");
//		System.out.println("3-客户管理");
//		System.out.println("4-租赁管理");
//	}
//
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		while(true){
//			ui();
//			Scanner s = new Scanner(System.in);
//			switch (s.nextLine()) {
//			case "1":
//				System.out.println(1);
//				break;
//
//			default:
//				System.out.println(0);
//				break;
//			}
//		}
//		
		Emprunteur a1 = new Emprunteur("SU", "Hao", 42, "Germain Defresne", 94400, "VsS");
		Auto b1 = new Auto("BMW",1000, 100, 100, "i8", true);
		Auto b2 = new Auto("BMW",1000, 100, 100, "i8", false);
		Auto b3 = new Auto("BMW",1000, 100, 100, "i8", true);
		Auto b4 = new Auto("BMW",1000, 100, 100, "i8", false);
		
		a1.louer(b1);
		ManageVeh mv = new ManageVeh();
		mv.addVeh(b1);
		mv.addVeh(b2);
		mv.addVeh(b3);
		mv.addVeh(b4);
		for(Vehicule but : mv.ts){
			System.out.println(but);
		}
		
		
		
	}
	
	
	
	

}
