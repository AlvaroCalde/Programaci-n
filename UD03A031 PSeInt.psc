Proceso UD03A031
	Definir num1, num2, num3 Como Entero;
	Escribir "Introduzca el primer n�mero" Sin Saltar;
	Leer num1;
	Escribir "Introduzca el segundo n�mero" Sin Saltar;
	Leer num2;
	Escribir "Introduzca el tercer n�mero" Sin Saltar;
	Leer num3;
	
	Si num1=num2 y num2=num3 Entonces
		Escribir "Los tres n�meros son iguales";
	SiNo
		Si num1<>num2 y num2<>num3 y num1<>num3 Entonces
			Escribir "Ning�n n�mero es igual";
		SiNo
		Escribir "S�lo hay 2 n�meros iguales";
	FinSi
FinSi

	
FinProceso
