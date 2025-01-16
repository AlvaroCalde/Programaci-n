import java.util.Scanner;
public class UD03A011{
	public static void main(String[] args){
		int edad;
		Scanner teclado=new Scanner(System.in);
		edad=teclado.nextInt();
		if (edad>=18){
			System.out.println("Eres mayor de edad");
		}
	}
}