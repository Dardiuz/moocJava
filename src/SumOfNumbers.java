
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.println("Give a number:");

            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                System.out.println("Sum of the numbers: " + count);
                break;
            }
            if (input != 0 ) {
                count = count + input;
            }
            System.out.println(input);
        }
    }
}