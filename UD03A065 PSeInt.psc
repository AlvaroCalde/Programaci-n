Proceso UD03A065
	Definir i,j,filas,columnas Como Entero;
	Escribir "Introduzca el n�mero de filas (2-10)" sin saltar;
	Leer filas;
	Escribir "Introduzca el n�mero de columnas (2-10)" sin saltar;
	Leer columnas;
	
	Mientras filas<2 y filas>10 y columnas<2 y columnas>10 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca el n�mero de filas (2-10)" sin saltar;
		Leer filas;
		Escribir "Introduzca el n�mero de columnas (2-10)" sin saltar;
		Leer columnas;
	FinMientras
	
	Para i<-1 Hasta filas Con Paso 1 Hacer
		Para j<-1 Hasta columnas Con Paso 1 Hacer
			Escribir "* " Sin Saltar;
		FinPara
		Escribir "";
	FinPara
	
FinProceso
