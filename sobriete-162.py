def bonmot2(mot):

    if mot == " " or mot == "":
        return ("")
    else:
        if mot[0] == " " and mot[1] != " ":
            mot = mot[:0] + "" + mot[ 1:]

        if mot[-1] == " " and mot[-2] != " ":
            mot = mot[:-1] + ""

        ajout = 0
        taille = len(mot)
        i=0
        while i<taille-1:
            if mot[i] == " ":
                if mot[i + 1] != " " and mot[i - 1] != " ":
                    mot = "  " + mot[:i] + "" + mot[i + 1:]
                    ajout += 2
                    taille+=1
            i+=1

        mot = mot[(ajout):]
        return(mot)