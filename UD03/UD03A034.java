import java.util.Scanner;
public class UD03A034{
	public static void main(String[] args){
		int mes;
		String salida;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el mes (1-12)");
		mes=teclado.nextInt();
		
		salida=switch(mes){
			case 1,3,5,7,8,10,12 -> "31 días";
			case 4,6,9,11 ->"30 días";
			default ->"28 días";
		};
		System.out.println(salida);
	}
}