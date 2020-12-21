'''
Created on 4 dic. 2019

@author: Ruby
'''
print("Programa que obtiene el RFC de una persona\n")

nombre = input("Ingresa tu nombre: ")
apellidoPaterno = input("Ingresa tu apellido paterno: ").lower()
apellidoMaterno = input("Ingresa tu apellido materno: ")
fecha = input("Ingresa tu fecha de nacimiento en formato dd/mm/aaaa")

nombre = nombre[0:1]
apellidoPaterno1 = apellidoPaterno[0:1]
apellidoMaterno = apellidoMaterno[0:1]
anio = fecha[8:10]
mes = fecha[3:5]
dia = fecha [0:2]

vocales = ""

for i in apellidoPaterno: 
    if (i == "a" or i == "e" or i == "i" or i == "o" or i == "u"):
        vocales = vocales + i
    
primerVocal= vocales[0:1]   

#print(f"vocal1 {primerVocal}") 

rfc = (apellidoPaterno1+primerVocal+apellidoMaterno+nombre+anio+mes+dia).upper()

print(f"Su RFC es: {rfc}")





