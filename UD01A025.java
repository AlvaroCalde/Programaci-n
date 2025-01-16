import java.util.Scanner;
public class UD01A025{
	public static void main(String[] args){
		float radio;
		float PI= 3.14F;
		Scanner teclado=new Scanner(System.in);
		radio=teclado.nextInt();
		float volumen=(4*PI*radio*radio*radio)/3;
		System.out.println("El volumen es " + volumen);
	}
}