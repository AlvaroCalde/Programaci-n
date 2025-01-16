Proceso Ej1
	Definir a,b Como Entero;
	Definir h,area,perimetro Como Real;
	
	Escribir "Introduzca el cateto a: " Sin Saltar;
	Leer a;
	Escribir "Introduzca el cateto b: " Sin Saltar;
	Leer b;
	
	h<-raiz(a^2 + b^2);
	Escribir "La hipotenusa es: ",h;
	
	area<-a*b/2;
	Escribir "El area es: ",area;
	
	perimetro<-a+b+h;
	Escribir "El perímetro es: ",perimetro;
	
FinProceso
