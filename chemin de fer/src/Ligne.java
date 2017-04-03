import java.util.List;


public class Ligne {
	
	private	List<Train> trains;
	private Element[] elements;
	
	public Ligne(Element[] elements){
		this.elements=elements;
		for (Element e : elements)
			e.setLigne(this);		
	}
	
	@Override
	public String toString(){
		String out= new String();
		for (Element e : elements){
			out += e.toString() + '-';
		}
		return out;
	}
	
}
