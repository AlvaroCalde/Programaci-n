Proceso UD03A032
	Definir ang1, ang2, ang3 Como Entero;
	Escribir "Introduzca el primer �ngulo (en grados)" Sin Saltar;
	Leer ang1;
	Escribir "Introduzca el segundo �ngulo (en grados)" Sin Saltar;
	Leer ang2;
	Escribir "Introduzca el tercer �ngulo (en grados)" Sin Saltar;
	Leer ang3;
	
	Si ang1+ang2+ang3=180 Entonces
		Escribir "El tri�ngulo puede ser: rect�ngulo, obtus�ngulo o acut�ngulo";
		Si ang1=90 o ang2=90 o ang3=90 Entonces
			Escribir "Este es rect�ngulo";
		SiNo
			Si ang1>90 o ang2>90 o ang3>90 Entonces
				Escribir "Este es obtus�ngulo";
			SiNo
				Escribir "Este es acut�ngulo";
			FinSi
		FinSi
	SiNo
		Escribir "No es un tri�ngulo";
	FinSi
	
	
FinProceso
