# return string without spaces
def erase(cc):
    """
    Removes only single spaces from given string.
    :param text : string to edit
    :return : edited string
    """
    listedText = list(cc)    
    for i, char in enumerate(listedText):
        tailleText = len(listedText)
        if (char == " " and tailleText == 1) or (char == " "
          and listedText[max(i-1, int(tailleText > 1))] != " " 
          and listedText[min(i+1, tailleText-int(tailleText > 1)*2)] != " "):
            del listedText[i]
    return "".join(char for char in listedText)
