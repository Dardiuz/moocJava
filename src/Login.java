
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username1 = "emma";
        String username2 = "alex";

        String password1 = "sunshine";
        String password2 = "haskell";

        System.out.println("Enter username:");
        String input1 = scanner.nextLine();

        System.out.println("Enter password:");
        String input2 = scanner.nextLine();

        if(input1.equals(username1) && input2.equals(password1) || input1.equals(username2) && input2.equals(password2)){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
//
}
