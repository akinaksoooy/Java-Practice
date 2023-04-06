import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        /**
         * Ödev
         * N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
         * n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
         *
         * Java ile kombinasyon hesaplayan program yazınız.
         *
         * Kombinasyon formülü
         * C(n,r) = n! / (r! * (n-r)!)
         */

        int n, r, result, nTotal = 1, rTotal = 1, nMinusRFactoriel = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the n: ");
        n = scanner.nextInt();
        System.out.println("Please write the r: ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            nTotal = nTotal * i;
        }

        for (int j = 1; j <= r; j++){
            rTotal = rTotal * j;
        }

        for (int z = 1; z <= n-r; z++){
            nMinusRFactoriel = nMinusRFactoriel * z;
        }

        result = nTotal / (rTotal * nMinusRFactoriel);

        System.out.println("The combination result is: " + result);




    }
}