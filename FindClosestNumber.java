import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindClosestNumber {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner scanner = new Scanner(System.in);

        System.out.println(Arrays.toString(list));

        System.out.println("Please enter a number.");
        int input = scanner.nextInt();
        int min = input;
        int max = input;

        Arrays.sort(list);
        for (int i : list){
            if(i > input){
                max = i;
                break;
            }
        }

        for (int j = list.length-1; j > 0; j--){
            if(list[j] < input){
                min = list[j];
                break;
            }
        }
    }
}