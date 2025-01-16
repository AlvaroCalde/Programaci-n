Proceso UD03A026
	Definir h,m,s Como Entero;
	Escribir "Escriba las horas" Sin Saltar;
	Leer h;
	Escribir "Escriba los minutos" Sin Saltar;
	Leer m;
	Escribir "Escriba las segundos" Sin Saltar;
	Leer s;
	
	Si h<=23 y h>=0 y m<=59 y m>=0 y s<=59 y s>=0 Entonces
		Escribir "Es una hora correcta";
	SiNo
		Escribir  "Es una hora incorrecta";
	FinSi
FinProceso
