package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utilisation {

	public static void main(String[] args) throws ParseException {

		Emprunteur a1 = new Emprunteur("SU", "Hao", 42, "Germain Defresne", 94400, "Vitry sur Seine");
		Auto b1 = new Auto("BMW",1000, 100, 100, "i8", true);
		Exemplaire c1 = new Exemplaire(b1);
		System.out.println("1-Devis et safe");
		Safe safe1 = new Safe("ºúÂÜ²·ÏÕ", 20, 20);
		Safe safe2 = new Safe("²¤ÂÜÏÕ", 38, 50);
		Safe safe3 = new Safe("»ðÁú¹ûÏÕ", 58, 80);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Devis devis = new Devis(safe3, c1, a1, df.parse("2016-1-1"), df.parse("2016-2-1"));
		System.out.println(devis);
		c1.setAccident(true);
		Facture f1 = new Facture(devis, 50);
		System.out.println(f1);
		
		System.out.println("2- Gestion des Ressources");
		
		
		Auto b2 = new Auto("Benz",1000, 100, 100, "c200", true);
		Auto b3 = new Auto("Tesla",1000, 100, 100, "model x", true);
		Auto b4 = new Auto("xiali",1000, 100, 100, "abc", false);
		Auto b5 = new Auto("audi",1000, 100, 100, "TT", true);
		Exemplaire c2 = new Exemplaire(b2);
		Exemplaire c3 = new Exemplaire(b3);
		Exemplaire c4 = new Exemplaire(b4);
		Exemplaire c5 = new Exemplaire(b5);
		Exemplaire c7 = new Exemplaire(b3);
		ManageVeh mv = new ManageVeh();
		mv.addVeh(c1);
		mv.addVeh(c2);
		mv.addVeh(c3);
		mv.addVeh(c4);
		mv.addVeh(c5);
		mv.addVeh(c7);
		System.out.println("rechercher par model");
		System.out.println(mv.rechercherParMarque("Tesla"));
		System.out.println("rechercher par distance");
		System.out.println(mv.rechercherParDistance(100));
		System.out.println("3-Gestion des emprunteurs"); 
		Emprunteur a2 = new Emprunteur("KYAN", "KHOJANDI", 11, "QWERTY", 98585, "Paris");
		Emprunteur a3 = new Emprunteur("BR", "KHOJANDI", 12, "QWERTY", 98585, "Paris");
		Emprunteurs emprunteurs = new Emprunteurs();
		emprunteurs.addEmprunteur(a1);
		emprunteurs.addEmprunteur(a2);
		emprunteurs.addEmprunteur(a3);
		System.out.println("rechercher par NOM");
		System.out.println(emprunteurs.rechercherParNom("SU"));
		System.out.println(emprunteurs.rechercherParNom("KYAN"));
		
		System.out.println("4-Gestion des locations");
		System.out.println("rechercher par debut");
		Location l1 = new Location(df.parse("2014-06-03"), df.parse("2015-06-03"), a1, c1);
		Location l2 = new Location(df.parse("2014-07-03"), df.parse("2015-06-03"), a1, c1);
		Locations locations = new Locations();
		locations.add(l1);
		locations.add(l2);
		System.out.println(locations.rechercherParDebut(df.parse("2014-07-03")));
		

		
		System.out.println("---------------------");
	
		
		
		
	}
	
	
	
	

}
