package flore;

import java.util.Map;

public abstract class RacePure extends Vegetal implements IRacePure {
	
	@Override
	public void seReproduire(Map<String, Integer> panier) {
		String nomVegetal = this.getClass().getSimpleName();
		Integer nouvelleQuantite = 3;
		if (panier.containsKey(nomVegetal)) {
			nouvelleQuantite += panier.get(nomVegetal);
		}
		panier.put(nomVegetal, nouvelleQuantite);
	}
}
