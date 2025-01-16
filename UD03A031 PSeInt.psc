Proceso UD03A031
	Definir num1, num2, num3 Como Entero;
	Escribir "Introduzca el primer número" Sin Saltar;
	Leer num1;
	Escribir "Introduzca el segundo número" Sin Saltar;
	Leer num2;
	Escribir "Introduzca el tercer número" Sin Saltar;
	Leer num3;
	
	Si num1=num2 y num2=num3 Entonces
		Escribir "Los tres números son iguales";
	SiNo
		Si num1<>num2 y num2<>num3 y num1<>num3 Entonces
			Escribir "Ningún número es igual";
		SiNo
		Escribir "Sólo hay 2 números iguales";
	FinSi
FinSi

	
FinProceso
