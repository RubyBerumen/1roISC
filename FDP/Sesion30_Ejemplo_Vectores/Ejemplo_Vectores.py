'''
Created on 2 dic. 2019

@author: Ruby
'''
'''
En python no existen los arrays de forma nativa, solo las listas

Pueden ser implementados con un modulo llamado 'array'

Las listas son una implementacion mas poderosa de los arrays
 
'''
edades = [20, 36, 37, 18]

temperaturas = []
#temperaturas[0] = 32.25  NO SE PERMITE EN LAS LISTAS

# para guardar informacion en un vector se usa la funcion APPEND
temperaturas.append(32.54)

print(edades[0])
print(len(edades))
print(len(temperaturas))

vectorMagico = ["Ruby", 30, "Berumen", 50, True, 56.38]

print("Cuantas calificaciones deseas ingresar: ")
cantidad=int(input())

calificaciones=[]
for i in range(cantidad):
    calificaciones.append(int(input("Ingresa calificacion: ")))
    
print(calificaciones)



