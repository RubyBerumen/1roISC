'''
Created on 27 nov. 2019

@author: Ruby
'''
print("===Programa que muestra si una cantidad de grados FAHRENHEIT convertidos a CENTIGRADOS, \n"
"es normal o congelante===\n")

gradosF = float(input("Ingresa la cantidad de grados Fahrenheit: \n"))

gradosC = (gradosF-32)/1.8

print(f"Grados centigrados: {gradosC:.2f}")

if (gradosC <= 0):
    print("La temperatura es CONGELANTE")
    
else :
    print("La temperatura es NORMAL")
