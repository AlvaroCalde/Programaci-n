Proceso UD03A055
	Definir i,n Como Entero;
	Definir hay5 Como Logico;
	
	hay5<-Falso;
	
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir "Introduzca un n�mero: " Sin Saltar;
		Leer n;
		Si n==5 Entonces
			hay5<-Verdadero;
		FinSi
	FinPara
	Si hay5 Entonces
		Escribir "Has introducido el n�mero 5";
	SiNo
		Escribir "No has introducido el n�mero 5";
	FinSi
	
	
FinProceso
