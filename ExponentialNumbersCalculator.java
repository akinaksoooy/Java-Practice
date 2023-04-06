import java.util.Scanner;

public class ExponentialNumbersCalculator {
    public static void main(String[] args) {
        /**
         * Ödev
         *
         * Java ile kullanıcının girdiği değerler
         * ile üslü sayı hesaplayan programı
         * "For Döngüsü" kullanarak yapınız.
         */

        int number, powNumber, total = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        number = scanner.nextInt();
        System.out.println("Please enter the power number: ");
        powNumber = scanner.nextInt();

        for (int i = 1; i <= powNumber; i++){

            total = total * number;

        }
        System.out.println(total);

    }
}