import java.util.Scanner;

public class PowerWithRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs giriniz: ");
        int us = scanner.nextInt();

        int sonuc = usAl(taban, us);
        System.out.println(taban + " üzeri " + us + " = " + sonuc);

    }
    public static int usAl(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usAl(taban, us - 1);
        }
    }
}