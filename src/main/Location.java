package main;
//lizi
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Location implements Comparable<Location>{
	static Set<Location> ts = new TreeSet<Location>();  
	int id;
	static int numero;
	Date debut;
	Date fini;
	Exemplaire exemplaire;
	Emprunteur emprunteur;
	private float total=0;//总价格
	private float prix=0;//订单价格
	Safe safe;//Assurence
	
	public float calculate(){
		long diff = 0;
		diff =fini.getTime()-debut.getTime();
		int date = (int) (diff / (1000 * 60 * 60 * 24));
		prix+=exemplaire.getVehicule().getPrice()*date;
		if(this.safe!=null)
		{
			total+=safe.getPrix();
		}
		if(this.exemplaire.isAccident()){
			if(this.safe==null){
				//无保险
				total+=5000;
			}
			else{
				total+=(5000*(1-this.safe.getInsuranceAmount()/100));
			}
		}
		total+=prix;
		return total;
	}
	
	public Location rechercherParDebut(Date debut){
		 Location result= null;
			for(Location but : ts){
				
				if(but.debut.equals(debut)){
					result=but;
				}	
			}
			return result;	
	 }
	public static void add(Location location){
		ts.add(location);
	}
	public String toString() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");	
		String result="";
		result+="订单信息\n";
		result+="租车人";
		result+=this.getEmprunteur();
		result+="车型";
		result+=this.getExemplaire();
		result+="起始日期";
		result+=df.format(this.debut);
		result+="结束日期";
		result+=df.format(this.fini);
		result+="保险信息";
		result+=this.safe;
		result+="价格";
		result+=this.calculate();
		return result;
	}

	@Override
	public int compareTo(Location o) {
		// TODO Auto-generated method stub
		return 1;
	}
	/**
	 * @return the debut
	 */
	public Date getDebut() {
		return debut;
	}
	/**
	 * @param debut the debut to set
	 */
	public void setDebut(Date debut) {
		this.debut = debut;
	}
	/**
	 * @return the fini
	 */
	public Date getFini() {
		return fini;
	}
	/**
	 * @param fini the fini to set
	 */
	public void setFini(Date fini) {
		this.fini = fini;
	}
	/**
	 * @return the exemplaire
	 */
	public Exemplaire getExemplaire() {
		return exemplaire;
	}
	/**
	 * @param exemplaire the exemplaire to set
	 */
	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}
	/**
	 * @return the emprunteur
	 */
	public Emprunteur getEmprunteur() {
		return emprunteur;
	}
	/**
	 * @param emprunteur the emprunteur to set
	 */
	public void setEmprunteur(Emprunteur emprunteur) {
		this.emprunteur = emprunteur;
	}
	/**
	 * @return the total
	 */
	public float getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(float total) {
		this.total = total;
	}
	/**
	 * @return the prix
	 */
	public float getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}
	/**
	 * @return the safe
	 */
	public Safe getSafe() {
		return safe;
	}
	/**
	 * @param safe the safe to set
	 */
	public void setSafe(Safe safe) {
		this.safe = safe;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((debut == null) ? 0 : debut.hashCode());
		result = prime * result + ((emprunteur == null) ? 0 : emprunteur.hashCode());
		result = prime * result + ((exemplaire == null) ? 0 : exemplaire.hashCode());
		result = prime * result + ((fini == null) ? 0 : fini.hashCode());
		result = prime * result + id;
		result = prime * result + Float.floatToIntBits(prix);
		result = prime * result + ((safe == null) ? 0 : safe.hashCode());
		result = prime * result + Float.floatToIntBits(total);
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (debut == null) {
			if (other.debut != null)
				return false;
		} else if (!debut.equals(other.debut))
			return false;
		if (emprunteur == null) {
			if (other.emprunteur != null)
				return false;
		} else if (!emprunteur.equals(other.emprunteur))
			return false;
		if (exemplaire == null) {
			if (other.exemplaire != null)
				return false;
		} else if (!exemplaire.equals(other.exemplaire))
			return false;
		if (fini == null) {
			if (other.fini != null)
				return false;
		} else if (!fini.equals(other.fini))
			return false;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(prix) != Float.floatToIntBits(other.prix))
			return false;
		if (safe == null) {
			if (other.safe != null)
				return false;
		} else if (!safe.equals(other.safe))
			return false;
		if (Float.floatToIntBits(total) != Float.floatToIntBits(other.total))
			return false;
		return true;
	}
	/**
	 * @param debut
	 * @param fini
	 * @param exemplaire
	 * @param emprunteur
	 * @param safe
	 */
	public Location(Date debut, Date fini, Exemplaire exemplaire, Emprunteur emprunteur, Safe safe) {
		super();
		Location.numero=Location.numero+1;
		id=numero;
		this.debut = debut;
		this.fini = fini;
		this.exemplaire = exemplaire;
		this.emprunteur = emprunteur;
		this.safe = safe;
	}
}
