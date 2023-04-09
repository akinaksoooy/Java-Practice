import java.util.Scanner;

public class CreatingMethodAccordingToPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        recursiveIslem(sayi);

    }
    public static void recursiveIslem(int sayi) {
        if (sayi <= 0) {
            System.out.println(sayi);
            sayi += 5;
            System.out.println(sayi);
            recursiveIslem(sayi);
        } else {
            System.out.println(sayi);
        }
    }

}