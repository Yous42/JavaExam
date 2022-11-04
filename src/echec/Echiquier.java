package echec;

// Import de ArrayList plutôt que * pour éviter d'importer des fichiers qui nes sont 
// pas utilisé => gagner en performance
//import java.util.*;
import java.util.ArrayList;

import model.Piece;

public class Echiquier {

	// Mettre en private
	private ArrayList<Case> tabCase = new ArrayList<Case>(); // case rang� par x puis y

	public Echiquier() {
		for (int i = 1; i <= 8; i++) {
			for (int l = 1; l <= 8; l++) {
				Position p = new Position(l, i);
				Case c = new Case(p.clone());
				tabCase.add(c);
			}
		}
	}

	public void initialisation() {
		for (Piece count : Piece.tabPiece) {

			for (Case carre : tabCase) {
				if (count.getPosition().equals(carre.getPosition())) {
					carre.positionne(count);
					break;
				}
			}
		}
	}

	public void afficherEchiquier() {
		int i = 1;
		for (Case count : tabCase) {

			if (i != count.getPosition().getY()) {

				System.out.println();
				i++;
			}

			if (count.getPiece() != null) {
				Piece p = count.getPiece();
				String coul;
				if (p.getCouleur().equals(Couleur.WHITE))
					coul = "b";
				else
					coul = "n";

				// Modif des case pour les faire pour le faire correspondre au nom des classes 
				switch (p.getClass().getSimpleName()) {
				case "Cavalier":
					System.out.print("C" + coul);
					break;
				case "Reine":
					System.out.print("Re" + coul);
					break;
				case "Fou":
					System.out.print("F" + coul);
					break;
				case "Pion":
					System.out.print("P" + coul);
					break;
				case "Roi":
					System.out.print("R" + coul);
					break;
				case "Tour":
					System.out.print("T" + coul);
					break;
				}

			} else {
				System.out.print("..");
			}
			System.out.print(" | ");

		}
		System.out.println();
		System.out.println();
	}

	public void update() {
		this.initialisation();
		this.afficherEchiquier();
	}

	public Case getCase(int x, int y) {
		int entree = (y - 1) * 8 + x - 1;
		return this.tabCase.get(entree);
	}

	
	// Ajout des get + set
	public ArrayList<Case> getTabCase() {
		return tabCase;
	}

	public void setTabCase(ArrayList<Case> tabCase) {
		this.tabCase = tabCase;
	}




}
