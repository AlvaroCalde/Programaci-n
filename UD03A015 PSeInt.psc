Proceso UD03A015
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir aux Como Entero;
	Escribir "Introduzca el primer número" Sin Saltar;
	Leer num1;
	Escribir "Introduzca el segundo número" Sin Saltar;
	Leer num2;
	
	Si num1>num2 Entonces
		aux<-num1;
		num1<-num2;
		num2<-aux;
	FinSi
	Escribir num1,",", num2;
	
FinProceso
