import java.util.Scanner;

class p10 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = A.nextInt();
        int r = n;
        System.out.println("int value : " + r);
        long s = r;
        System.out.println("long value : " + s);
        float t = s;
        System.out.println("float value : " + t);
        A.close();
    }
}