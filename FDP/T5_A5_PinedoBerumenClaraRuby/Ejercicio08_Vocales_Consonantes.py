'''
Created on 4 dic. 2019

@author: Ruby
'''
print("Programa que lee una cadena e indica CUANTAS letras\n",
"son VOCALES y cuantas son CONSONANTES\n")

palabra = input("Ingresa una palabra: \n")

vocales=0

for i in palabra:
    if(i=="a" or i=="e" or i=="i" or i=="o" or i=="u"):
        vocales =vocales + 1
       
consonantes = len(palabra)-vocales       
print(f"Numero de vocales: {vocales}")
print(f"Numero de consonantes: {consonantes}")
