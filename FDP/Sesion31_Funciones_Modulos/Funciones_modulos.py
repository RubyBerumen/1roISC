'''
Created on 4 dic. 2019

@author: Ruby15
'''
'''
    Funciones - Definiciones
    
        
        Matematica
        
            Relacion entre datos, con base en una entrada,
            se determina la salida
            
            f(x) = x2 + x3  
            
        Programcion
        
            Porcion de codigo que puede ser utilizado varias 
            veces dentro del programa
            
            Puede o no tener parametros de funcionamiento
            
            *Pueden o no retornar un resultado; a estos ultimos
            se les conoce como PROCEDIMIENTOS
            
        Sintaxis en PYTHON
        
            def nombte_funcion(parametro(s) ):
                codigo
                codigo
                ...
                return valor

'''


def saludo():
    pass

def saludos():
    print("Magia magia")
    print("Con funciones")
    
    
''' Invocar funcion'''
    
saludo()
saludos()
#..........................PARAMETROS (variables)
def saludos_con_parametros(nombre,edad):
    carrera = "ISC"
    print("hola")
    print(f"{nombre}")
    print(f"Tu edad es: {edad}")
    
#.......................ARGUMENTOS
saludos_con_parametros("Ruby", 18)



def calcular_edad(nombre, anioNac):
    edad = 2019-anioNac
    print(f"Hola {nombre}, tu edad es: {edad}")
    
calcular_edad("Juan ", 2000)

#-------------------------------------------------------------------------
print("==============================================")

def calcular_edad2(nombre, anioNac):
    edad = 2019 -anioNac
    
    return edad

print(calcular_edad("Ana", 2001))

dato = calcular_edad2("Maria", 1990)

print("==============================================")

def calcular_edad3(nombre, anioNac):
    return 2019 -anioNac

dato = calcular_edad3("x", 1995)
print(dato)

print("==============================================")

calificaciones =[90,80,50,30,70,100,20]


#Mostrar los datos de las calificaciones
def mostrar_vector(vectorC):
    for i in range(len(calificaciones)):
        print(calificaciones[i])


mostrar_vector(calificaciones)

    
#'ELIMINAR' Calificaciones reprobatorias(sustituir por -1)

for i in range(len(calificaciones)):
    if(calificaciones[i]<70):
        calificaciones[i]= -1

for i in range(len(calificaciones)):
    print(calificaciones[i])
    
    
    
# 'ELIMINAR' calificaciones deno excelencia (95) (sustituir por -99)
for i in range(len(calificaciones)):
    if(calificaciones[i]<95):
        calificaciones[i]= -99

for i in range(len(calificaciones)):
    print(calificaciones[i])
    
    















