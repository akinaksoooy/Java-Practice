import java.util.Scanner;

public class ArmstrongNumberFinder {
    public static void main(String[] args) {

        /*
        The logic of how to find digits of the given number.
         2451 / 10 = 245
         245 / 10 = 24
         24 / 10 = 2
         2 / 10 = 0
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow ;

        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        /*
        The logic of how to find the last digit.
        2451 % 10 = 1
        245 % 10 = 5
        24 % 10 = 4
        */

        tempNumber = number;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            for(int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number){
            System.out.println(number + " sayisi Armstrong sayidir.");
        }else{
            System.out.println(number + " sayisi Armstrong sayi degildir.");
        }

    }
}