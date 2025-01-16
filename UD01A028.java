import java.util.Scanner;
public class UD01A028{
	public static void main(String[] args){
		float segundos;
		Scanner teclado=new Scanner(System.in);
		segundos=teclado.nextFloat();
		float horas= segundos/3600;
		float minutos= segundos/60;
		System.out.println("El número de horas es " + horas);
	}
}
	