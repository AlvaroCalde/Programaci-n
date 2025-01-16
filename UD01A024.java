import java.util.Scanner;
public class UD01A024{
	public static void main(String[] args){
		float num1;
		float num2;
		float num3;
		Scanner teclado=new Scanner(System.in);
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		num3=teclado.nextInt();
		float media=(num1 + num2 + num3)/3;
		System.out.println("La media es " + media);
	}
}