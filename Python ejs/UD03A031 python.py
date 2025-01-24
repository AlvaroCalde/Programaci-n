print("Introduce el primer número")
num1= int(input())
print("Introduce el segundo número")
num2= int(input())
print("Introduce el tercer número")
num3= int(input())

if num1==num2 and num2==num3:
    print("Los tres números son iguales")

elif num1==num2 or num2==num3:
    print("Sólo dos números son iguales")
elif num1!=num2 and num2!=num3:
    print("Ningún número es igual")