import java.util.Scanner;
public class UD01A026{
	public static void main(String[] args){
		int Celsius;
		Scanner teclado=new Scanner(System.in);
		Celsius=teclado.nextInt();
	    int Fahrenheit=1,8f * Celsius+32;
		System.out.println("La temperatura en Fahrenheit es " + Fahrenheit);
	}
}