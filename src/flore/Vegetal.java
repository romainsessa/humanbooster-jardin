package flore;

public abstract class Vegetal {

	protected char[] dessin;
	private Etat etat;
	
	public Vegetal() {
		dessin = new char[6];
		dessin[0] = '_';
		dessin[1] = '.';
		dessin[2] = '|';
		dessin[5] = '#';
		etat = Etat.GRAINE;
	}
	
}