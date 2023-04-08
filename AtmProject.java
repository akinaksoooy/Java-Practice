import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        double balance = 1500;
        int select;

        while(right > 0){
            System.out.print("Your username: ");
            userName = input.nextLine();
            System.out.print("Your password: ");
            password  = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Hello. Welcome to the JAVA BANK.");

                do {
                    System.out.println(
                            "1- Deposit\n" +
                            "2- Withdraw\n" +
                            "3- Check balance.\n" +
                            "4- Exit");
                    System.out.print("Please select and option: ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("How much cash do you want to deposit: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("How much cash do you want to withdraw: ");
                            price = input.nextInt();
                            if(price > balance){
                                System.out.println("Balance is not enough.");
                            }else{
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("You balance is: " + balance);
                            break;
                    }

                }while(select != 4);{
                    System.out.println("Goodbye.");
                }
                break;

            }else{
                right--;
                System.out.println("Wrong username or password.");
                if (right == 0){
                    System.out.println("Your account has been blocked.");
                }else{
                    System.out.println("Remaining try: " + right);
                }

            }
        }
    }
}