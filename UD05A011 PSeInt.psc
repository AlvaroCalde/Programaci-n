Proceso UD05A011
	Definir vector,i,n Como Entero;
	Definir contador Como Entero;
	Dimension vector[5] ;
	contador<-0;
	
	Escribir "Introduzca 5 números: ";
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Leer n;
		Leer vector(n);
		Si n<0 Entonces
			contador<-contador+1;
			Escribir contador;
		FinSi
	FinPara
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir vector(n);
	FinPara
	
FinProceso
