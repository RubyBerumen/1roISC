'''
Created on 4 dic. 2019

@author: Ruby
'''
print("Programa que lee una frase e imprime cada palabra y su\n",
      "tamanio en lineas diferentes\n")

frase = input("ingresa una frase: ")

inicio = 0

for i in range(len(frase)):
    if(i==" "):
        palabra = frase[inicio:i]
        
        print(f"La palabra {palabra} tiene {len(palabra)} caracteres" )
        
        inicio = i+1
