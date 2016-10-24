package main;

public class Devis {

	int id;
	static int Numero;
	boolean hasSafe;
	Object veh;
	Emprunteur emprunteur;
	Date debut;
	Date fini;
	public Devis( boolean hasSafe, Object veh, Emprunteur emprunteur, Date debut, Date fini) {
		super();
		Devis.Numero=Devis.Numero+1;
		id=Numero;
		this.hasSafe = hasSafe;
		this.veh = veh;
		this.emprunteur = emprunteur;
		this.debut = debut;
		this.fini = fini;
	}
	
	
}
