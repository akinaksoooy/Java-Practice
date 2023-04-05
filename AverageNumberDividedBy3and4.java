import java.util.Scanner;

public class AverageNumberDividedBy3and4 {
    public static void main(String[] args) {
        /**
         * Ödev
         * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
         * 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */

        int number, total = 0, counter = 0, average;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number.");
        number = scanner.nextInt();

        for (int i=1; i<=number; i++  ){
            if(i%3 == 0 && i%4 == 0){
                total += i;
                counter += 1;

            }
        }

        if(counter > 0){
            average = total/counter;
            System.out.println("The sum is: " + average);
        }else{
            System.out.println("Please enter a proper number.");
        }

    }
}