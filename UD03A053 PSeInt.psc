Proceso UD03A053
	Definir num Como Entero;
	Definir i Como Entero;
	Definir acumulador Como Real;
	
	Escribir "Introduzca entero (1-10)" Sin Saltar;
	Leer num;
	
	Mientras num<1 o num>10 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca entero (1-10)" Sin Saltar;
		Leer num;
	FinMientras
	
	Para i<-num Hasta 0 Con Paso 1 Hacer
		i<-num;
		acumulador<-i*num;
		Escribir "El resultado es ",acumulador;
	FinPara
	
	
	
	
	
	
FinProceso
