Proceso Ej2
	Definir n,aux,contador,cifra,acumulador Como Entero;
	contador<-0;
	
	
	Mientras contador<>3 Hacer
		Escribir "Introduzca un entero positivo: " Sin Saltar;
		Leer n;
		aux<-n;
		Mientras n<=0 Hacer
			Escribir "Introduzca un entero positivo: " Sin Saltar;
			Leer n;
		FinMientras
		Si n>0 Entonces
			acumulador<-0;
			Mientras n<>0 Hacer
				cifra<-n%10;
				acumulador<-acumulador+cifra;
				n<-trunc(n/10);
			FinMientras
			Si aux%acumulador=0 Entonces
				contador<-contador+1;
				Escribir "ES NÚMERO DE HARSHAD";
			SiNo
				Escribir "NO ES NÚMERO DE HARSHAD";
			FinSi
		SiNo
			Escribir "ERROR EN LA ENTRADA";
		FinSi
	FinMientras
	
FinProceso
