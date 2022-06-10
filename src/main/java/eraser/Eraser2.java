package eraser;

public class Eraser2 {
    /** Permet de modifier la chaîne de caractère renseignée en paramètre
     * @param IN str : la chaîne de caractère
     * @return la nouvelle chaîne de caractère avec les traitements effectués
     **/ 
    public static String erase(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
        
        String newstring = "";
        
        //Vérification se réalisant en début de chaîne de caractère
        if(str.length() > 1) {
            if(str.charAt(0) != ' ' || str.charAt(0) == ' ' && str.charAt(1) == ' ') {
                newstring += String.valueOf(str.charAt(0));
            }
        }
        
        //Vérification se réalisant en milieu de chaîne de caractère
        for(int i = 1; i < str.length() - 1 ; i++) {
            if(str.charAt(i) != ' ' || (str.charAt(i-1) == ' ' || str.charAt(i+1) == ' ')) {
                newstring += String.valueOf(str.charAt(i));
            }
        }
        
        //Vérification se réalisant en fin de chaîne de caractère
        if(str.length() > 1) {
            if(str.charAt(str.length() - 1) != ' ' || str.charAt(str.length() - 2) == ' ') {
                newstring += String.valueOf(str.charAt(str.length() - 1));        
            }
        }
                    
        return s1;
        
    }
}
