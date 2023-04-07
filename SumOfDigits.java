import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int number;
        int result = 0;
        int digitValue;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = scanner.nextInt();

        while (number != 0){
            digitValue = number % 10;
            result += digitValue;
            number /= 10;
        }
        System.out.println(result);
    }
}