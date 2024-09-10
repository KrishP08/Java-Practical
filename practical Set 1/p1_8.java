import java.util.Scanner;

class p1_8 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = A.nextInt();
        int sum = 0;
        while (n > 0) {
            int rev = n % 10;
            sum = sum * 10 + rev;
            n = n / 10;
        }
        System.out.println("reverse number is " + sum);
        A.close();
    }
}