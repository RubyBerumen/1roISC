'''
Created on 27 nov. 2019

@author: Ruby
'''

print("===Programa que obtiene el valor de la Hipotenusa de un triangulo \n"
"a traves del teorema de pitagoras===\n")

cat1 = float (input("Ingresa el valor del cateto 1: "))
cat2 = float (input("Ingresa el valor del cateto 2: "))

import math

hip = math.pow(cat1, 2) + math.pow(cat2, 2)

print("El valor de la hipotenusa es: ", math.sqrt(hip))




