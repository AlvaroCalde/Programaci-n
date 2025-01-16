import java.util.Scanner;
public class UD03A021{
	public static void main(String[] args){
		int num1, num2;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el primer número");
		num1=teclado.nextInt();
		System.out.println("Introduzca el segundo número");
		num2=teclado.nextInt();
		
		if (num1>num2){
			System.out.println(num1);
		else System.out.println(num2);
		}
	}
}