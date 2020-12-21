'''
Created on 6 dic. 2019

@author: Ruby
'''
candidatos = [["Dist", "Cand", "Cand", "Cand", "Cand"],
              ["    ", "  A ", "  B ", "  C ", "  D "],
              ["  1 ", " 194", "  48", " 206", "  45"],
              ["  2 ", " 180", "  20", " 320", "  16"],
              ["  3 ", " 221", "  90", " 140", "  20"],
              ["  4 ", " 432", "  50", " 821", "  14"],
              ["  5 ", " 820", "  61", " 946", "  18"]]

def impresion():
    for i in range(len(candidatos)):
        for j in range (len(candidatos[i])):
            print(candidatos[i][j], end = " ")
        print()
impresion()

print("_______________________________________")
distritos = []
def votosDistritos():
    suma=0
    for i in range(2 ,len(candidatos)):
        for j  in range(1 , len(candidatos[i])):
            suma=suma+int(candidatos[i][j])
        print(f"Numero de votos en el distrito {str(i-1)}: {suma}" )
        distritos.append(suma)
        suma=0
votosDistritos()

print("_______________________________________")
def sumaTotal():
    total=0
    for i in range(len(distritos)):
        total+= distritos[i]
      
    return total  
sumaTotal()  

def porcientoDistritos():
    suma=0
    porciento=0
    for i in range(2 ,len(candidatos)):
        for j  in range(1 , len(candidatos[i])):
            suma=suma+int(candidatos[i][j])
        porciento+= (suma*100)/sumaTotal() 
        print(f"El distrito {str(i-1)} obtuvo: {porciento:.2f}% de los votos" )   
        suma=0
        porciento=0
porcientoDistritos()

print("_______________________________________")
def votosCandidatos():
    suma=0
    for i in range(1 ,(len(candidatos)-2)):
        for j  in range(2 , len(candidatos)):
            suma=suma+int(candidatos[j][i])
        print(f"Numero de votos del candidato {candidatos[1][i]}: {suma}" )
        suma=0 
votosCandidatos()

print("_______________________________________")
def porcientoCandidatos():
    suma=0
    porciento=0
    for i in range(1 ,(len(candidatos)-2)):
        for j  in range(2 , len(candidatos)):
            suma=suma+int(candidatos[j][i])
        porciento += (suma*100)/sumaTotal()
        print(f"El candidato {candidatos[1][i]} tiene {porciento:.2f}% de los votos")
        if(porciento>50):
            print("    Candidato con mayor numero de votos")
            print("    Candidato ganador")    
        suma=0
        porciento=0  
porcientoCandidatos()  
