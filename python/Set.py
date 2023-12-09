# ehVazio(A)

def ehVazio(A):
    return not bool(A)

# uniaoConj(A,B)
def uniaoConj(A, B):
    for i in B:
        if i not in A:
            A.append(i)
    return A

# intersConj retorna A ∩ B.
def intersConj(A,B): 
    C = []
    for i in B:
        if i in A:
            C.append(i)
    return C

def diffConj(A,B):
    C = []
    for i in A:
        if i not in B:
            C.append(i)
    return C

def diffSimConj(A,B):
    diffA = diffConj(A,B)
    diffB = diffConj(B,A)
    return uniaoConj(diffA,diffB)

def addConj(A,x):
    if x not in A:
        A.append(x)
    return A

def remConj(A,x):
    if x in A:
        A.remove(x)
    return A

def tamConj(A):
    return len(A)

def ehElemConj(A,x):
    return x in A