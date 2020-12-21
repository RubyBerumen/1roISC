'''
Created on 28 nov. 2019

@author: Ruby
'''
print("===Programa que lee tres numeros e indica cual es el mayor===\n")


        
num1 = float(input("Ingrese el valor del numero 1: "))
num2 = float(input("Ingrese el valor del numero 2: "))
num3 = float(input("Ingrese el valor del numero 3: "))
        
if(num1>num2 and num1>num3):
    print("El mayor es el numero 1  ")
        
elif(num2>num1 and num2>num3):
    print("El mayor es el numero 2  ")
        
elif(num3>num2 and num3>num1):
    print("El mayor es el numero 3  ")
        
