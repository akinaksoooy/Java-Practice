import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Vücut Kitle İndeksi Hesaplama
         * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
         * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
         *
         * Formül
         * Kilo (kg) / Boy(m) * Boy(m)
         */

        double weight, length, bmi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your length(m) :");
        length = scanner.nextDouble();
        System.out.println("Enter your weight(kg) :");
        weight = scanner.nextDouble();

        bmi = weight / Math.pow(length,length);
        System.out.println("Your body mass index is: " + bmi);

    }
}