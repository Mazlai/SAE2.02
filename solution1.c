#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "solution.h"

/** Permet de supprimer seulement les espaces individuels d'une chaîne de caractère dans une nouvelle chaîne de caractère
 * @param IN chaine : La chaîne de caractère à tester
 **/  
char* erase(char* chaine) {
  //Déclaration des attributs nécessaires
  char* newchaine = calloc(strlen(chaine),sizeof(int));
  int i = 0;
  int j = 0;
   
   while (chaine[i] != '\0') //Tant que la dernière case du tableau n'est pas atteinte
   {
       //Si des espaces consécutifs sont présents dans la chaines de caractères
      if ((chaine[i] == ' ' && chaine[i+1] != ' ' && chaine[i-1] != ' ') != 1) {
        newchaine[j] = chaine[i];
        j++;
      }
      i++;
   }
   
   //Dernière case du tableau
   newchaine[j] = '\0';

   //Affichage de la nouvelle chaîne (en respectant les conditions)
   printf("Après la suppression des espaces :'%s' ", newchaine);
    
   //Libération de la mémoire 
   free(newchaine);
}
