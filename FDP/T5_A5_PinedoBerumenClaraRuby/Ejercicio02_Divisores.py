'''
Created on 4 dic. 2019

@author: Ruby
'''
print("Programa que muestra los divisores de un numero ingresado desde teclado\n")

numero = int (input("Ingresa un numero: "))

print(f"Los divisores del numero son: ")

for i in range(1,numero):
    if (numero % i == 0):
        print(int(i))
print(numero)



