import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {
        /**
         * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         * eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
         * ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
         * şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
         * sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        String username,password;
        int yesOrno;
        String newPassword;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your username:");
        username = scanner.nextLine();

        System.out.println("Please enter your password:");
        password = scanner.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Your informations are true.");
        }else{
            System.out.println("Your informations are false.");
            System.out.println("Do you want to change your password.");
            System.out.println("1-Yes\n2-No");
            yesOrno = scanner.nextInt();

            if(yesOrno == 1){
                System.out.println("Please enter your new password.");
                newPassword = scanner.next();

                if(newPassword.equals(password) || newPassword.equals("java123")){
                    System.out.println("Password can not created. Please choose other password.");
                }else{
                    System.out.println("Password successfully created.");
                }

            }else{
                System.out.println("You can not enter because your password is false.");
            }
        }

    }
}