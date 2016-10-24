package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utilisation {
//	public static void ui(){
//		System.out.println("1-估价管理");
//		System.out.println("2-资源管理");
//		System.out.println("3-客户管理");
//		System.out.println("4-租赁管理");
//	}
//
	public static void main(String[] args) throws ParseException {
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
		Auto b2 = new Auto("Benz",1000, 100, 100, "c200", true);
		Auto b3 = new Auto("Tesla",1000, 100, 100, "model x", true);
		Auto b4 = new Auto("xiali",1000, 100, 100, "abc", false);
		Auto b5 = new Auto("audi",1000, 100, 100, "TT", true);
		Moto b6 = new Moto("Dji", 1000, 100, 100, 5);
		
		Exemplaire c1 = new Exemplaire(b1);
		Exemplaire c2 = new Exemplaire(b2);
		Exemplaire c3 = new Exemplaire(b3);
		Exemplaire c4 = new Exemplaire(b4);
		Exemplaire c5 = new Exemplaire(b5);
		Exemplaire c6 = new Exemplaire(b6);
		Exemplaire c7 = new Exemplaire(b3);
		
		
		
		ManageVeh mv = new ManageVeh();
		mv.addVeh(c1);
		mv.addVeh(c2);
		mv.addVeh(c3);
		mv.addVeh(c4);
		mv.addVeh(c5);
		mv.addVeh(c6);
		mv.addVeh(c7);
		mv.listParType();
		
		
	}
	
	
	
	

}
