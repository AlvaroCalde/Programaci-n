import java.util.Scanner;
public class UD01A027{
	public static void main(String[] args){
		float peso;
		float altura;
		Scanner teclado=new Scanner(System.in);
		peso=teclado.nextFloat();
		altura=teclado.nextFloat();
		float imc= peso/(altura*altura);
		System.out.println("El imc es " + imc);
	}
}

