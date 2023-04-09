import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number so i can tell you it is a palindrom or not: ");
        int input = scanner.nextInt();
        System.out.println(isPalindrom(input));
    }
    static boolean isPalindrom(int number){
        int reverseNumber = 0;
        int lastNumber;
        int temp = number;

        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if(number == reverseNumber){
            System.out.println(number + " is a palindrom number.");
            return true;
        }else{
            System.out.println(number + " is not a palindrom number");
            return false;
        }

    }
}