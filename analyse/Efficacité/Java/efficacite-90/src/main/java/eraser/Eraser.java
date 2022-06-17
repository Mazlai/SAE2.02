package main.java.eraser;

public class Eraser {
	// EFFICACITE - 90
	
	public static String erase(String str) {
		/**
    	 * utilise les expressions r�guli�res : s'il y a un caract�re (n'importe lequel sauf espace, ou un debut de chaine) avant 
    	* l'espace, et apr�s l'espace (n'importe quel caract�re sauf espace, ou une fin de chaine)
    	* alors supprime l'espace 
    	* $1 et $2 permettent de ne pas supprimer les caract�res avant et apr�s l'espace en question
    	**/
    	return str.replaceAll("([^\\s]|^)\\s([^\\s]|$)","$1$2");
	}
     
}
