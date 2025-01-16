import java.util.Scanner;
public class UD01A029{
	public static void main(String[] args){
		int bytes;
		Scanner teclado=new Scanner(System.in);
		bytes=teclado.nextInt();
		float bit=bytes*8;
		System.out.println("El número de bits son " + bit);
		float kilobytes=bytes/1024;
		System.out.println("El número de kilobytes son " + kilobytes);
	}
}
		
		