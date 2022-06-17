package main.java.eraser;

public class Eraser {
	// EFFICACITE - 131
	
	public static String erase(String str) {

		//Déclaration du nombre d'itérations
		int nbIterations = 0;
		
		
		StringBuilder strB = new StringBuilder(str);
        int taille = strB.length();
        int i = 0;
        for(int i  = 0; i < taille; i++) {
            if(strB.charAt(i) == (char)32 && strB.charAt(Math.min(i+1, taille-2)) != (char)32 && strB.charAt(Math.max(i-1, 1)) != (char)32) {
                strB.deleteCharAt(i);
                nbIterations++;
                taille = strB.length();
            }
        }
        str = strB.toString();
        //Affichage
        System.out.println(nbIterations);
        
        return str;
	}
     
}
