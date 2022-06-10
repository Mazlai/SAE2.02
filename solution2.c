#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "solution.h"

/** Permet de supprimer seulement les espaces individuels d'une chaîne de caractère dans une même chaîne de caractère
 * @param IN chaine : La chaîne de caractère à tester
 *
 **/  

char* erase2(char* chaine) {
  //Déclaration des attributs nécessaires
  int j = 0;
  
  //Parcours la chaîne de caractère en paramètre
  for(int i = 0; chaine[i] != '\0'; i++) {
    //Si des espaces consécutifs sont présents dans la chaines de caractères
    if ((chaine[i] == ' ' && chaine[i+1] != ' ' && chaine[i-1] != ' ') != 1){
      chaine[j] = chaine[i];
      j++;
    }
  } 
 
  //Dernière case du tableau
  chaine[j] = '\0';
  
  return chaine;
}
