import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci serisi: ");

        if (n >= 1) {
            System.out.print(a + " ");
        }

        if (n >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}