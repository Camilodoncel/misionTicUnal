import json

datosLicores = input("Ingrese la estructura de datos: ")
datosLicores = json.loads(datosLicores)
ordenLicores = input("Ingrese la orden: ")

Licores = ordenLicores.split(" ")
totalOrden = 0
busquedaDeLicores = []

for licor in Licores:
    precio = datosLicores.get(licor)
    if (precio is not None):
        totalOrden += precio
        busquedaDeLicores.append(licor)

print(totalOrden)
print(" ".join(busquedaDeLicores))
