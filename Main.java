import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int)(Math.random() * 100);

        Scanner scan = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while(right < 5){
            System.out.println("Please enter your guess: ");
            selected = scan.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Please enter a number between 0-100");
                if(!isWrong){
                    isWrong = true;
                    System.out.println("If you enter a number not between 0-100 you lose one rigt.");
                }else{
                    System.out.println("Your right is " + (5-(++right)));
                }
                continue;
            }

            if(selected == number){
                System.out.println("Congrats! Your guess is true. Your guess is :" + number );
                isWin = true;
                break;
            }else{
                System.out.println("You guess is wrong.");
                if (selected > number) {
                    System.out.println("Your guess is higher than secret number.");
                }else{
                    System.out.println("Your guess is lower than secret number.");
                }
                wrong[right++] = selected;


                System.out.println("Remaining guess right is :" + (5-right));
            }
        }

        if (!isWin){
            System.out.println("You lose.");
            System.out.println("Your decisions: " + Arrays.toString(wrong));
        }
    }
}