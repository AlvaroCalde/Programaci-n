Proceso UD03A064
	Definir  n,i Como Entero;
	Definir primo Como Logico;
	
	primo<-Falso;
	Escribir "Introduzca un n�mero entero positivo" Sin Saltar;
	Leer n;
	
	Mientras n<=0 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca otro n�mero" Sin Saltar;
		Leer n;
	FinMientras
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si n%i==0 Entonces
			primo<-Verdadero;
			Escribir i;
		FinSi
	FinPara
	
	
	
	
FinProceso
