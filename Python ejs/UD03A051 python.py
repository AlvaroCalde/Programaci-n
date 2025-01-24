print("Introduzca un número entero positivo")
num=int(input())
if num<1 or num>5:
    print("Error en la entrada")
else:
    for num in range(num):
        print("Hola Mundo")