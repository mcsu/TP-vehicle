package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.naming.spi.DirStateFactory.Result;

public class Facture {

	
	public Facture(Devis devis,int stoke) {
		super();
		this.devis = devis;
		this.stoke = stoke;
	}
	private float total = 0;
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
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
		
		String result="发票信息";
		result+="\n编号";
		result+=id;
		result+="剩余油量";
		result+=stoke;
		result+=devis;
		total+=(100-stoke)*7.2;
		
		if(devis.getExemplaire().isAccident())
			if(devis.getSafe()==null){
				result+="\n车损";
				total+=500;
				total+=devis.calculate();
			}
			else{
				result+="\n车损";
				total+=(500*(100-devis.getSafe().getInsuranceAmount()))/100;
				System.out.println("jianmian"+(500*(100-devis.getSafe().getInsuranceAmount()))/100);
				total+=devis.calculate();
			}
			
		result+="\n\t\t\t总额\t";
		result+=total;
			
			
		return result;
	}

}
