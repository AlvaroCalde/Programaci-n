Proceso UD03A052
	Definir num Como Entero;
	Definir contador Como Entero;
	
	Escribir "Introduzca entero (1-10)" Sin Saltar;
	Leer num;
	
	Mientras num<1 o num>10 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca entero (1-10)" Sin Saltar;
		Leer num;
	FinMientras
	
	Para contador<- 1 Hasta 1 Con Paso 1 Hacer
		Escribir num,"*1=",num*1;
		Escribir num,"*1=",num*2;
		Escribir num,"*1=",num*4;
		Escribir num,"*1=",num*5;
		Escribir num,"*1=",num*6;
		Escribir num,"*1=",num*7;
		Escribir num,"*1=",num*8;
		Escribir num,"*9=",num*9;
		Escribir num,"*10=",num*10;
	FinPara
	
	
	
	
FinProceso
