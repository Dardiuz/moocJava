
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int input = Integer.parseInt(scanner.nextLine());

        int sum = 1;

        for(int i = 1; i <= input; i++){
            sum *= i;
        }
        System.out.println(sum);

    }
}
