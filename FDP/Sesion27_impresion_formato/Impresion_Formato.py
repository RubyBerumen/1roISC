'''
Created on 25 nov. 2019

@author: Ruby
'''
print("==Programa que calcula el salario de un trabajador==")

nombre = input("Ingresa tu nombre: ")
diasTrabajados = int(input("Ingresa los dias trabajados: "))
pagoPorHora = float(input("Ingresa el pago por hora: "))
diasExtra = int(input("Ingresa los dias Extra trabajados: "))

salarioBruto = diasTrabajados * pagoPorHora + (pagoPorHora*2*diasExtra)

salarioNeto = salarioBruto * 0.86

#Impresion con concatenacion
print("Hola " + nombre + ", tu salario neto es de: " + str(salarioNeto))

#Impresion con parmetros
print("Hola", nombre, ", tu salario neto es de: ",salarioNeto)

#forma 2:
print("Hola {}, tu salario neto es de: {}".format(nombre, salarioNeto))


#forma 3a de impresion: cadenas f
print(f"Hola {nombre}, tu salario neto es de: {salarioNeto}")

#forma 3b de impresion: cadenas f con decimales
print(f"Hola {nombre}, tu salario neto es de: {salarioNeto:.2f}")

#==============================================================
salarioCuadrado = salarioNeto ** 2

print (f"Salario al cuadrado: {salarioCuadrado:.2f}")

import math
salarioCuadrado = math.pow(salarioNeto, 2)

print(math.pi)















