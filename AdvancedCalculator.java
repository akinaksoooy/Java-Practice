import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Sum\n" +
                "2- Minus\n" +
                "3- Times\n" +
                "4- Divison\n" +
                "5- Power\n" +
                "6- Mod\n" +
                "7- Rectangle Area and Field\n" +
                "8- Exit";

        while (true){
            System.out.println(menu);
            System.out.println("Please choose an option: ");
            select = scanner.nextInt();

            if(select == 8){
                break;
            }

            System.out.println("Please enter the first number: ");
            int a = scanner.nextInt();
            System.out.println("Please enter the second number: ");
            int b = scanner.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    division(a,b);
                    break;
                case 5:
                    pow(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    rectangle(a,b);
                    break;
                default:
                    System.out.println("You enter an unvalid number.");
            }
        }

        System.out.println("Goodbye.");

    }
    static int sum (int a, int b){
        int result = a+b;
        System.out.println("The sum is " + result);
        return result;
    }
    static int minus (int a, int b){
        int result = a-b;
        System.out.println("The minus is " + result);
        return a-b;
    }
    static int times (int a, int b){
        int result = a*b;
        System.out.println("The " + a + " times " + b + " is " + result);
        return result;
    }
    static int division (int a, int b){
        if (b == 0){
            System.out.println("Second number must not be zero!");
            return 0;
        }
        int result = a/b;
        System.out.println("The " + a + " division " + b + " is " + result);
        return result;
    }
    static int pow (int a, int b){
        int result = 1;
        for (int i=1; i<=b; i++){
            result *= a;
        }
        System.out.println("The " + a + " power " + b + " is " + result);
        return result;
    }
    static int mod (int a, int b){
        int result = a % b;
        System.out.println("The " + a + " mod " + b + " is " + result);
        return result;
    }
    static void rectangle (int a, int b){
        System.out.println("The area is: " + (2*(a+b)));
        System.out.println("The field is: " + (a*b));
    }

}