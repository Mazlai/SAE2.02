def erase(s):
    res = ""
    spaces = 0
    
    for c in s:
        if(c is " "): spaces += 1
        else:
            res += " " * spaces + c if spaces > 1 else c
            spaces = 0

    return res + " " * spaces if spaces > 1 else res