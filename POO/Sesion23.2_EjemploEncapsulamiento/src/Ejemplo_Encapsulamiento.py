'''
Created on 28 may. 2020

@author: Ruby
'''

class Auto:
    '''clase para crear objetos de tipo auto'''
    
    def __init__(self, marca="ND", precio=0.0):
        self.marca=marca
        #para simular el encapsulamiento se añade guioes bajos a los
        self.__precio=precio
        
    #getters y setter
    def getPrecio(self):
        return self.__precio
    def detPrecio(self,precio):
        self.__precio = precio    
        
        
    def __str__(self):
        return f"Auto  \nMarca: {self.marca}\nPrecio: {self.__precio}"

#==========================Pruebas===============================

a1 = Auto ("1",1.0)
print(a1)
print(a1.marca)

print(a1.getPrecio())

