import java.util.InputMismatchException;
import java.util.Scanner;

public class Terre {

	public static void main(String[] args) {

		Jardin j = new Jardin(2, 2);

		j.ajouterPanier("Tomate", 5);
		j.ajouterPanier("Carotte", 5);
		j.ajouterPanier("Ail", 5);
		j.ajouterPanier("Betterave", 5);

		int choice = 0;

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println(j);

			System.out.println("Que voulez vous faire ?");
			System.out.println("1. Semer une graine");
			System.out.println("2. Récolter toutes les plantes qui sont matures");
			System.out.println("3. Passer à la saison suivante (toutes les plantes grandissent)");
			System.out.println("4. Quitter l'application");

			try {
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
				case 4:
					System.out.println("See you soon");
					break;
				default:
					System.err.println("Veuillez saisir un chiffre entre 1 et 4");
					break;
				}
			} catch (InputMismatchException e) {
				System.err.println("Veuillez saisir un chiffre, les charactères sont interdits.");
			}

		} while (choice != 4);
	}

}