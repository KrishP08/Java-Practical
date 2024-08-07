import java.util.Scanner;
class p3{
	public static void main(String[] args){
	Scanner A=new Scanner(System.in);
	System.out.println("enter a");
	int a=A.nextInt();
	if(a%2==0)
		{System.out.println("given Number is even");}
	else
		{System.out.println("given Number is odd");}
		A.close();
}
}