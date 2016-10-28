package main;
//TODO
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Devis {

	private int id;
	private static int Numero;
	private Safe safe;
	private Exemplaire exemplaire;
	private Emprunteur emprunteur;
	private Date debut;
	private Date fini;
	private float prix;
	
	
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Safe getSafe() {
		return safe;
	}
	public void setSafe(Safe safe) {
		this.safe = safe;
	}
	public float calculate(){
		//Ʒ��-��ÿ��ļ۸� * ����+����
		float total = 0;
		long diff = 0;
		diff =fini.getTime()-debut.getTime();
		int date = (int) (diff / (1000 * 60 * 60 * 24));
		total+=exemplaire.getVehicule().getPrice()*date;
		total+=safe.getPrix();
		this.prix=total;
		return total;
	}
	public String toString() {
		String info = "";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		info+="Ԥ����Ϣ\n";
		info+="Ԥ����";
		info+=id;
		info+="�⳵��\n";
		info+=emprunteur;
		info+="\n��ʼʱ��\n";
		info+=df.format(debut);
		info+="\n����ʱ��\n";
		info+=df.format(fini);
		info+="\n����\n";
		info+=exemplaire;
		//o instanceof ClassA
//		if(exemplaire.getVehicule() instanceof Auto){
//			Auto temp ;
//			temp = (Auto) exemplaire.getVehicule();
//			info+=temp.getModel();
//			
//		}
//		else if(exemplaire.getVehicule() instanceof Moto){
//			Moto temp ;
//			temp = (Moto) exemplaire.getVehicule();
//			info+=temp.getCylindre();
//			
//		}
			
		info+="������Ϣ\n";
		info+=safe;
		info+="\t\t\t�ܼ�\n";
		info+="\t\t\t\t\t\t";
		info+=this.calculate();
	
		return info;
	}
	
	


	public Devis(Safe safe, Exemplaire veh, Emprunteur emprunteur, Date debut, Date fini) {
		super();
		this.safe = safe;
		this.exemplaire = veh;
		this.emprunteur = emprunteur;
		this.debut = debut;
		this.fini = fini;
	}
	public Exemplaire getExemplaire() {
		return exemplaire;
	}
	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}
	public Emprunteur getEmprunteur() {
		return emprunteur;
	}
	public void setEmprunteur(Emprunteur emprunteur) {
		this.emprunteur = emprunteur;
	}
	public Date getDebut() {
		return debut;
	}
	public void setDebut(Date debut) {
		this.debut = debut;
	}
	public Date getFini() {
		return fini;
	}
	public void setFini(Date fini) {
		this.fini = fini;
	}
	public int getId() {
		return id;
	}

	
}
