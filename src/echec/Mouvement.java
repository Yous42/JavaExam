package echec;

import java.util.List;

// Ajout public
public interface Mouvement {

	// Ajout de public abstract pour montrer qu'on à une classe abstract même si c'est fait par 
	// défaut
	public abstract List<Position> getMouvementPossible();
	
}
