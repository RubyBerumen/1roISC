'''
Created on 28 nov. 2019

@author: Ruby
'''
print("===Programa que pide al una temperatura en grados centigrados y  pregunta\n"
 "al usuario si desea convertir a  Faherenheit o Kelvin===\n")

gradosC = float(input("Ingresa los grados centigrados: "))

print("1) Convertir a grados Fahrenheit")
print("2) Convertir a grados Kelvin")
opcion = int(input("Elige una opcion: "))

gradosF = (gradosC*1.8)+32
gradosK = (gradosC+273.15)

if(opcion == 1):
    print(f"Grados Fahrenheit: {gradosF:.2f}")
    
elif(opcion == 2):
    print(f"Grados Centigrados: {gradosK:.2f}")


