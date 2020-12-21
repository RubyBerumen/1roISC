'''
Created on 29 nov. 2019

@author: Ruby
'''
print("===Programa que determina si un solicitante puede lograr un prestamo===")

nombre = str(input("Ingresa tu nombre:"))
historiaC = str(input("Ingresa tu historia crediticial: 1)buena 2)mala")).lower()
cantidad = float(input("Ingresa la cantidad a pedir:"))
salarioA = float(input("Ingresa tu salario anual:"))
propiedades = float(input("Ingresa el valor de otras propiedades:"))
puntos = int 


if(historiaC=="m"):
    print("No se le hara el prestamo ")   
    
if(historiaC=="b"):
    if(salarioA>=(cantidad*.50)):
        puntos+=5
    elif(salarioA>=(cantidad*.25) and salarioA<=(cantidad*.50)):
        puntos+=3
    elif(salarioA>=(cantidad*.10) and salarioA<=(cantidad*.25)):
        puntos+=1
    elif(propiedades>=(cantidad*.50)):
        puntos+=5
    elif(propiedades==cantidad and propiedades<(cantidad*2)):
        puntos+=3
        
elif(puntos>=6):
    print(f"Se le dara un prestamo de: ${cantidad:.2f}")
    
    
        