package main.java.eraser;

public class Eraser {
	// SIMPLICITE - 11
	
	public static String erase1(String chaine) {

		//Déclaration du nombre d'itérations
		int nbIterations = 0;
		
		char [] tab = chaine.toCharArray();
	    String res = "";
	    
	    if (tab.length < 1) {
	    	return "";
	    } else if (tab.length == 1) {
	    	if (tab[0] == ' ') {
	    		return "";
	    	} else {
	    		res += tab [0];
	    		nbIterations++;
	    		return res;
	    	}
	    }
	     
	    if (tab[0] == ' ' && tab [1] == ' ') {
	    	res += " ";
	    	nbIterations++;
	    } else if (tab [0] != ' ') {
	    	res += tab [0];
	    	nbIterations++;
	    } else {
	    	res += "";
	    	nbIterations++;
	    }
	    
	    int i;
	    
	    for (i=1; i<tab.length - 1; i++) {
	    	if (tab [i] == ' ' && (tab [i+1] == ' ' || tab [i-1] == ' ')) {
	    		res += " ";
	    		nbIterations++;
	    	} else if (tab [i] != ' ') {
	    		res += tab [i];
	    		nbIterations++;
	    	} else {
	    		res += "";
	    		nbIterations++;
	    	}
	    }
	    
	    if (tab[i] == ' ' && tab [i-1] == ' ') {
	    	res += " ";
	    	nbIterations++;
	    } else if (tab [i] != ' ') {
	    	res += tab [i];
	    	nbIterations++;
	    } else {
	    	res += "";
	    	nbIterations++;
	    }
	    
	    //Affichage
        System.out.println(nbIterations);
        
	    return res;
	}
     
}
