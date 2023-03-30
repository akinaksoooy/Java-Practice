import java.util.Scanner;

public class Main {

    /**
     *
     * Not Ortalaması Hesaplayan Program
     * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
     *
     * Ödev
     * Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
     *
     * Not : If ve Else kullanılmayacak.
     */
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik, ortalama;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce = scanner.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();

        System.out.println("Muzik notunuzu giriniz: ");
        muzik = scanner.nextInt();

        ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("ORTALAMANIZ: " + ortalama);

        System.out.println(ortalama > 60 ? "Geçtiniz" : "Kaldiniz");

    }
}
