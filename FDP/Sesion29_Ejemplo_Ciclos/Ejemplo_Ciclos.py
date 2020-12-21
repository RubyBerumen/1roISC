'''
Created on 28 nov. 2019

@author: Ruby
'''

'''
    ESTRUCTURAS DE CONTROL
    
        condicionales
            IF-THEN-ELSE
            
        Repeticion
            FOR
            WHILE
                Sintaxis: while(condicion):
                            codigo


'''

print("Estructura while")

num = int (input("Ingresa un numero para obtener su tabla de multiplicar: "))
lim = int (input("Ingresa el limite: "))

i=1
while(i<=lim):
    print(num*i)
    i+=1
    
i=1
while(i<=lim):
    print(num, "*", i, "=", num*i, end=" ")
    i+=1

print("Instruccion FOR")

for i in [1,2,3]:
    print(i)
    


for i in range(10):
    print(i)
    
for i in range(1,11):
    print(i)

for i in range(100,111,2):
    print(i)
 
 
for i in range(300,200,-5):
    print(i, end=" ")   
    

    
for i in range(1,11):
    for j in range(1,11):
        print(f"[{i},{j}]")
    print("------")
    
        






print("Ciclos (Break)")
for i in range(1,101):
    print(i)
    if (i==20):
        print(i)
        break














