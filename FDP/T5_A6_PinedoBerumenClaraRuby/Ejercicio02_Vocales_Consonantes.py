'''
Created on 4 dic. 2019

@author: Ruby
'''
print("Programa que lee una nombre completo e indique cuantas letras son vocales y\n" 
"cuantas consonantes, ademas si la cantidad de  vocales y consonantes es par o impar\n")

nombreC = input("Ingresa tu nombre completo:").lower()

vocales=0
espacios=0

for i in nombreC:
    if(i=="a" or i=="e" or i=="i" or i=="o" or i=="u"):
        vocales =vocales + 1
    if(i==" "):
        espacios = espacios +1    
        
       
consonantes = len(nombreC)-vocales-espacios       
print(f"Numero de vocales: {vocales}")
print(f"Numero de consonantes: {consonantes}")
