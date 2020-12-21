'''
Created on 5 dic. 2019

@author: Ruby

'''
print("Las temperaturas deben ser con el formato 34.12C o  78.4F")
cantidad = int(input("Cuantas temperaturas desea ingresar?"))

far=[]
cen=[]
temperaturas=[]
for i in range(cantidad):
    temperaturas.append(input(f"Ingresa temperatura {i+1}:").upper())
    

    
for i in range(len(temperaturas)):
    tem = temperaturas[i]
    letra = tem[-1]
    numero= tem[0:len(tem)-1]
    if(letra == "C"):
        cen.append(numero)
    elif (letra == "F"):
        far.append(numero)
print(far)
print(cen)        
        
sumacen=0        
for i in range(0,len(cen)):
    #print(cen[i])
    sumacen += float(cen[i])    
print(f"Promedio de grados centigrados: {sumacen/len(cen)}")
    
sumafar=0
for i in range(0,len(far)):
    sumafar += float(far[i])
print(f"Promedio de grados fahrenheit: {sumafar/len(far)}")

    
    


    
