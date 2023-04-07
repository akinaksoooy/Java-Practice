import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = scanner.nextInt();
        double result = 0;

        for (double i = 1; i <= n; i++){
            result += (1/i);
        }

        System.out.println("The harmonic number is: " + result);


    }
}