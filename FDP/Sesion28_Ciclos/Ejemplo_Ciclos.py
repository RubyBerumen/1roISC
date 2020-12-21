'''
Created on Nov 28, 2019

@author: bryan
'''

print("======instruccion WHILE======")

multiplicador = int(input("multiplicador de la tabla: "))
limite = int(input("limite de la tabla: "))

i=0
while(i<=limite):
    print(i*multiplicador, end="    ")
    i+=1
print()
for j in[1,2,3]:
    print(j, end="    ")
print()
for j in["g","g","ez"]:
    print(j, end="    ")
    
    
    print()
    
for j in range(5):
    print(j, end="    ")
    
    
print()
for x in range(100,111):
    print(x, end="    ")
    
print()
for x in range(111,100,-1):
    print(x, end="    ")

print()
for x in range(11):
    for y in range(11):
        print(f'[{x},{y}]', end="    ")
    print()


for i in range(1,100):
    print(i)
    if(i==20):
        print("dato encontrado")
        break
