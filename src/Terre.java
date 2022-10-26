
public class Terre {

	public static void main(String[] args) {

		Jardin j = new Jardin(5, 3);
		
		j.ajouterPanier("Tomate", 5);
		j.ajouterPanier("Carotte", 5);
		j.ajouterPanier("Ail", 5);
		j.ajouterPanier("Betterave", 5);
		
		System.out.println(j);
		
	}

}
