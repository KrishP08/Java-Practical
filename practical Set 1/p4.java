import java.util.Scanner;
class p4{
	public static void main(String[] args){
	Scanner A=new Scanner(System.in);
	System.out.println("Enter your op no");
	System.out.println("1.sum,2.sub,3.mux,4.div");
	int n=A.nextInt();
	int a=10,b=5;
	switch (n){
	case 1:
	System.out.println("sum="+(a+b));
	break;
	case 2:
	System.out.println("sub="+(a-b));
	break;
	case 3:
	System.out.println("mux="+(a*b));
	break;
	case 4:
	System.out.println("div="+(a/b));
	break;
	default:
	System.out.println("enter right num");
	break;
}
}
}