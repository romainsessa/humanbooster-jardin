package flore;

public abstract class Vegetal {

	protected char[] dessin;

	protected Etat etat;
	
	public Etat getEtat() {
		return etat;
	}

	public Vegetal() {
		dessin = new char[6];
		dessin[0] = '_';
		dessin[1] = '.';
		dessin[2] = '|';
		dessin[5] = '#';
		etat = Etat.GRAINE;
	}

	@Override
	public String toString() {
		return String.valueOf(dessin[etat.ordinal()]);
	}

	public void grandir() {
		if (etat != Etat.MORT) {
			etat = Etat.values()[this.etat.ordinal() + 1];
		}
	}

}