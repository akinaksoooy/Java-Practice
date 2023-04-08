import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        /*
        Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
        ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
        değilse “mükemmel sayı değildir.”
        ifadelerini ekrana yazan programı Java dilinde yazınız.

        Mükemmel Sayı Nedir ?
        Bir sayının kendisi hariç pozitif tam sayı çarpanları
        (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        int result = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                result += i;
            }
        }
        if (result == number){
            System.out.println(number + " is a perfect number.");
        }
        else{
            System.out.println(number + " is not a perfect number");
        }


    }
}