
public class Element {
	private String nom;
	private Ligne ligne;

	public Element(String n){
		nom=n;
	}
	public void setLigne(Ligne l){
		ligne=l;
	}
	
	@Override
	public String toString(){
		return this.nom;
	}
}
