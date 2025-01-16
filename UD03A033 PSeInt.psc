Proceso UD03A033
	Definir coeficiente1, coeficiente2 Como Entero;
	Escribir "Introduzca el primer coeficiente" Sin Saltar;
	Leer coeficiente1;
	Escribir "Introduzca el segundo coeficiente" Sin Saltar;
	Leer coeficiente2;
	
	Si coeficiente1=0 y coeficiente2=0 Entonces
		Escribir "Tiene infinitas soluciones";
	SiNo
		Si coeficiente1=0 Entonces
			Escribir "No tiene solución";
		SiNo
			Escribir "La ecuación tiene una solución que es x=",-(coeficiente2/coeficiente1);
		FinSi
	FinSi
FinProceso
