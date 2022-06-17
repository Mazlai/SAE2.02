"""import timeit

moncode = '''
def bonmot2(mot="Cou cou  J M  B"):
    nbIterations = 0
    if mot == " " or mot == "":
        return ("")
        nbIterations = nbIterations + 1
    else:
        if mot[0] == " " and mot[1] != " ":
            mot = mot[:0] + "" + mot[ 1:]
            nbIterations = nbIterations + 1

        if mot[-1] == " " and mot[-2] != " ":
            mot = mot[:-1] + ""
            nbIterations = nbIterations + 1

        ajout = 0
        taille = len(mot)
        i=0
        while i<taille-1:
            nbIterations = nbIterations + 1
            if mot[i] == " ":
                nbIterations = nbIterations + 1
                if mot[i + 1] != " " and mot[i - 1] != " ":
                    mot = "  " + mot[:i] + "" + mot[i + 1:]
                    ajout += 2
                    taille+=1
                    nbIterations = nbIterations + 1
            i+=1

        mot = mot[(ajout):]

        print(nbIterations)
        return(mot)
'''

print("Temps d'exécution du programme : ",
       timeit.timeit(stmt = moncode,
                     number = 100000
                     ))"""

def bonmot2(mot):
    nbIterations = 0
    if mot == " " or mot == "":
        return ("")
        nbIterations = nbIterations + 1
    else:
        if mot[0] == " " and mot[1] != " ":
            mot = mot[:0] + "" + mot[ 1:]
            nbIterations = nbIterations + 1

        if mot[-1] == " " and mot[-2] != " ":
            mot = mot[:-1] + ""
            nbIterations = nbIterations + 1

        ajout = 0
        taille = len(mot)
        i=0
        while i<taille-1:
            nbIterations = nbIterations + 1
            if mot[i] == " ":
                if mot[i + 1] != " " and mot[i - 1] != " ":
                    mot = "  " + mot[:i] + "" + mot[i + 1:]
                    ajout += 2
                    taille+=1
                    nbIterations = nbIterations + 1
            i+=1
            nbIterations = nbIterations + 1

        mot = mot[(ajout):]

        print(nbIterations)
        return(mot)

print(bonmot2("Cou cou  J M  B"))
