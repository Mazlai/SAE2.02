#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "solution1.c"
#include "solution2.c"

int main() {
    
    //Premier test
    printf("%s\n",erase("Cou cou  J M  B"));  
    //Second test
    char chaine[] = "Cou cou  J M  B";
    printf("%s\n",erase2(chaine));
    
    return 0;
}
