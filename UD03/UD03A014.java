import java.util.Scanner;
public class UD03A014{
	public static void main(String[] args){
		float num1, num2;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el primer número: ");
		num1=teclado.nextFloat();
		System.out.println("Introduzca el segundo número: ");
		num2=teclado.nextFloat();
		
		if(num1>0 && num2>0){
			System.out.println((num1+num2)/2.0f);
		}
	}
}