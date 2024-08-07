import java.util.Scanner;

class p2 {
    public static void main(String[] args) {
        int n[] = new int[5];
        Scanner A = new Scanner(System.in);
        System.out.println("Enter your number");
        for (int i = 0; i < n.length; i++) {
            n[i] = A.nextInt();
        }
        for (int j = 0; j < n.length; j++) {
            System.out.println(n[j]);
        }
        A.close();
    }
}