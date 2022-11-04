package utils;

import java.util.Scanner;

public class Utilitaire {

	public static String nameUser() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez votre nom svp (j1 puis j2) :");
		return sc.nextLine();
	}
}
