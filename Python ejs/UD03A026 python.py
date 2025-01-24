print("Introduzca las horas")
horas= int(input())
print("Introduzca los minutos")
minutos= int(input())
print("Introduzca los segundos")
segundos= int(input())

if horas<=23 and horas>=0 and minutos<=59 and minutos>=0 and segundos<=59 and segundos>=0:
    print("La hora es correcta")
else:
    print("La hora es incorrecta")    