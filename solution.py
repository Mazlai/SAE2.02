# return string without spaces
def erase(cc):
    """
    Removes only single spaces from given string.
    :param text : string to edit
    :return : edited string
    """
    listwords = list(cc)    
    for i, char in enumerate(listwords):
        wordslength = len(listwords)
        if (char == " " and wordslength == 1) or (char == " "
          and listwords[max(i-1, int(wordslength > 1))] != " " 
          and listwords[min(i+1, wordslength-int(wordslength > 1)*2)] != " "):
            del listwords[i]
    return "".join(char for char in listwords)
