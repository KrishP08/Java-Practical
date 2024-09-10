import java.util.Scanner;

class p1_9 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = A.nextInt();
        A.close();
        int i = 1;
        int j = 1;
        int x = 2;
        for (i = 0; i <= n; i++) {
            int count = 0;

            for (j = 1; j <= x; j++)
                if (x % j == 0)
                    count++;

            if (count == 2)
                System.out.print(x + " ");

            x++;
        }

    }
}
