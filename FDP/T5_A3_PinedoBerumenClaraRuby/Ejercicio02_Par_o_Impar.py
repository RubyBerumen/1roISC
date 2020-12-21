'''
Created on 27 nov. 2019

@author: Ruby
'''
print("===Programa que lee un numero entero e indica si es par o impar===\n")

num = int (input("Ingresa un numero entero: "))

if(num%2 == 0) :
    print(f"El numero {num} es par")
else :
    print(f"El numero {num} es impar")

