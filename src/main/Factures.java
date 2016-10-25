package main;

import java.util.Set;
import java.util.TreeSet;

import other.Facture;

public class Factures {

	private Set<Facture> ts = new TreeSet<Facture>(); 
	
	public void add(Facture facture){
		ts.add(facture);
	}
}
