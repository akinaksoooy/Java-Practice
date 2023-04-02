import java.util.Scanner;

public class AverageCalculation2 {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce = scanner.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();

        System.out.println("Muzik notunuzu giriniz: ");
        muzik = scanner.nextInt();

        double avarage = (mat+fizik+turkce+kimya+muzik) / 5;

        if (mat < 0 || mat > 100){
            mat = 0;
        } else if (fizik < 0 || fizik > 100){
            fizik = 0;
        } else if (turkce < 0 || turkce > 100) {
            turkce = 0;
        } else if (kimya < 0 || kimya > 100 ) {
            kimya = 0;
        } else if (muzik < 0 || muzik > 100) {
            muzik = 0;
        } else {
            if(avarage <= 55){
                System.out.println("Sınıfta kaldiniz. Seneye görüşürüz.");
                System.out.println("Ortalamaniz: " + avarage);
            }else{
                System.out.println("Tebrikler sınıfı geçtiniz.");
                System.out.println("Ortalamaniz: " + avarage);
            }
        }

    }
}