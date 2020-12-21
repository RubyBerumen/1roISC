'''
Created on 21 may. 2020

@author: Ruby
'''

class Perro:
    pass

class Auto: 
    pass

#Creacion de instancias

perrito1 = Perro
print(perrito1)

perrito2 = Perro
print(perrito2)
print(type(perrito2))


class OnClickListener:
    '''clase que permite crear objetos para eventos de interfaces graficas'''
    pass

#funcion
def crearGrupo():
    pass

class Alumno:
    '''Docstring --> Definicion del fincionamiento de la clase'''
    '''Clase que permite la creacion de objeto s tipo alumno'''
    
    #variables de clase o (estaticas (Java)
    
    numControl = ""
    nombre = ""
    primerAp = ""
    segundoAP = ""
    edad = 0
    semestre = 0
    carrera = ""
    
    #constructor(es)
    def __init__(self, numControl, nombre, primerAp, segundoAp, edad, semestre, carrera):
        self.numControl=numControl
        self.nombre = nombre
        self.primerAp = primerAp
        self.segundoAp = segundoAp
        self.edad = edad
        self.semestre = semestre
        self.carrera = carrera
    
    #destructores
    def __del__(self):
        #print("Invocando al destructor de alumno")
        pass
    
    
    #getters y setters
    
    #otros metodos
    def crearGrupo(self):
        pass
    
    
    def mostrarAtributos(self):
        print(f"Numero de control: {self.numControl}")
        print(f"Nombre: {self.nombre}")
        print(f"Primer Apellido: {self.primerAp}")
        print(f"segundo Apellido: {self.segundoAp}")
        print(f"edad: {self.edad}")
        print(f"semestre: {self.semestre}")
        print(f"carrera: {self.carrera}")
    
    #sobreescritura otros metodos heredados
    
    
#--------------------------------------------------------------------------------------------------
print("------------------------Alumno 1---------------------------")
a1= Alumno("S19070080","Ruby","Pinedo","Berumen",18,2,"ISC")  
print(a1)  
print(f"Numero de control: {a1.numControl}")
print(f"Nombre: {a1.nombre}")
print(f"Primer Apellido: {a1.primerAp}")
print(f"segundo Apellido: {a1.segundoAp}")
print(f"edad: {a1.edad}")
print(f"semestre: {a1.semestre}")
print(f"carrera: {a1.carrera}")
print("\n")   

print("------------------------Alumno 2---------------------------")
a2 =Alumno("S19070080","Ruby","Pinedo","Berumen",18,2,"ISC")
a2.mostrarAtributos()
    





print("=================================================================")
Alumno.carrera = "LA"



    
    
    

