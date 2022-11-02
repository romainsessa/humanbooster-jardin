package flore;

import java.util.AbstractMap.SimpleEntry;
import java.util.Random;

public class Betterave extends Vegetal implements IOgm {

	public Betterave() {
		dessin[3] = 'b';
		dessin[4] = 'B';
	}

	@Override
	public SimpleEntry<Integer, Integer> seDupliquer(int longueur, int largeur) {
		Random r = new Random();
		int x = r.nextInt(longueur);
		int y = r.nextInt(largeur);
	
		etat = Etat.GRAINE;
		
		return new SimpleEntry<Integer, Integer>(x, y);
	}

}
