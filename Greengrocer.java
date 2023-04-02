import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {
        /**
         * Manav Kasa Programı
         * Java ile kullanıcıların manavdan almış oldukları ürünlerin
         * kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
         *
         * Meyveler ve KG Fiyatları
         *
         * Armut : 2,14 TL
         * Elma : 3,67 TL
         * Domates : 1,11 TL
         * Muz: 0,95 TL
         * Patlıcan : 5,00 TL
         */

        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;
        double totalPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many kg of pears? ");
        pear *= scanner.nextDouble();
        System.out.println("How many kg of apples? ");
        apple *= scanner.nextDouble();
        System.out.println("How many kg of tomato? ");
        tomato *= scanner.nextDouble();
        System.out.println("How many kg of banana? ");
        banana *= scanner.nextDouble();
        System.out.println("How many kg of eggplant? ");
        eggplant *= scanner.nextDouble();

       totalPrice = pear + apple + tomato + banana + eggplant;
        System.out.println("Total price is: " + totalPrice);

    }
}