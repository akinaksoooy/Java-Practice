import java.util.Scanner;

public class PrimeNumberWithRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi, 2)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }
    public static boolean asalMi(int sayi, int i) {
        if (sayi <= 2) {
            return (sayi == 2) ? true : false;
        }
        if (sayi % i == 0) {
            return false;
        }
        if (i * i > sayi) {
            return true;
        }
        return asalMi(sayi, i + 1);
    }
}