print("Introduzca el nombre de usuario")
usuario=str(input())
print("Introduzca la contraseña")
contraseña=str(input())

while usuario!="admin" or contraseña!="paso":
        print("Usuario o contraseña incorrecto")
        break
else:    
    print("Bienventido "+usuario)