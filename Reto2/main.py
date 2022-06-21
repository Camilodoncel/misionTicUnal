Jugador01 = input("Iniciales jugador 01: ")
Jugador02 = input("Iniciales jugador 02: ")
Invitados = input("Iniciales invitados: ")

Puntos01 = 0
Puntos02 = 0

for Inicial in Invitados:
    if Inicial in Jugador01:
        Puntos01 += 1

    if Inicial in Jugador02:
        Puntos02 += 1

    if Puntos01 > Puntos02:
        print("1", end="")

    if Puntos01 < Puntos02:
        print("2", end="")

    if Puntos01 == Puntos02:
        print("*", end="")

    print(end="")
