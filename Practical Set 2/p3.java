import java.util.Scanner;

class p3 {
    public static void main(String[] args) {
        int n[] = new int[5];
        Scanner A = new Scanner(System.in);
        System.out.println("Enter your number");
        for (int i = 0; i < n.length; i++) {
            n[i] = A.nextInt();
        }
        int max = n[0];
        for (int j = 0; j < n.length; j++) {
            if (max < n[j]) {
                max = n[j];
            }
        }
        System.out.println("max number is " + max);
        A.close();
    }
}