package main;

import java.util.Set;


public class Exemplaire implements Comparable<Exemplaire>{

	private int id;
	private static int Numero;
	private int kilometres;
	private Object vehicule;
	
	
	public Exemplaire(Object vehicule){
		Exemplaire.Numero=Exemplaire.Numero+1;
		id=Numero;
		this.vehicule=vehicule;
		
		

	}

	@SuppressWarnings("null")
	@Override
	public String toString() {
		String result = "���" ;
		result+=id;
		result+="������Ϣ";
		result+="\n";
		result+=vehicule;
		result+="\n";
		return result;
//		StringBuilder stringBuilder = null;
//		stringBuilder.append("������Ϣ");
//		stringBuilder.append("\n");
//		stringBuilder.append("�⳵��");
//		stringBuilder.append("\n");
//		stringBuilder.append(emprunteur);
//		stringBuilder.append("\n");
//		stringBuilder.append("������Ϣ");
//		stringBuilder.append("\n");
//		stringBuilder.append(vehicule);
//		stringBuilder.append("\n");
//		return stringBuilder.toString();
	}

	@Override
	public int compareTo(Exemplaire o) {
		// TODO Auto-generated method stub
		return 0;
	}
}


