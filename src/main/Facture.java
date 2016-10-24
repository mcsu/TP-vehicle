package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.naming.spi.DirStateFactory.Result;

public class Facture {

	private int id;
	private static int Numero;
	private Devis devis;
	private int stoke;
	public Devis getDevis() {
		return devis;
	}
	public void setDevis(Devis devis) {
		this.devis = devis;
	}
	public int getStoke() {
		return stoke;
	}
	public void setStoke(int stoke) {
		this.stoke = stoke;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		String result="��Ʊ��Ϣ";
		result+="���\n";
		result+=id;
		result+="ʣ������";
		result+=stoke;
		result+=devis;
		if(devis.getExemplaire().isAccident())
			if(devis.getSafe()!=null){
				result+="����";
				float total=500;
				total+=devis.calculate();
			}
			else{
				result+="����";
				float total=(500*devis.getSafe().getInsuranceAmount())/100;
				total+=devis.calculate();
			}
			
			
			
		return result;
	}

}
