public class AR373{
	public static void main(String[] args){
		int n;
		java.util.Scanner in=new java.util.Scanner(System.in);
		
		int numCasos=in.nextInt();
		for(int i=0;i<numCasos;i++){
			n=in.nextInt();
			if(n>2){
				System.out.println(n==2?n*n*n:(n*n*n)-((n-2)*(n-2)*(n-2)));
			}
		}
	}
}