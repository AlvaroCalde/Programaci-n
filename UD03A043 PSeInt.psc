Proceso UD03A043
	Definir usuario, contrasena Como Caracter;
	
	Escribir "Introduzca el usuario" Sin Saltar;
	Leer usuario;
	Escribir "Introduzca la contraseņa" Sin Saltar;
	Leer contrasena;
	
	Repetir
		Si usuario<>"admin" y contrasena<>"pas" Entonces
			Escribir "Usuario o contraseņa incorrecto";
		SiNo
			Escribir "Bienvenido ",usuario;
		FinSi
	Hasta Que usuario=="admin" y contrasena=="pas"
	
FinProceso
