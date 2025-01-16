Proceso UD03A051
	Definir  n Como Entero;
	Definir i Como Entero;
	Escribir "Introduzca entero (1-5)" Sin Saltar;
	Leer n;
	Mientras n<1 o n>5 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca entero (1-5)" Sin Saltar;
		Leer n;
	FinMientras
	
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir "HOLA MUNDO";
	FinPara
FinProceso
