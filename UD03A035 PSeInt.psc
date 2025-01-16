Proceso UD03A035
	Definir anyo, mes, dia Como Entero;
	Escribir "Introduzca el año" Sin Saltar;
	Leer anyo;
	Escribir "Introduzca el mes" Sin Saltar;
	Leer mes;
	Escribir "Introduzca el día" Sin Saltar;
	Leer dia;
	
	Si mes>=1 y mes<= 12 y dia=30 o dia=31 o dia=28 Entonces
		Escribir "Fecha correcta";
	SiNo
		Escribir "Fecha incorrecta";
	FinSi
	
FinProceso
