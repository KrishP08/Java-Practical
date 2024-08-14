import java.util.Scanner;
public class p5
{
	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		System.out.println("Enter the size of row and colum for first matrices.");
		int r1=A.nextInt();
		int c1=A.nextInt();
		int sum=0;
		int f[][]=new int[r1][c1];
		System.out.println("Enter your number");
		for(int i=0;i<r1;i++){
		   for(int j=0;j<c1;j++){
		       f[i][j]=A.nextInt();
		   }
		} 
		System.out.println("Enter the size of row and colum for Second matrices.");
		int r2=A.nextInt();
		int c2=A.nextInt();
		int s[][]=new int[r2][c2];
		System.out.println("Enter your number");
		for(int i=0;i<r2;i++){
		   for(int j=0;j<c2;j++){
		       s[i][j]=A.nextInt();
		   }
		} 
		int mux[][]=new int[r1][c2];
		for(int a=0;a<r1;a++){ 
		    for(int b=0;b<c2;b++){
		        for(int k=0;k<r2;k++){
		            sum=sum+f[a][k]*s[k][b];
		        }
		        mux[a][b]=sum;
		        sum=0;
		    }
		}
		System.out.println("multiply of two matrices is");
			for(int i=0;i<r1;i++){
		   for(int j=0;j<c2;j++){
		     System.out.print(mux[i][j]+" ");
		   }
		   System.out.println();
		} 
	}
}
