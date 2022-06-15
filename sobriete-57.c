char* erase(char* chaine) {
    int i = 0, j = 0;
    int taille = strlen(chaine);
    char* newChaine = malloc( sizeof(char) * taille);
    
    while(chaine[i] != '\0'){
        if(chaine[i] != ' '){
          newChaine[j] = chaine[i];
          j++;
 
        }else if(chaine[i] == ' ' && chaine[i+1] == ' '){
          newChaine[j] = chaine[i];
          j++;
 
        }else if( i > 0 && chaine[i] == ' ' && chaine[i-1] == ' '){
          newChaine[j] = chaine[i];
          j++;
 
        }
    i++;
 
    }
    
    newChaine[j] = '\0';
 
    return newChaine;
}
