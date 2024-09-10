import java.util.Scanner;

class p1_5 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = A.nextInt();
        int b = A.nextInt();
        int c = A.nextInt();
        if(a>b && a>c){
            System.out.println("number A is max");
        }
        else if(b>c){
            System.out.println("number B is max");
        }
        else{
            System.out.println("number C is max");
        }
        A.close();
    }
}
