print("Introduzca el año")
anyo= int(input())

if anyo%100==0 or anyo%4==0 and anyo%100!=0:
    print("Es año bisiesto")
else:
    print("El año no es bisiesto")