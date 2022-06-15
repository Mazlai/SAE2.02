#include "solution.h"
 
char* erase(char* chaine) {
 //Ajout du nombre d'itérations
    int nbIterations = 0;
    
    int i = 0, j = 0;
    int taille = strlen(chaine);
    char* newChaine = malloc( sizeof(char) * taille);
    
    while(chaine[i] != '\0'){
        if(chaine[i] != ' '){
          newChaine[j] = chaine[i];
          j++;
          nbIterations++;
 
        }else if(chaine[i] == ' ' && chaine[i+1] == ' '){
          newChaine[j] = chaine[i];
          j++;
          nbIterations++;
 
        }else if( i > 0 && chaine[i] == ' ' && chaine[i-1] == ' '){
          newChaine[j] = chaine[i];
          j++;
          nbIterations++;
 
        }
    i++;
    nbIterations++;
 
    }

  //Affichage du nombre d'itérations
    printf("\n%d\n", nbIterations);
    newChaine[j] = '\0';
 
    return newChaine;
}
