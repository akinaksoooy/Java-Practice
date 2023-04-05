import java.util.Scanner;

public class EvenNumbersAndMultiplesOf4 {
    public static void main(String[] args) {
        /**
         *Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
         *ve girilen değerlerden çift
         *ve 4'ün katları olan sayıları toplayıp
         *ekrana basan programı yazıyoruz.
         */

        int input, total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Please enter a number.");
            input = scan.nextInt();

            if(input %2 == 0 && input %4 == 0){
                total += input;
            }

        }while (input %2 == 0 );

        System.out.println(total);

    }
}