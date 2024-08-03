import java.util.Scanner;
public class p6 {
    public static void main(String[] args){
        Scanner A=new Scanner(System.in);
        System.out.println("Entet a number2");
        int a=A.nextInt();
        System.out.println("Entet b number");
        int b=A.nextInt();
    
        System.out.println("sum="+(a+b));
        System.out.println("sub="+(a-b));
        System.out.println("mux="+(a*b));
        System.out.println("div="+(a/b));
        System.out.println("%="+(a%b));   
}
}