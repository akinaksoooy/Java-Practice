import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Taksimetre Programı
         * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
         *
         * Taksimetre KM başına 2.20 TL tutmaktadır.
         * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
         * Taksimetre açılış ücreti 10 TL'dir.
         */

        Scanner scanner = new Scanner(System.in);

        double km;
        double pricePerKm = 2.20;
        double kmToPrice;
        int minPrice = 20;
        int taximeterStartPrice = 10;

        System.out.println("Please enter the kilometer: ");
        km = scanner.nextDouble();

        kmToPrice = (km * pricePerKm) + taximeterStartPrice;

        if(kmToPrice < 20){
            System.out.println("Taximeter: " + minPrice);
        }else{
            System.out.println("Taximeter: " + kmToPrice);
        }

    }
}
