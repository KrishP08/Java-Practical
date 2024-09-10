import java.util.Scanner;

class p2_4 {
    public static void main(String[] args) {
        int n[] = new int[5];
        Scanner A = new Scanner(System.in);
        int ch = 0;
        System.out.println("Enter your number");
        for (int i = 0; i < n.length; i++) {
            n[i] = A.nextInt();
        }
        System.out.println("Enter number you want to find");
        int max = A.nextInt();
        for (int j = 0; j < n.length; j++) {
            if (max == n[j]) {
                System.out.println("the number " + max + " is at " + j + " point");
                ch++;
                break;
            }
        }
        if (ch == 0) {
            System.out.println("the number is not found");
        }
        A.close();
    }
}