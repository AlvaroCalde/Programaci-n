Proceso UD03A044
	Definir num, acumulador, contador Como Entero;
	
	contador<-0;
	acumulador<-0;
	
	Repetir
		Escribir "Introduzca un número" Sin Saltar;
		Leer num;
		acumulador<- acumulador+num;
		contador<-contador+1;
	Hasta Que num>=1 y num<=10
	
	Escribir "La media es: ",acumulador/contador;
	
FinProceso
