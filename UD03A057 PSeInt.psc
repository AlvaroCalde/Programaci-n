Proceso UD03A057
	Definir num,i,div Como Entero;
	Definir acumulador Como Real;
	Definir perfecto Como Logico;
	perfecto<-Falso;
	Escribir "Introduce un número entero positivo: " Sin Saltar;
	Leer num;
	acumulador<-0;
	
	Para i<-1 Hasta num/2 Con Paso 1 Hacer
		Si num%i==0 Entonces
			div<-num/i;
			acumulador<-acumulador+div;
			Si acumulador==num Entonces
				perfecto<-Verdadero;
			FinSi
		FinSi
	FinPara
	
	Si perfecto Entonces
		Escribir "Es perfecto";
	SiNo
		Escribir "No es perfecto";
	FinSi
	
FinProceso
