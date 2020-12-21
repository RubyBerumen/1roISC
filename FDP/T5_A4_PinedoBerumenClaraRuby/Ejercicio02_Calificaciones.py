'''
Created on 29 nov. 2019

@author: Ruby
'''
print("===Programa que muestra si el promedio de 5 calificaciones es Excelente, bueno, regular o terrible====")

cal1 = int(input("Ingresa la calificacion 1: "))
cal2 = int(input("Ingresa la calificacion 2: "))
cal3 = int(input("Ingresa la calificacion 3: "))
cal4 = int(input("Ingresa la calificacion 4: "))
cal5 = int(input("Ingresa la calificacion 5: "))

prom = (cal1+cal2+cal3+cal4+cal5)/5
print("El promedio es: ", prom)

'''
100 - 90        Excelente
89 - 80         Bien
79 - 70         Regular                
69 o menor      Terrible 
'''
if(prom>=90 and prom<=100):
    print("Tu promedio es Excelente!")
    
elif(prom>=80 and prom<90):
    print("Tu promedio es Bueno!")
    
elif(prom>=70 and prom<80):
    print("Tu promedio es Regular!")
    
elif(prom<70):
    print("Tu promedio es Terrible!")

else :
    print("Numero incorrecto")


