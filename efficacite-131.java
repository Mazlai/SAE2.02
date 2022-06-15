package eraser;

public class Eraser {
    public static String erase(String str) {
        StringBuilder strB = new StringBuilder(str);
            int taille = strB.length();
            int i = 0;
            for(int i  = 0; i < taille; i++) {
                if(strB.charAt(i) == (char)32 && strB.charAt(Math.min(i+1, taille-2)) != (char)32 && strB.charAt(Math.max(i-1, 1)) != (char)32) {
                    strB.deleteCharAt(i);
                    taille = strB.length();
                }
            }
            str = strB.toString();
            
            return str;
    }
}
