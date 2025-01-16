/*Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
algoritmo que declare dos variables de tipo entero, inicializadas a un valor cualquiera
cada una de ellas, muestre por pantalla el contenido de las variables, intercambie el
valor de las mismas y muestre por pantalla el contenido de las variables después del
intercambio de valores.
*/
public class EJ9{
	public static void main(String[] args){
		int num1= 2;
		int num2=3;
		int aux;
		System.out.println(num1);
		System.out.println(num2);
		aux=num1;
		num1=num2;
		num2=aux;
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
		