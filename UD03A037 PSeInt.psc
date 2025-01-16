Proceso UD03A037
	Definir nota Como Entero;
	Escribir "Introduce el nota (0-10)" Sin Saltar;
	Leer nota;
	
	Si nota>=0 y nota<=4 Entonces
		Escribir "SUSPENSO";
	SiNo
		Si nota=5 o nota=6 Entonces
			Escribir "APROBADO";
		SiNo
			Si nota=7 o nota=8 Entonces
				Escribir "NOTABLE";
			SiNo
				Escribir "SOBRESALIENTE";
			FinSi
		FinSi
	FinSi
	
FinProceso
