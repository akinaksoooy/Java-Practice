public class PrimeNumber {
    public static void main(String[] args) {

        int sayi;
        boolean asal;
        for (int i = 2; i <= 100; i++) {
            sayi = i;
            asal = true;
            for (int j = 2; j <= sayi / 2; j++) {
                if (sayi % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.println(sayi);
            }
        }
    }
}