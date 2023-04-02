import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tax = 0.18;
        double price;

        System.out.println("Enter the price: ");
        price = scanner.nextDouble();

        System.out.println("Price without tax: " + price);

        double priceWithTax = (price * tax) + price;
        System.out.println("Price with tax: " + priceWithTax);

        double taxPrice = price * tax;
        System.out.println("Tax : " + taxPrice);

    }

}
