'''
Created on 2 dic. 2019

@author: Ruby
'''
from pip._vendor.idna.core import unichr
cadena = "Ingenieria en Sistemas Computacionales - Tec Jerez"

print(cadena.capitalize())

c1 = cadena.lower()

print(c1)
print(cadena)
print(cadena.upper())

cadena = cadena.upper()

print(cadena.replace("a".upper(),"@"))

print(cadena.count("Z"))
print(cadena.count("1"))

print(cadena.isdigit())
print("123".isdigit())
print("0123".isdigit())#num octal
print("0xCAFE".isdigit())#num hexadecimal

print("8.9".isdecimal())#

print(cadena.split())#regresa un vector

#longitud cadenas
print(len(cadena))

#subcadenas
'''
En python no existe substring
se utiliza la tecnica SLICING [:]
'''
print(cadena[:len(cadena)//2])
print(cadena[10:20])
print(cadena[10:])

print(cadena[-1])
print(cadena[-2])
print(cadena[4])
print(cadena[-50:])

#charAt
print(cadena[0:1])

#ASCII caracter
print(ord("A"))
print(chr(64))
print(unichr(64))
print(unichr(5678))





