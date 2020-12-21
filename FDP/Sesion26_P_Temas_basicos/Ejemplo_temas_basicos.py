'''
Created on 22 nov. 2019

@author: Ruby 
'''

'''
    Diferencias con JAVA
    0)SINTAXIS
    1) No hay punto y coma al final de las instrucciones
    2) SUPER IMPORTANTE la SANGRIA o INDENT, no debe de llevar
    3) No hay declaracion de variables
    
        PYTHON es fuertemente tipado, pero de tipado dinamico 
        JAVA tambien es fuertemente tipado pero de tipado estatico
        
            //declaracion 
            int edad

    NOTA: NO UTILIZAR ENIE ni ACENTOS
'''


edad = 30 
print (edad)
print(type(edad))

# tipos de datos

bandera1 = True
bandera = False

edad = 15

temperatura = 26.86

nombre = "Ruby"

primerApellido = "Berumen"

numeroComplejo = 3 + 4j

print (type(numeroComplejo))

print("============================")

print("Ingresa tu nombre: ")
nombre = input()

print("Hola " + nombre)

anioNac = input("Ingresa tu anio de naciomiento: ")#input siempre devuelve una cadena

print("Tu anio de nacimiento es", anioNac)
print("El anio actual es ", 2019)

edad = 2019 - int(anioNac)

print("Tu edad es: " + str(edad))
      
print("Tu edad es: " , edad)    

print(7 + 8)
print(7 - 8)
print(7 * 8)
print(7 / 8)
print(7 // 8)#division entera
print(7 % 8)
print(7 ** 8)#potencia

print ("Magia magia" * 3)




