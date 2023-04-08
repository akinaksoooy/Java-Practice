import java.util.Scanner;

public class GcdLcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min;
        int max;
        int ebob = 1;
        int i = 1;

        System.out.print("Please enter the n1: ");
        int n1 = input.nextInt();
        System.out.print("Please enter the n2: ");
        int n2 = input.nextInt();

        if (n1<n2){
            min = n1;
            max = n2;
        }
        else{
            max = n1;
            min = n2;
        }

        while(i <= min){
            if(min % i == 0 && max % i == 0){
                ebob = i;
            }
            i++;
        }

        int ekok = (n1*n2) / ebob;

        System.out.println("GCD is: " + ebob);
        System.out.println("LCD is: " + ekok);

    }
}