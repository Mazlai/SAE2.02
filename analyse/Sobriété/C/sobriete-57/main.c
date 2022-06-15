#include <time.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "sobriete-57.c"

int main() {
  float time = 0;
  
  printf("%s\n",erase("Cou cou  J M  B"));
  
  time = clock();
  printf("\nTemps d'execution : %.2f ms", time);
  return 0;
}
