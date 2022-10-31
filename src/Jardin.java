import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import flore.Ail;
import flore.Betterave;
import flore.Carotte;
import flore.Etat;
import flore.Tomate;
import flore.Vegetal;

public class Jardin {

	private int longueur;
	private int largeur;
	private Emplacement[][] emplacements;
	private HashMap<String, Integer> panier;

	public Jardin(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.panier = new HashMap<String, Integer>();
		this.emplacements = new Emplacement[this.longueur][this.largeur];
	}

	public void ajouterPanier(String nomDuVegetal, Integer quantite) {
		this.panier.put(nomDuVegetal, quantite);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Voici notre jardin :\n");
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				Emplacement emplacement = emplacements[i][j];
				if (emplacement == null) {
					builder.append("o");
				} else {
					builder.append(emplacement);
				}
			}
			builder.append("\n");
		}
		builder.append("Et notre panier contient :\n");
		Set<String> keys = this.panier.keySet();
		for (String key : keys) {
			builder.append(key);
			builder.append(" : ");
			builder.append(this.panier.get(key));
			builder.append(" graine(s)\n");
		}
		return builder.toString();
	}

	public void semer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle position X pour le nouveau végétal ?");
		int x = scanner.nextInt();
		System.out.println("Quelle position Y pour le nouveau végétal ?");
		int y = scanner.nextInt();
		System.out.println("Quel végétal voulez-vous ? 1. Ail 2. Betterave 3. Carotte 4. Tomate");
		int choixVegetal = scanner.nextInt();

		Vegetal v = null;
		switch (choixVegetal) { // Design pattern : Factory
		case 1:
			v = new Ail();
			break;
		case 2:
			v = new Betterave();
			break;
		case 3:
			v = new Carotte();
			break;
		case 4:
			v = new Tomate();
		default:
			System.out.println("Vous n'avez pas selectionné un végétal valide");
			break;
		}

		String nomVegetal = v.getClass().getSimpleName();

		if (panier.get(nomVegetal) > 0) {
			emplacements[x][y] = new Emplacement(v);
			panier.put(nomVegetal, panier.get(nomVegetal) - 1);
		}
	}

	public void saisonSuivante() {
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				Emplacement e = emplacements[i][j];
				if (e != null) {
					if (e.getVegetal().getEtat() == Etat.MORT) {
						emplacements[i][j] = null;
					} else {
						e.getVegetal().grandir();
					}
				}
			}
		}
	}
	
	public void recolter() {
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				Emplacement e = emplacements[i][j];
				if (e != null) {
					if (e.getVegetal().getEtat() == Etat.FLEUR) {
						emplacements[i][j] = null;
					}
				}
			}
		}
	}

}