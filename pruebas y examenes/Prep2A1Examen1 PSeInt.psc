Proceso Prep2A1Examen1
	Definir n,acumulador,cifra Como Entero;
	
	
	Repetir
		acumulador<-0;
		Escribir "Introduzca entero positivo: " Sin Saltar;
		Leer n;
		cifra<-trunc(n/10)+ n%10;
		acumulador<-acumulador+cifra;
		Escribir "Suma de las cifras: ",acumulador;
	Hasta Que n<=0
	
	
FinProceso
