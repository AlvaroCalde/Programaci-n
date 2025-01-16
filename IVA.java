/*Realiza el pseudocódigo y la codificación en lenguaje de programación Java de una
algoritmo que declare la constante IVA, asignándole el valor 21. Declara la variable
precioBruto, asignándole un valor cualquiera. Mostrará por pantalla el precio neto (sin
IVA) y el IVA de un producto cuyo precio bruto es el asignado a la variable
precioBruto. Ejemplo de salida para precioBruto = 1000: 
*/
public class IVA{
	public static void main(String[] args){
		final float IVA= 0.21F;
		float precioBruto= 100.0F;
		float precioNeto= precioBruto/(1+IVA);
		System.out.println(precioNeto);
	}
}