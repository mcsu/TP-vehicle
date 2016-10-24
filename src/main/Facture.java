package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Facture {

	int id;
	static int Numero;
	boolean hasSafe;
	Object veh;
	Emprunteur emprunteur;
	Date debut;
	Date fini;
	Float prix;
	int stoke;
	static List<Facture> factures = new ArrayList<Facture>();
	public Facture(boolean hasSafe, Object veh, Emprunteur emprunteur, Date debut, Date fini,
			int stoke,float prix) {
		super();
		Facture.Numero=Facture.Numero+1;
		id=Numero;
		this.hasSafe = hasSafe;
		this.veh = veh;
		this.emprunteur = emprunteur;
		this.debut = debut;
		this.fini = fini;
		this.stoke = stoke;
		this.prix = prix;
	}
	
}
