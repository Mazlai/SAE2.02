"""
import timeit


moncode = '''
def erase(s="Cou cou  J M  B"):
    nbIterations = 0
    res = ""
    spaces = 0

    for c in s:
        if(c is " "):
            spaces += 1
        else:
            res += " " * spaces + c if spaces > 1 else c
            nbIterations = nbIterations + 1
            spaces = 0

    nbIterations = nbIterations + 1

    print(nbIterations)
    return res + " " * spaces if spaces > 1 else res
'''

print("Temps d'exécution du programme : ",
       timeit.timeit(stmt = moncode,
                     number = 100000
                     ))
"""

def erase(s):
    nbIterations = 0
    res = ""
    spaces = 0

    for c in s:
        if(c is " "):
            spaces += 1
        else:
            res += " " * spaces + c if spaces > 1 else c
            nbIterations = nbIterations + 1
            spaces = 0

    nbIterations = nbIterations + 1

    print(nbIterations)
    return res + " " * spaces if spaces > 1 else res

print(bonmot2(" Cou cou  J M  B "))
