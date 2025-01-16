Proceso UD03A042
	Definir h, min, seg Como Entero;
	Escribir "Introduzca las horas" Sin Saltar;
	Leer h;
	Escribir "Introduzca los minutos" Sin Saltar;
	Leer min;
	Escribir "Introduzca los segundos" Sin Saltar;
	Leer seg;
	
	Mientras h>=0 y h<=23 y min>=0 y min<=59 y seg>=0 y seg<=59 Hacer
		seg<- (h*3600+min*60+seg);
		Escribir seg;
	FinMientras
	
FinProceso
