Proceso UD03A027
	Definir anyo Como Entero;
	Escribir "Introduzca un a�o" Sin Saltar;
	Leer anyo;
	
	Si anyo%400=0 o anyo%4=0 y anyo%100<>0 Entonces
		Escribir "Es un a�o bisiesto";
	SiNo
		Escribir "No es un a�o bisiesto";
	FinSi
	
FinProceso
