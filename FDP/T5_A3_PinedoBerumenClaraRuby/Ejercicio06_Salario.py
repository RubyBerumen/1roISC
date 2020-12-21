'''
Created on 28 nov. 2019

@author: Ruby
'''
print("==Programa que calcula el salario de un trabajador==")

diasTrabajados = int(input("Ingresa los dias trabajados: "))
pagoPorHora = float(input("Ingresa el pago por hora: "))
diasExtra = int(input("Ingresa los dias Extra trabajados: "))
horasTrabajadas = int(input("Ingresa las horas trabajadas por dia:"))

if (diasExtra>5):
    diasExtra= diasExtra*horasTrabajadas*pagoPorHora*3
else:
    diasExtra= diasExtra*horasTrabajadas*pagoPorHora*2
    
salarioBruto= (diasTrabajados*horasTrabajadas*pagoPorHora)+diasExtra

if (salarioBruto>20000):
    salarioNeto = salarioBruto * 0.84
else:
    salarioNeto = salarioBruto * 0.86

print(f"Tu salario neto es de: {salarioNeto:.2f}")

