/*Realiza el pseudocódigo y la codificación en lenguaje de programación Java de un
algoritmo que declare la constante PI, asignándole el valor 3.14159. A continuación
mostrará por pantalla el área de un círculo de radio 5. Área = π * radio
*/
public class PI{
	public static void main(String[] args){
		float PI=3.14159F;
		int radio=5;
		float Area= PI*(radio*radio);	
			System.out.println(Area);
	}
}