Proceso Prep2A4Examen1
	Definir vector,i,mayor,menor,rango Como Entero;
	Dimension vector[10];
	
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		vector[i]<-azar(101);
		Escribir vector[i];
	FinPara
	
	
	mayor<-vector[0];
	menor<-vector[0];
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Si vector[i]==mayor  Entonces
			mayor<-vector[i];
		SiNo
			menor<-vector[i];
		FinSi
	FinPara
	rango<-mayor-menor;
	Escribir "Valor m�s alto: ",mayor;
	Escribir "Valor m�s bajo: ",menor;
	Escribir "Rango: ",rango;
	
	
FinProceso

	