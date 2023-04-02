import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Dik Üçgende Hipotenüs Bulan Program
         *
         * Java ile kullanıcıdan dik kenarlarının uzunluğunu alan
         * ve hipotenüsü hesaplayan programı yazın.
         *
         * Ödev
         * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
         *
         * Formül
         * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
         *
         * 𝑢 = (a+b+c) / 2
         *
         * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */

        Scanner scanner = new Scanner(System.in);

        int sideA, sideB;
        double sideC;

        System.out.println("Please enter the first side of a triangle: ");
        sideA = scanner.nextInt();

        System.out.println("Please enter the second side of a triangle: ");
        sideB = scanner.nextInt();

        sideC = Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB,2));

        System.out.println("Hypotenuse :" + sideC);
    }
}
