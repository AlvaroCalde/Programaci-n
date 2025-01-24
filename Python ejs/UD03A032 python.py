print("Introduce el primer ángulo (en grados)")
ang1= int(input())
print("Introduce el segundo ángulo (en grados)")
ang2= int(input())
print("Introduce el tercer ángulo (en grados)")
ang3= int(input())

if ang1+ang2+ang3==180:
    print("El triángulo puede ser: rectángulo, obtusángulo o acutángulo")
    if ang1==90 or ang2==90 or ang3==90:
        print("Este es rectángulo")
    elif ang1>=90 or ang2>=90 or ang3>=90:
         print("Este es obtusángulo")
    else:
         print("Este es acutángulo")