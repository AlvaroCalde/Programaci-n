contador=0
acumulador=0
print("Introduzca el número")
num=int(input())

while num >= 1 and num <= 10:
    acumulador=acumulador+num
    contador +=1
    print("La media es. "+ str(acumulador/contador))
    break 
else:
    if contador==0:
        print("No se puede hacer la media")
    
    