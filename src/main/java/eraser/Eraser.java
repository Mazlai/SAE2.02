package eraser;

public class Eraser {
    /** Permet de modifier la chaîne de caractère renseignée en paramètre
     * @param IN str : la chaîne de caractère
     * @return la nouvelle chaîne de caractère avec les traitements effectués
     **/
    public static String erase(String str) {
        //Déclarations
        StringBuilder strB = new StringBuilder(str);
            int taille = strB.length();
            int i = 0;
        
            //Vérification de la constitution de la chaîne de caractère
            for(int i  = 0; i < taille; i++) {
                if(strB.charAt(i) == (char)32 && strB.charAt(Math.min(i+1, taille-2)) != (char)32 && strB.charAt(Math.max(i-1, 1)) != (char)32) {
                    strB.deleteCharAt(i);
                    taille = strB.length();
                }
            }
            str = strB.toString();
            
            return str;
    }

