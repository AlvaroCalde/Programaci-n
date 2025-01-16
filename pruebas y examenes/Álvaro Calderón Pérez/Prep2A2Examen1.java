import java.util.Scanner;
import java.util.StringTokenizer;
public class Prep2A2Examen1{
	public static void main(String[] args){
		String mensaje;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el mensaje: ");
		mensaje=teclado.nextLine();
		
		StringTokenizer palabra=new StringTokenizer(mensaje);
		while(palabra.hasMoreTokens()){
			if(palabra.equals("#")){
				System.out.println(palabra);
			}
			palabra.nextToken();
			
        }
	}
}