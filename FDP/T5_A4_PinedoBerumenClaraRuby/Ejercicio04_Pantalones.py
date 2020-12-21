'''
Created on 29 nov. 2019

@author: Ruby
'''
print("===Programa que simula una tienda de pantalones y calcula el precio\n"
      "dependiendo de la cantidad que se valla a comprar===\n")

piezas = int(input("Ingresa el numero de pantalones que desea comprar: "))

if(piezas<5):
    print(f"Total a pagar: ${piezas*356.82:.2f}")
elif(piezas>=5 and piezas<12):
    print(f"Total a pagar: ${piezas*356.82*.85:.2f}")
elif(piezas>=12):
    print(f"Total a pagar: ${piezas*356.82*.70:.2f}")


