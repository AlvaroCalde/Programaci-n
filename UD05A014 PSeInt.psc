Proceso UD05A014
	Definir i Como Entero;
	Definir vector, nombre Como Caracter;
	Dimension vector[5];
	
	Escribir "Introduzca 5 nombres: ";
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Leer vector[i];
	FinPara
	
	Escribir "Introduzca nombre a buscar";
	Leer nombre;
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Si nombre==vector[i] Entonces
			Escribir "Se encontr� el nombre";
			Escribir "En la posici�n: ",i;
		SiNo
			Escribir "No se encontr� el nombre";
		FinSi
	FinPara
	

	
FinProceso
