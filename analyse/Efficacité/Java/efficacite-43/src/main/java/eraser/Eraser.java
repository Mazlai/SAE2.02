package main.java.eraser;

public class Eraser {
	// EFFICACITE - 43
	
	public static String erase2(String str) {

		String resultat = "";
		
		//Déclaration du nombre d'itérations
		int nbIterations = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32) { //32 est le code ASCII pour un espace
				if (i != 0 && str.charAt(i-1) == 32) {
					resultat += str.charAt(i);
					nbIterations++;
				} else if (i+1 < str.length() && str.charAt(i+1) == 32) {
					resultat += str.charAt(i);
					nbIterations++;
				}
			} else {
				resultat += str.charAt(i);
				nbIterations++;
			}
		}
		
		//Affichage
        System.out.println(nbIterations);
		return resultat; //on retourne la nouvelle String
	}
     
}
