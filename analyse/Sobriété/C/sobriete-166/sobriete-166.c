#include <stdio.h>
#include <time.h>
 
int main(int nbrArg, char** listArg) {
  //Déclarations de variables de test
  float time = 0;
  int nbIterations = 0;
  
  if (nbrArg == 1)
    return 0;
  int a=0;
  int b=0;
 
  while(listArg[1][a] != '\0')
  {
    listArg[1][b++] = (listArg[1][a] == ' ' && listArg[1][a + 1] != ' ' && listArg[1][a - 1] != ' ') ? (listArg[1][++a]) : (listArg[1][a]);
      a++;
      nbIterations++;
  }
  listArg[1][b] = '\0';
  
  //Affichage des tests :
  time = clock();
  
  printf("[%s]", listArg[1]);
  printf("\nTemps d'execution : %.2f ms", time);
  printf("\nNombre d'itérations : %d", nbIterations);
  
  return 0;
}
