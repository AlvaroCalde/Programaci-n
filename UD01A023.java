import java.util.Scanner;
public class UD01A023{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		float num1;
		float num2;
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		float cociente= num1/num2;
		System.out.println( "El cociente es " + cociente);
	}
}