def Productos(A):
    sinRepetirA = []

    for Juguete in A:
        if Juguete in A:
            sinRepetirA.append(Juguete)
    return sinRepetirA


def Faltante(L, M, N):
    posEncontradas = []
    for i in L:
        if M[i] == N:
            posEncontradas.append(i)

    return posEncontradas


def TeFaltan(L1, L2):
    listaDiferencia = []
    for Juguete in L1:
        if Juguete not in L2:
            listaDiferencia.append(Juguete)

    return listaDiferencia


def Intercambiemos (L1,L2):
    sinRepetirL1 = 0
    sinRepetirL2 = 0

    for Juguete in L1:
        if Juguete not in L2:
            sinRepetirL1 += 1

    for Juguete in L2:
        if Juguete not in L1:
            sinRepetirL2 += 1


    return(min(sinRepetirL1, sinRepetirL2))