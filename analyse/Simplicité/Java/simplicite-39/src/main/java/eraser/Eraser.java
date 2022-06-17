package main.java.eraser;

public class Eraser {
	// SIMPLICITE - 39
	
	public static String convertirSimple(String message) {

		//Déclaration du nombre d'itérations
		int nbIterations = 0;
		
		if(message.contains(" ")) {
			String nvMessage = "";
			int taille = message.length();
			for(int i=0;i<taille;i++) {
				int val = message.charAt(i);
				if(val==32) {
					if(i!=taille-1) {
						int val2 = message.charAt(i+1);
						if(val2==32) {
							while(message.charAt(i)==32 && i!=taille-1) {
								nvMessage+=message.charAt(i);
								nbIterations++;
								i++;
							}
							nvMessage+=message.charAt(i);
							nbIterations++;
						}
					}
				} else {
					nvMessage+=(char) val ;
					nbIterations++;
				}
			}
			return nvMessage;
		}
		//Affichage
        System.out.println(nbIterations);
        
		return message;
	}
}
