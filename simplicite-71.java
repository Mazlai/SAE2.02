package eraser;

public class Eraser {
    public static String erase(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
        String res = "";
		for(int i=0 ; i<str.length(); i++) {
			if(str.charAt(i) != ' ' || (str.charAt(i+1)==' ' || str.charAt(i-1)==' ')){   
				res+= str.charAt(i);
				
			}
		}
		return res; 
    }
}
