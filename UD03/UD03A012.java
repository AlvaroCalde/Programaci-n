import java.util.Scanner;
public class UD03A012{
	public static void main(String[] args){
		int numero;
		Scanner teclado=new Scanner(System.in);
		numero=teclado.nextInt();
		if(numero<0){
			numero=-numero;
			}
		System.out.println(numero);
	}
}
		