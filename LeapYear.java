import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a year.");
        year = scan.nextInt();

        if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
            System.out.println("The year is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year is a leap year");
        } else
        {
            System.out.println("The year is not a leap year");
        }
    }
}