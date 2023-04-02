import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        /**
         * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
         *
         * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        int km, age;
        int ticketType;
        double pricePerKm = 0.10;
        double total = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("How many km? ");
        km = scanner.nextInt();

        System.out.println("How old are you? ");
        age = scanner.nextInt();

        total += pricePerKm * km;

        System.out.println("One way or Round trip?");
        System.out.println("1- One way\n2- Round trip");
        ticketType = scanner.nextInt();

        if(ticketType < 1 || ticketType > 2){
            System.out.println("Hatali deger girdiniz.");
        }else{
            if(ticketType == 1){
                if(age < 12){
                    System.out.println("Toddler Discount Price: " + total/2 );
                }
                else if (age >= 12 && age <= 24){
                    total -= total * 0.10;
                    System.out.println("Young Discount Price: " + total);
                }
                else if (age > 65){
                    total -= total * 0.30;
                    System.out.println("Old People Discount Price: " + total);
                }
                else{
                    System.out.println("Price is: " + total);
                }
            }
            else{
                total -= total * 0.20;
                total *= 2;
                if(age < 12){
                    System.out.println("Toddler Discount Price: " + total/2 );
                }
                else if (age >= 12 && age <= 24){
                    total -= total * 0.10;
                    System.out.println("Young Discount Price: " + total);
                }
                else if (age > 65){
                    total -= total * 0.30;
                    System.out.println("Old People Discount Price: " + total);
                }
                else{
                    System.out.println("Price is: " + total);
                }
            }

        }

    }
}