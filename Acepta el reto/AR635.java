public class AR635{
	public static void main(String[] args){
		int anyo;
		java.util.Scanner in=new java.util.Scanner(System.in);
		
		int numCasos=in.nextInt();
		for(int i=0;i<numCasos;i++){
			anyo=in.nextInt();
			System.out.println(anyo==0?anyo/100:anyo/100+1);
		}
	} 
}
