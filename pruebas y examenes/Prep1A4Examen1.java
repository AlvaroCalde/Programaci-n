import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Prep1A4Examen1{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		float mediana;
		int[] vector;
		vector=new int[10];
		Random aleatorio=new Random();
		vector=aleatorio.nextInt(101);
		System.out.println(vector);
		Arrays.sort(vector);	
	}
}