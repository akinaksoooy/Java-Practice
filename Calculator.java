import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /**
         * A calculator  using the switch-case
         * https://app.patika.dev/courses/java101/pratik-hesap-mak-1
         */

        int n1, n2, select;
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************");
        System.out.println("Welcome to the Simple Calculator made by Akin Aksoy.");
        System.out.println("This program made for understanding the switch case more clearly.");
        System.out.println("**************");

        System.out.println("Please enter the first number: ");
        n1 = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        n2 = scanner.nextInt();


        System.out.println("1-Plus\n2-Minus\n3-Multiply\n4-Division");
        System.out.println("Please choose an operation: ");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Plus is: " + (n1+n2));
                break;
            case 2:
                System.out.println("Minus is: " + (n1-n2));
                break;
            case 3:
                System.out.println("Multiply is: " + (n1*n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Division is :" + (n1/n2));
                }
                else{
                    System.out.println("Please do not enter 0!");
                }
                break;
            default:
                System.out.println("Please choose a number between 1 and 4.");
        }









    }
}