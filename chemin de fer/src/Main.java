import java.util.List;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gare A = new Gare("GareA", 3);
		Gare D = new Gare("GareD", 3);
		Section AB = new Section("AB");
		Section BC = new Section("BC");
		Section CD = new Section("CD");
		Ligne r = new Ligne(new Element[] { A, AB, BC, CD, D });
		System.out.println("The ligne is:");
		System.out.println("\t" + r);
	}

}
 