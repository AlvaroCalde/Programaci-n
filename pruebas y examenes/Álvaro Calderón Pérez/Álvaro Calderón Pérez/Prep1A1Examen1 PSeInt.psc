Proceso Prep1A1Examen1
	Definir n Como Entero;
	
	Escribir "Introduzca un entero positivo";
	Leer n;
	Escribir "Entrada: ",n;
	
	Mientras n<0 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca de nuevo un entero positivo";
		Leer n;
	FinMientras
	
	Mientras n<>1 Hacer
		Si n%2==0 Entonces
			n<-n/2;
		SiNo
			n<-n*3+1;
		FinSi
		Escribir "Salida: ",n;
	FinMientras
	
	

FinProceso
