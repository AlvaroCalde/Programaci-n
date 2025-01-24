print("Introduzca las horas")
h= int(input())
print("Introduzca los minutos")
min= int(input())
print("Introduzca los segundos")
seg= int(input())

while h>=0 and h<=23 and min>=0 and min<=59 and seg>=0 and seg<=59:
    seg=h*3600+min*60+seg
    print("Los segundos totales son: "+str(seg))
    break