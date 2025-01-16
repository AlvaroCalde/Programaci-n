Proceso UD03A032
	Definir ang1, ang2, ang3 Como Entero;
	Escribir "Introduzca el primer ángulo (en grados)" Sin Saltar;
	Leer ang1;
	Escribir "Introduzca el segundo ángulo (en grados)" Sin Saltar;
	Leer ang2;
	Escribir "Introduzca el tercer ángulo (en grados)" Sin Saltar;
	Leer ang3;
	
	Si ang1+ang2+ang3=180 Entonces
		Escribir "El triángulo puede ser: rectángulo, obtusángulo o acutángulo";
		Si ang1=90 o ang2=90 o ang3=90 Entonces
			Escribir "Este es rectángulo";
		SiNo
			Si ang1>90 o ang2>90 o ang3>90 Entonces
				Escribir "Este es obtusángulo";
			SiNo
				Escribir "Este es acutángulo";
			FinSi
		FinSi
	SiNo
		Escribir "No es un triángulo";
	FinSi
	
	
FinProceso
