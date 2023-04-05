import java.util.Scanner;

public class PowerOf4and5 {
    public static void main(String[] args) {
        /**
         * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini
         * ekrana yazdıran programı yazıyoruz.
         */

        int input;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number.");
        input = scanner.nextInt();

        for (int i = 1, j = 1; i < input && j < input; i*=4, j*=5){
            System.out.println(i + "   " + j);
        }




    }
}