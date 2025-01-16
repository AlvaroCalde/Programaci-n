Proceso UD03A025
	Definir num1, num2, num3 Como Entero;
	Escribir "Introduzca el primer número" Sin Saltar;
	Leer num1;
	Escribir "Introduzca el segundo número" Sin Saltar;
	Leer num2;
	Escribir "Introduzca el tercer número" Sin Saltar;
	Leer num3;
	
	Si num3-num1<num2-num3 Entonces
		Escribir "El tercer número está más cerca del primero";
	SiNo
		Escribir "El tercer número está más cerca del segundo";
	FinSi
	
FinProceso
