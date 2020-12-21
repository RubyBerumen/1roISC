'''
Created on 27 nov. 2019

@author: Ruby
'''
print("===Programa que convierte una medida dada en pies y lo transforma en \n"
"yardas, pulgadas, centimetros y metros===\n")

pies = float (input("Ingresa la cantidad de pies: \n"))

yardas = pies/3
pulgadas = pies*12
centimetros = pulgadas*2.54
metros = pies/3.281

print(f"Yardas: {yardas:.2f}")
print(f"Pulgadas: {pulgadas:.2f}" )
print(f"Centimetros: {centimetros:.2f}")
print(f"Metros: {metros:.2f}" )


