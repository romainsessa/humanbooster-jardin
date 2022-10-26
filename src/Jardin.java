import java.util.HashMap;
import java.util.Set;

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
		for(int i=0; i<longueur; i++) {
			for(int j=0; j<largeur; j++) {
				Emplacement emplacement = emplacements[i][j];
				if(emplacement == null) {
					builder.append("o");
				}
			}
			builder.append("\n");
		}
		builder.append("Et notre panier contient :\n");
		Set<String> keys = this.panier.keySet();
		for(String key : keys) {
			builder.append(key);
			builder.append(" : ");
			builder.append(this.panier.get(key));
			builder.append(" graine(s)\n");
		}		
		return builder.toString();
	}	
}