Proceso UD03A045
	Definir num, contador, acumulador, contadorP,contadorN,contadorNul Como Entero;
	
	contador<-0;
	contadorN<-0;
	contadorNul<-0;
	contadorP<-0;
	acumulador<-0;
	
	Repetir
		Escribir "Introduzca un número" Sin Saltar;
		Leer num;
		acumulador<-acumulador+num;
		contador<-contador+1;
			Si num<0 Entonces
				contadorN<-contadorN+1;
			SiNo
				Si num==0 Entonces
					contadorNul<-contadorNul+1;
				SiNo
					contadorP<-contadorP+1;
				FinSi
			FinSi
	Hasta Que acumulador>=100
	
	Escribir "Numeros negativos: ",contadorN;
	Escribir "Numeros nulos: ",contadorNul;
	Escribir "Numeros positivos: ",contadorP;
	Escribir "La media es: ",acumulador/contador;
	
	
FinProceso
