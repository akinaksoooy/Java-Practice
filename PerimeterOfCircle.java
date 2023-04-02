import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        /**
         * Dairenin Alanını ve Çevresini Hesaplayan Program
         * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve
         * çevresini hesaplayan programı yazın.
         *
         * Alan Formülü : π * r * r;
         *
         * Çevre Formülü : 2 * π * r;
         *
         * Ödev
         * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin
         * alanı bulan programı yazınız.
         *
         * 𝜋 sayısını = 3.14 alınız.
         *
         * Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        double pi = 3.14;
        int radius;
        double area;
        double circumference;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        radius = scanner.nextInt();

        area = pi * radius * radius;
        circumference = 2 * pi * radius;

        result = (pi * (radius*radius) * area) / 360;

        System.out.println("Area :" + area);
        System.out.println("Circumference" + circumference);
        System.out.println("Result is :" + result);

    }
}