
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int total = 0;

        while (true) {

            System.out.println("Give a number:");

            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                System.out.println("Number of negative numbers: " + count);
                break;
            }
            if (input != 0 ) {
                count = count + 1;
            }
            System.out.println(input);
        }
    }
}

