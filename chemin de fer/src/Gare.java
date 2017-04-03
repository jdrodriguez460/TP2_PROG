import java.util.List;


public class Gare extends Element{
	private List<Train> trains;
	private int nombreQuai;
	
	public Gare(String n,int q){
		super(n);
		nombreQuai=q;
	}
	
	
}
