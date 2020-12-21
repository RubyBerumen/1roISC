'''
Created on 28 may. 2020

@author: Ruby
'''
class Alumno:
    '''Clase que permite la creacion de objeto s tipo alumno'''
    
    
    #La sobrecarga del constructor se puede crar de esta manera
    def __init__(self, numControl="", nombre="", primerAp="", segundoAp="", edad=0, semestre=0, carrera=""):
        #Atributos o variables de instancia
        self.numControl = numControl
        self.nombre = nombre
        self.primerAp = primerAp
        self.segundAp = segundoAp
        self.edad = edad
        self.semestre = semestre
        self.carrera = carrera
        self.calificaciones = []


    def mostrarAtributos(self):
        print(f"Numero de control: {self.numControl}")
        print(f"Nombre: {self.nombre}")
        print(f"Primer Apellido: {self.primerAp}")
        #print(f"Segundo Apellido: {self.segundoAp}")
        print(f"Edad: {self.edad}")
        print(f"Semestre: {self.semestre}")
        print(f"Carrera: {self.carrera}")
        
#----------------------------------------------------------------------------

a1 = Alumno("S19070","Ruby", "Pinedo", "Berumen", 18, 2,"ISC")
a1.mostrarAtributos()

a2=Alumno("1","2")
a2.mostrarAtributos()

a3=Alumno()
a3.mostrarAtributos()

a4=Alumno(None,"Clara","Pinedo","-",10,10,"isc")
a4.mostrarAtributos()

a5 = Alumno(nombre="Ruby")
a5.mostrarAtributos()




