import java.util.Scanner;
public class UD01A0210{
	public static void main(String[] args){
		int numeroEntero;
		int digito1,digito2;
		int nuevoEntero;
		Scanner teclado=new Scanner(System.in);
		numeroEntero=teclado.nextInt();
		
		digito1=numeroEntero/10 ;
		digito2=numeroEntero%10 ;
		nuevoEntero=digito2*10+digito1;
		
		System.out.println(nuevoEntero);
		
	}
}
		