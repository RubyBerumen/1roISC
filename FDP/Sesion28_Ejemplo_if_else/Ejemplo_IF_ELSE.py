'''
Created on 26 nov. 2019

@author: Ruby
'''

'''
    ESTRUCTURAS DE CONTROL DE FLUJO
    
        IF - THEN - ELSE
        
        Sintaxis:
        
        if(condicion) :
            codigo a ejecutarse dentro del IF
            codigo
            codigo
        codigo fuera del IF
        
        
        if (condicion) :
            codigo IF
        else: 
            codigo del ELSE

'''
a = 9
b = 8

if (a>b) :
    print("A mayor")
    print("Fin del if")
    
if (a>b) :
    print("A mayor")
    print("fin del if")
else: 
    print("b es mayor")
    print("fin del else")
    
print("Fin del codigo")

print("----------------------------------------------------")

totalVenta = 1000
tarjetaDescuento = True

if (totalVenta>=5000) :
    #aplica descuento 5%
    pass
    if(tarjetaDescuento):
        #aplica descuento 5%
        pass
    else:
        print()
else:
    print()     
        
cadena1 = "Magia magia"
cadena2 = "Magia magia"

if(cadena1==cadena2):
    print("Cadenas iguales")
else:
    print("Cadenas diferentes")

print("----------------------OPERADORES LOGICOS------------------------------")
'''
    && AND  & --> Anivel de BITS
    || OR
    ! NOT

'''

sensor = True
temp = 30 

if(sensor==True and temp>25):
    print("Abriendo compuerta")
else:
    print ("no explotaremos")
    

if(sensor==True or temp>25):
    print("Abriendo compuerta")
else:
    print ("no explotaremos")

if(not temp==25):
    print ("No igual a 25")


print("----------------------IF-ELSE ANIDADOS------------------------------")

'''
    90-100 - A
    80-89 - B
    70-79 - C
    0-69 - D
    
'''
calificacion = 85

if(calificacion >= 90 and calificacion<=100):
    print("A")
elif (calificacion >= 80 and calificacion<90):
    print("B")
elif (calificacion >= 70 and calificacion<80):
    print("C")
elif (calificacion >= 0 and calificacion<70):
    print("D")
else:
    print("Calificaion incorrecta")











    
