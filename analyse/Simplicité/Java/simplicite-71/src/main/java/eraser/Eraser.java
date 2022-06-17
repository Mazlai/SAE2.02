package main.java.eraser;

public class Eraser {
	// SIMPLICITE  -  71
	
	 public static String erase(String str) {
		//throw new UnsupportedOperationException("Unimplemented");
	        String res = "";
		//Déclarations de variable d'itérations
	        int nbIterations = 0;
			for(int i=0 ; i<str.length(); i++) {
				if(str.charAt(i) != ' ' || (str.charAt(i+1)==' ' || str.charAt(i-1)==' ')){   
					res+= str.charAt(i);
					nbIterations++;
					
				}
			}
		 
		 	//Affichage
			System.out.println(nbIterations);
			return res; 
	 }

}
