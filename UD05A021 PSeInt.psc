Proceso UD05A021
	Definir matriz,i,j,n Como Entero;
	Definir esPositiva Como Logico;
	Dimension matriz[3,2];
	esPositiva<-Falso;
	
	Escribir "Introduce números de la matriz";
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 1 Con Paso 1 Hacer
			Leer n;
			Si n>=0 Entonces
				esPositiva<-Verdadero;
			FinSi
		FinPara
	FinPara
	
	Si esPositiva Entonces
		Escribir "MATRIZ POSITIVA";
	SiNo
		Escribir "MATRIZ NO POSITIVA";
	FinSi
	
FinProceso
