import math

SustanciaA = float(input("Gramos: "))
SustanciaB = float((SustanciaA * 2) + 4)
SustanciaC = float((SustanciaA + SustanciaB) / 5)

print(round(SustanciaA), round(SustanciaB), math.floor(SustanciaC))

if SustanciaC <= 20:
    print("uno")
elif SustanciaC <= 40:
    print("dos")
elif SustanciaC <= 80:
    print("tres")
elif SustanciaC > 80:
    print("cuatro")