
public class Erase1 {

	public static String erase1 (String chaine) {

		char [] tab = chaine.toCharArray();
	    String res = "";
	    
	    if (tab.length < 1) {
	    	return "";
	    } else if (tab.length == 1) {
	    	if (tab[0] == ' ') {
	    		return "";
	    	} else {
	    		res += tab [0];
	    		return res;
	    	}
	    }
	     
	    if (tab[0] == ' ' && tab [1] == ' ') {
	    	res += " ";
	    } else if (tab [0] != ' ') {
	    	res += tab [0];
	    } else {
	    	res += "";
	    }
	    
	    int i;
	    
	    for (i=1; i<tab.length - 1; i++) {
	    	if (tab [i] == ' ' && (tab [i+1] == ' ' || tab [i-1] == ' ')) {
	    		res += " ";
	    	} else if (tab [i] != ' ') {
	    		res += tab [i];
	    	} else {
	    		res += "";
	    	}
	    }
	    
	    if (tab[i] == ' ' && tab [i-1] == ' ') {
	    	res += " ";
	    } else if (tab [i] != ' ') {
	    	res += tab [i];
	    } else {
	    	res += "";
	    }
	    
	    return res;
	}
	
}
