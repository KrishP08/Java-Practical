import java.util.Scanner;

public class p1_7 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = A.nextInt();
        A.close();
        int i;
        int b=1;
        for(i=1;i<=n;i++){    
            b=b*i;    
        }    
        System.out.println("Factorial of "+n+" is: "+b); 

    }
}
