import java.util.Arrays;
import java.util.Scanner;

public class ArraysElementSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi kaç elemanlı olacak: ");
        int arrayLength = scanner.nextInt();

        int[] list = new int[arrayLength];

        for (int i = 0; i < list.length; i++){
            System.out.print((i+1) + ". elemanı giriniz: ");
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}