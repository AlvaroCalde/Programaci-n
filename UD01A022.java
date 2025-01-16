import java.util.Scanner;
public class UD01A022{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int num;
		num=teclado.nextInt();
		int suma=(num*(num + 1))/2;
		System.out.println("La suma es " +suma);
	}
}