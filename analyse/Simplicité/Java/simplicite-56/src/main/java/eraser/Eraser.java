package main.java.eraser;

public class Eraser {
	// SIMPLICITE - 56
	
	 public static String erase(String str) {
		 //// D�clarations de variables \\\\

	        String finalStr = "";                   // Chaine de caract�re qui sera retourn�e a la fin du programme
	        char[] tabStr = str.toCharArray();      // Tableau contenant chaque caract�re de la chaine en entr�e du programme
	        int taille = tabStr.length;             // Taille du tableau
	        int espace = 0;                         // Compteur d'espaces
	        //D�claration du nombre d'it�rations
	        int nbIterations = 0;


	        //// Cr�ation de la chaine de caract�res \\\\

	        for(int i=0; i<taille; i++){                            // Cette boucle effectue autant d'it�rations que la taille de la phrase donn�e.
	            if(tabStr[i] == ' '){
	                espace += 1;                                    // Si le caract�re equivaut a un espace, on incr�mente le compteur d'espace.                     
	                if(i+1<taille){                                 // Ce test permet de ne pas avoir d'erreur du type Index out of range.
		                 if(tabStr[i+1] != ' ' && espace>1){	
		                     for(int y=0; y<espace; y++){  		                    	 
		                         finalStr += ' ';                     // Lorsqu'une suite d'espaces se termine, si il y a plus d'un seul espace, on ajoute "espace" (la variable) fois un espace.
		                         nbIterations++;
		                     }
		                 }
	                }
	            } else {
	                espace = 0;
	                finalStr += tabStr[i];                          // Si le caract�re pr�sent n'est pas un espace, on met le compteur d'espace a 0 et on ajoute le caract�re a la chaine finale.
	                nbIterations++;
	            }
	        }
	        
	        //Affichage
	        System.out.println(nbIterations);
	        return finalStr;
	 }

}
