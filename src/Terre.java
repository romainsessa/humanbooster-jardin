import java.util.HashMap;
import java.util.Scanner;

import flore.Ail;

public class Terre {

	public static void main(String[] args) {

		Ail ail = new Ail();
		ail.seReproduire(new HashMap<>());
		
		Jardin j = new Jardin(2, 2);

		j.ajouterPanier("Tomate", 5);
		j.ajouterPanier("Carotte", 5);
		j.ajouterPanier("Ail", 5);
		j.ajouterPanier("Betterave", 5);

		Scanner scanner = new Scanner(System.in);
		int choice = 4;
		do {
			System.out.println(j);

			System.out.println("Que voulez vous faire ?");
			System.out.println("1. Semer une graine");
			System.out.println("2. Récolter toutes les plantes qui sont matures");
			System.out.println("3. Passer à la saison suivante (toutes les plantes grandissent)");
			System.out.println("4. Quitter l'application");

			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				j.semer();
				break;
			case 2:
				j.recolter();
				break;
			case 3:
				j.saisonSuivante();
				break;
			}

		} while (choice != 4);
		System.out.println("See you soon");
	}

}
