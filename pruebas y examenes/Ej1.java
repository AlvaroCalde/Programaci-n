import java.util.Scanner;
public class Ej1{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int a,b;
		float h,A,P;
		
		System.out.println("Introduzca el cateto a: ");
		a=teclado.nextInt();
		System.out.println("Introduzca el cateto b: ");
		b=teclado.nextInt();
		
		h=float Math.sqrt(a*a + b*b);
		System.out.println("Hipotenusa: "+h);
		
		A=a*b/2;
		System.out.println("Área: "+A);
		
		P=a+b+h;
		System.out.println("Perímetro: "+P);
	}
}