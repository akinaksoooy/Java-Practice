import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String[] args) {
        /*
        Java ile klavyeden girilen N tane sayma sayısından en büyük
        ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı girmek istiyorsunuz? ");
        int numCount = input.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= numCount; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Girdiğiniz sayılar arasında en büyük sayı: " + max);
        System.out.println("Girdiğiniz sayılar arasında en küçük sayı: " + min);

        input.close();
    }

}