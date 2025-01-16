import java.util.Scanner;
import java.util.StringTokenizer;
public class Prep1A2Examen1{
	public static void main(String[] args){
		Scanner teclado=new Scanner (System.in);
		String frase;
		
		System.out.println("Introduzca una frase: ");
		frase=teclado.nextLine();
		
		StringTokenizer st=new StringTokenizer(frase);
		
        while(st.hasMoreTokens()){
			System.out.println(st.countTokens());
			System.out.println(st.nextToken());
        }
		
	}
}