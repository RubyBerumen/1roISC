'''
Created on 29 nov. 2019

@author: Ruby
'''


print("===Prgrama que obtiene el valor de  y  a traves de la ecuacion  y=2ax^2+bx/c^3+c===")

a = int(input("Ingresa el valor de a: "))
b = int(input("Ingresa el valor de b: "))
c = int(input("Ingresa el valor de c: "))
x = int(input("Ingresa el valor de x: "))

import math

y = (2*a*math.pow(x,2)+((b*x))/(math.pow(c,3)+c))

print(f"Y = {y}")

