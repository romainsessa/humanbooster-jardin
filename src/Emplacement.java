import flore.Vegetal;

public class Emplacement {

	private Vegetal vegetal;

	public Vegetal getVegetal() {
		return vegetal;
	}

	public Emplacement(final Vegetal vegetal) {
		this.vegetal = vegetal;
	}

	@Override
	public String toString() {
		return vegetal.toString();
	}

}
