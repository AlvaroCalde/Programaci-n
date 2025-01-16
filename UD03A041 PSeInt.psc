Proceso UD03A041
	Definir num Como Entero;
	
	
	Repetir
		Escribir "Introduzca un número entero. " Sin Saltar;
		Leer num;
		Si num%2=0 Entonces
			Escribir "Par";
		SiNo
			Escribir "Impar";
		FinSi
	Hasta Que num<=0
	


FinProceso
