'''
Created on 4 dic. 2019

@author: Ruby
'''
print("Programa que muestra una figura con la altura ingresada por el usuario\n")

altura = int (input("Ingresa la altura:"))

for i in range(altura):
    for j in range(10):
        print("@",end=" ")
    print("\n")


