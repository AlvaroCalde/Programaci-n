Proceso UD03A027
	Definir anyo Como Entero;
	Escribir "Introduzca un año" Sin Saltar;
	Leer anyo;
	
	Si anyo%400=0 o anyo%4=0 y anyo%100<>0 Entonces
		Escribir "Es un año bisiesto";
	SiNo
		Escribir "No es un año bisiesto";
	FinSi
	
FinProceso
