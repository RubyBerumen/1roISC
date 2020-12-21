'''
Created on 4 dic. 2019

@author: Ruby
'''
print("Programa que llena un vector con temperaturas y pregunta al usuario cuantas desea ingresar\n"
"se muestran las temperaturas mayores y menores al promedio")
print("Las temperaturas se ingresaran con el formato 34.12\n")

cantidad = int(input("Cuantas temperaturas desea ingresar"))

sumatem = 0

temperaturas=[]
for i in range(cantidad):
    temperaturas.append(float(input("Ingresa temperatura")))
    sumatem = sumatem + temperaturas [i]

promedio = sumatem/cantidad


print("Temperaturas mayores al promedio:")
for i in range(len(temperaturas)):
    if (temperaturas[i]>promedio):
        print(temperaturas[i])
        
print("Temperaturas menores al promedio:")
for i in range(len(temperaturas)):
    if (temperaturas[i]<promedio):
        print(temperaturas[i])


