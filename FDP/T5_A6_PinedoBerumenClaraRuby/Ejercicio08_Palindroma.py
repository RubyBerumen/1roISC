'''
Created on 4 dic. 2019

@author: Ruby
'''
print("Programa que determina si una palabra es palindroma.\n")

palabra = input("Ingresa una palabra: \n")

if (palabra == palabra[::-1]):
    print("La palabra es palindroma")
    
else :
    print("La palabra no es palindroma")

