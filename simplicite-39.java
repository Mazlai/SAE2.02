package convertisseur;

public class solutionCategorie1 {

	public static String convertirSimple(String message) {

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
								i++;
							}
							nvMessage+=message.charAt(i);
						}
					}
				} else {
					nvMessage+=(char) val ;
				}
			}
			return nvMessage;
		}
		return message;
	}
}
