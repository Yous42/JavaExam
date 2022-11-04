package echec;

import utils.Utilitaire;

public class Executeur {

	// Manque le static + String
	public static void main(String[] args) {
		Game g = new Game(Utilitaire.nameUser(), Utilitaire.nameUser());
		// Lance la méthode méthode sur Game et non l'objet
		g.lancer();
	}
}
