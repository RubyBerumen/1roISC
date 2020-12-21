'''
Created on 5 dic. 2019

@author: Ruby
'''

print("Programa que lee calificaciones\n")

numCal = int(input("Cuantas calificaciones desea ingresar?"))


def eliminar_repetidos(cals): 
    i=0
    while (i<len(cals)):
    #for i in range(0,(len(cals)-1)):
        j=i+1
        while(j<len(cals)):
        #for j in range(i+1,(len(cals))):
            if (cals[i]==cals[j]):
                del cals[j]
                #print(cals)
            j+=1
        i+=1       
    return cals           
                       
 
def leer_calificaciones():
    
    calificaciones=[]
    for i in range(numCal):
        calificaciones.append(float(input(f"Ingresa calificaion {i+1}:")))
        
    calificaciones=eliminar_repetidos(calificaciones)
    print(calificaciones)
    
    
       
        
leer_calificaciones()


